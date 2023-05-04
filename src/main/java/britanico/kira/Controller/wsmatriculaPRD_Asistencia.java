package britanico.kira.Controller;

import britanico.kira.Models.*;
import britanico.kira.Models_Aux.*;
import britanico.kira.Services.PS_CLASS_ATTENDNCE_Service;
import britanico.kira.Services.PS_CLASS_TBL_Service;
import britanico.kira.Utils.ListarAsistencias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/wsmatriculaPRD")
public class wsmatriculaPRD_Asistencia {

    public PS_CLASS_ATTENDNCE_Service psClassAttendnceService;

    public PS_CLASS_TBL_Service psClassTblService;

    @Autowired
    public wsmatriculaPRD_Asistencia(PS_CLASS_ATTENDNCE_Service psClassAttendnceService, PS_CLASS_TBL_Service psClassTblService) {
        this.psClassAttendnceService = psClassAttendnceService;
        this.psClassTblService = psClassTblService;
    }

    @GetMapping("{cod_alumno}/{strm}/{clase}")
    public ResponseEntity<Detalle_Asistencias> getAssistanceClass(@PathVariable String cod_alumno, @PathVariable String strm,
                                                                  @PathVariable int clase) {
        Detalle_Asistencias detalleAsistencias = new Detalle_Asistencias();
        Clase clase1 = new Clase().convertirClase(psClassTblService.getPsClassTbl(strm, clase),
                psClassAttendnceService.obtenerClases(cod_alumno, strm, clase));
        detalleAsistencias.setCode(0);
        detalleAsistencias.setNum_anios(1);
        //detalleAsistencias.setFechas();
        detalleAsistencias.setClase(clase1);
        return new ResponseEntity<>(detalleAsistencias, HttpStatus.OK);
    }


}
