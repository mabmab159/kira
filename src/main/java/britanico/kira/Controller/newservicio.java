package britanico.kira.Controller;

import britanico.kira.Services.PS_STDNT_ENRL_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/newservicio")
public class newservicio {

    public PS_STDNT_ENRL_Service psStdntEnrlService;

    public newservicio(PS_STDNT_ENRL_Service psStdntEnrlService) {
        this.psStdntEnrlService = psStdntEnrlService;
    }

    @GetMapping("/{cod_alumno}")
    public ResponseEntity<String> getEstado(@PathVariable("cod_alumno") String cod_alumno) {
        return new ResponseEntity<>(psStdntEnrlService.getConteo(cod_alumno), HttpStatus.OK);
    }

    @GetMapping("/{institution}/{acad_career}/{emplid}")
    public ResponseEntity<String> getEstado(@PathVariable("institution") String institution,
                                            @PathVariable("acad_career") String acad_career,
                                            @PathVariable("emplid") String emplid) {
        return new ResponseEntity<>(psStdntEnrlService.validarRepitencia(institution, acad_career, emplid), HttpStatus.OK);
    }
}
