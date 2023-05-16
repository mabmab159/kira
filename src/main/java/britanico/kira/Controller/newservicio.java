package britanico.kira.Controller;

import britanico.kira.Services.PS_LVF_EST_CUR_EQU_Service;
import britanico.kira.Services.PS_LVF_PARAM_GENER_Service;
import britanico.kira.Services.PS_STDNT_ENRL_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/newservicio")
public class newservicio {
    public PS_STDNT_ENRL_Service psStdntEnrlService;
    public PS_LVF_PARAM_GENER_Service psLvfParamGenerService;
    public PS_LVF_EST_CUR_EQU_Service psLvfEstCurEquService;

    @Autowired
    public newservicio(PS_STDNT_ENRL_Service psStdntEnrlService, PS_LVF_PARAM_GENER_Service psLvfParamGenerService, PS_LVF_EST_CUR_EQU_Service psLvfEstCurEquService) {
        this.psStdntEnrlService = psStdntEnrlService;
        this.psLvfParamGenerService = psLvfParamGenerService;
        this.psLvfEstCurEquService = psLvfEstCurEquService;
    }

    public newservicio(PS_STDNT_ENRL_Service psStdntEnrlService) {
        this.psStdntEnrlService = psStdntEnrlService;
    }

    @GetMapping("/{cod_alumno}")
    public ResponseEntity<String> getEstado(@PathVariable("cod_alumno") String cod_alumno) {
        return new ResponseEntity<>(psStdntEnrlService.getConteo(cod_alumno), HttpStatus.OK);
    }

    @GetMapping("/{institution}/{acad_career}/{emplid}")
    public ResponseEntity<String> getEstado(@PathVariable("institution") String institution, @PathVariable("acad_career") String acad_career, @PathVariable("emplid") String emplid) {
        String rastreo = "";
        /*return new ResponseEntity<>(psStdntEnrlService.validarRepitencia(institution, acad_career, emplid),
         HttpStatus.OK);
        return new ResponseEntity<>(psLvfParamGenerService.lastPlacement(emplid,
                psLvfParamGenerService.months()), HttpStatus.OK);*/

        /*
        Logica de alumno nuevo
        No existe nota anterior ni placement
         */
        if (psLvfParamGenerService.lastCourseNoFDA(institution, emplid, "6").size() == 0 && psLvfParamGenerService.lastPlacement(emplid, "6") == null) {
            rastreo += " Ingreso 1 |";
        }
        for (String clase : psStdntEnrlService.initialCourses(institution, acad_career, emplid)) {
            //%This.InsertarClases(&CRSE_ID, &GRADO, &EMPLID, &pDatetime, &UBICACION, &pMeses_Discontinuidad, &F_MAX_Ultima_Inscripcion, "R");

            //&Cursos_equivalentes = GetSQL(SQL.BRT_WS_CURSOS_EQUIVALENTES_01, &CRSE_ID, &CRSE_ID_EQUIVALENTE);
            //While &Cursos_equivalentes.Fetch(&CRSE_ID_EQUIVALENTE)
            for (String clase_equivalente : psLvfEstCurEquService.equivalentCourses(clase)) {
                System.out.println(clase_equivalente);
            }
            //%This.InsertarClases(&CRSE_ID_EQUIVALENTE, &GRADO, &EMPLID, &pDatetime, &UBICACION, &pMeses_Discontinuidad, &F_MAX_Ultima_Inscripcion, "R");
            //End-While;
        }
        System.out.println("rastreo: " + rastreo);
        return new ResponseEntity<>("asd", HttpStatus.OK);
        //return new ResponseEntity<>(psStdntEnrlService.initialCourses(institution, acad_career, emplid), HttpStatus.OK);

        //return new ResponseEntity<>(psLvfParamGenerService.lastCourseNoFDA(institution, emplid, "6"), HttpStatus.OK);
    }
}
