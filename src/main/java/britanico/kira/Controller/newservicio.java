package britanico.kira.Controller;

import britanico.kira.Models.PS_CLASS_TBL;
import britanico.kira.Models.PS_STDNT_ENRL;
import britanico.kira.Services.PS_CLASS_TBL_Service;
import britanico.kira.Services.PS_LVF_EST_CUR_EQU_Service;
import britanico.kira.Services.PS_LVF_PARAM_GENER_Service;
import britanico.kira.Services.PS_STDNT_ENRL_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/newservicio")
public class newservicio {
    public PS_STDNT_ENRL_Service psStdntEnrlService;
    public PS_LVF_PARAM_GENER_Service psLvfParamGenerService;
    public PS_LVF_EST_CUR_EQU_Service psLvfEstCurEquService;
    public PS_CLASS_TBL_Service psClassTblService;

    @Autowired
    public newservicio(PS_STDNT_ENRL_Service psStdntEnrlService, PS_LVF_PARAM_GENER_Service psLvfParamGenerService,
                       PS_LVF_EST_CUR_EQU_Service psLvfEstCurEquService, PS_CLASS_TBL_Service psClassTblService) {
        this.psStdntEnrlService = psStdntEnrlService;
        this.psLvfParamGenerService = psLvfParamGenerService;
        this.psLvfEstCurEquService = psLvfEstCurEquService;
        this.psClassTblService = psClassTblService;
    }

    @GetMapping("/clase_recomendada/{emplid}")
    public ResponseEntity<List<Object>> getRecommendation(
            @PathVariable("emplid")
            String emplid) {
        List<PS_STDNT_ENRL> listado = psStdntEnrlService.getObtenerClasesAnteriores(emplid);
        List<PS_STDNT_ENRL> clasesAprobadas =
                listado.stream().filter(p -> Pattern.matches("[0-9]*", p.CRSE_GRADE_OFF))
                        .filter(p -> Integer.parseInt(p.CRSE_GRADE_OFF) >= 70).collect(
                                Collectors.toList());
        PS_STDNT_ENRL ultimaClase = listado.get(listado.size() - 1);
        PS_STDNT_ENRL ultimaClaseAprobada = clasesAprobadas.get(clasesAprobadas.size() - 1);
        int anioUltimaClase = Integer.parseInt(ultimaClase.psStdntEnrlId.STRM);
        int mesUltimaClase = (int) (ultimaClase.SESSION_CODE.charAt(0)) - 64;
        int mesMaximoRecomendar = mesUltimaClase + 5 > 12 ? mesUltimaClase + 5 : mesUltimaClase - 7;
        int anioMaximoRecomendar = mesUltimaClase + 5 > 12 ? anioUltimaClase + 1 : anioUltimaClase;
        LocalDate fechaActual = LocalDate.now();
        String sesionRecomendar = "";
        PS_CLASS_TBL fechaUltimaClaseAprobada = psClassTblService.getPsClassTbl(ultimaClaseAprobada.psStdntEnrlId.STRM,
                ultimaClaseAprobada.psStdntEnrlId.CLASS_NBR);
        if ((fechaActual.getMonthValue() <= mesMaximoRecomendar && fechaActual.getYear() == anioMaximoRecomendar) ||
                fechaActual.getYear() <= anioMaximoRecomendar) {
            sesionRecomendar = (char) (fechaActual.getMonthValue() + 64) + ultimaClase.SESSION_CODE.substring(1);
            List<String> cursosRecomendar = new ArrayList<>();

        }
        /*return new ResponseEntity<>(psClassTblService.listadoDeClasesRecomendar(sesionRecomendar,
                String.valueOf(anioMaximoRecomendar)),
                HttpStatus.OK);*/
        return new ResponseEntity<>(psLvfEstCurEquService.test(), HttpStatus.OK);
    }

    @GetMapping("/{institution}/{acad_career}/{emplid}")
    public ResponseEntity<String> getEstado(
            @PathVariable("institution")
            String institution,
            @PathVariable("acad_career")
            String acad_career,
            @PathVariable("emplid")
            String emplid) {
        String rastreo = "";
        String meses_discontinuidad = psLvfParamGenerService.monthsDiscontinuity();
        LocalDate localDate = LocalDate.now();
        //Logica de alumno nuevo. No existe nota anterior ni placement
        if (psLvfParamGenerService.lastCourseNoFDA(institution, emplid, "6").size() == 0 &&
                psLvfParamGenerService.lastPlacement(emplid, meses_discontinuidad) == null) {
            rastreo += " Ingreso 1 |";
            for (String clase : psStdntEnrlService.initialCourses(institution, acad_career, emplid)) {
                listarClases(clase, acad_career, emplid, localDate, "asd", meses_discontinuidad,
                        "R", "R");
                for (String clase_equivalente : psLvfEstCurEquService.equivalentCourses(clase)) {
                    listarClases(clase_equivalente, acad_career, emplid, localDate, "asd",
                            meses_discontinuidad,
                            "R", "R");
                }
            }
        }
        System.out.println("rastreo: " + rastreo);
        return new ResponseEntity<>("asd", HttpStatus.OK);
    }


    private void listarClases(String crse_id, String grado, String emplID, LocalDate datetime, String Ubicacion,
                              String p_mesesdiscontinuidad, String F_MAX_ultima_inscripcion, String tipo) {
        //Aun no hacer nada para el listado correspondiente.
    }
}
