package britanico.kira.Controller;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import britanico.kira.Services.PS_CLASS_ATTENDNCE_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wsmatriculaPRD")
public class wsmatriculaPRD_Asistencia {

    @Autowired
    public PS_CLASS_ATTENDNCE_Service classAttendnceService;

    @GetMapping
    public ResponseEntity<List<PS_CLASS_ATTENDNCE>> getAssistanceClass(String cod_alumno, String strm, int clase) {
        List<PS_CLASS_ATTENDNCE> listado = classAttendnceService.obtenerClases(cod_alumno, strm, clase);
        listado.stream().forEach(System.out::println);
        return new ResponseEntity<>(listado, HttpStatus.OK);
    }
}
