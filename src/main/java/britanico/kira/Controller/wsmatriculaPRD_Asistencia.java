package britanico.kira.Controller;

import britanico.kira.Models_Aux.*;
import britanico.kira.Services.PS_CLASS_ATTENDNCE_Service;
import britanico.kira.Services.PS_CLASS_ATTRIBUTE_Service;
import britanico.kira.Services.PS_CLASS_TBL_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wsmatriculaPRD")
public class wsmatriculaPRD_Asistencia {

    public PS_CLASS_ATTENDNCE_Service psClassAttendnceService;

    public PS_CLASS_TBL_Service psClassTblService;

    public PS_CLASS_ATTRIBUTE_Service psClassAttributeService;

    @Autowired
    public wsmatriculaPRD_Asistencia(PS_CLASS_ATTENDNCE_Service psClassAttendnceService,
                                     PS_CLASS_TBL_Service psClassTblService, PS_CLASS_ATTRIBUTE_Service psClassAttributeService) {
        this.psClassAttendnceService = psClassAttendnceService;
        this.psClassTblService = psClassTblService;
        this.psClassAttributeService = psClassAttributeService;
    }

    @GetMapping("{cod_alumno}/{strm}/{clase}")
    public ResponseEntity<detalleAsistencias> getAssistanceClass(@PathVariable String cod_alumno, @PathVariable String strm,
                                                                 @PathVariable int clase) {
        detalleAsistencias detalleAsistencias = new detalleAsistencias();
        detalleAsistencias.setFechas(Fechas.convertirFecha(psClassAttendnceService.obtenerClases(cod_alumno, strm,
                clase)));
        detalleAsistencias.setClase(Clase.convertirClase(psClassTblService.getPsClassTbl(strm, clase),
                psClassAttendnceService.obtenerClases(cod_alumno, strm, clase),
                psClassAttributeService.obtenerClase(strm, clase)));
        return new ResponseEntity<>(detalleAsistencias, HttpStatus.OK);
    }
}
