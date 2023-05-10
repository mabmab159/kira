package britanico.kira.Controller;

import britanico.kira.Models_Aux.prueba;
import britanico.kira.Services.PS_LVF_PARAM_GENER_Service;
import britanico.kira.Services.PS_STDNT_ENRL_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newservicio")
public class newservicio {

    public PS_STDNT_ENRL_Service psStdntEnrlService;
    public PS_LVF_PARAM_GENER_Service psLvfParamGenerService;

    @Autowired
    public newservicio(PS_STDNT_ENRL_Service psStdntEnrlService, PS_LVF_PARAM_GENER_Service psLvfParamGenerService) {
        this.psStdntEnrlService = psStdntEnrlService;
        this.psLvfParamGenerService = psLvfParamGenerService;
    }

    public newservicio(PS_STDNT_ENRL_Service psStdntEnrlService) {
        this.psStdntEnrlService = psStdntEnrlService;
    }

    @GetMapping("/{cod_alumno}")
    public ResponseEntity<String> getEstado(@PathVariable("cod_alumno") String cod_alumno) {
        return new ResponseEntity<>(psStdntEnrlService.getConteo(cod_alumno), HttpStatus.OK);
    }

    @GetMapping("/{institution}/{acad_career}/{emplid}")
    public ResponseEntity<Object[]> getEstado(@PathVariable("institution") String institution,
                                            @PathVariable("acad_career") String acad_career,
                                            @PathVariable("emplid") String emplid) {
        /*return new ResponseEntity<>(psStdntEnrlService.validarRepitencia(institution, acad_career, emplid),
         HttpStatus.OK);
        return new ResponseEntity<>(psLvfParamGenerService.lastPlacement(emplid,
                psLvfParamGenerService.months()), HttpStatus.OK);*/
        return new ResponseEntity<>(psLvfParamGenerService.lastCourseNoFDA("ACPBR", "351123", "6"), HttpStatus.OK);
    }
}
