package britanico.kira.Controller;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import britanico.kira.Services.PS_CLASS_ATTENDNCE_Service;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/wsmatriculaPRD")
public class wsmatriculaPRD_Asistencia {

    @Autowired
    public PS_CLASS_ATTENDNCE_Service classAttendnceService;

    @GetMapping
    public ResponseEntity<List<PS_CLASS_ATTENDNCE>> getAssistanceClass(String code_alumno) {
        List<PS_CLASS_ATTENDNCE> listado = classAttendnceService.obtenerClases("4564");
        return ResponseEntity.ok(listado);
    }
}
