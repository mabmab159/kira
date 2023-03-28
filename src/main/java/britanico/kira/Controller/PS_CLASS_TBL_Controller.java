package britanico.kira.Controller;

import britanico.kira.Models.PS_CLASS_TBL;
import britanico.kira.Models.PS_SESSION_TBL;
import britanico.kira.Models_Aux.ClassResource;
import britanico.kira.Services.PS_CLASS_TBL_Service;
import britanico.kira.Services.PS_SESSION_TBL_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/class")
public class PS_CLASS_TBL_Controller {

    @Autowired
    private PS_CLASS_TBL_Service psClassTblService;

    @Autowired
    private PS_SESSION_TBL_Service psSessionTblService;


    @GetMapping("/show")
    public ResponseEntity<List<PS_SESSION_TBL>> allClass() {
        //PS_CLASS_TBL clase = psClassTblService.findClass(term, number);
        List<PS_SESSION_TBL> sessionTbl = psSessionTblService.findAll();
        /*ClassResource classResource = ClassResource.builder().term(clase.STRM).
                number(clase.CLASS_NBR).
                section(clase.CLASS_SECTION).
                start_date(clase.START_DT).
                end_date(clase.END_DT).
                cancellation_date(clase.CANCEL_DT).
                max_enrollments(clase.ENRL_CAP).
                min_enrollments(clase.MIN_ENRL).
                enrollments(clase.ENRL_TOT).
                enrollment_status(clase.ENRL_STAT).
                status(clase.CLASS_STAT).
                price("").build();*/
        return new ResponseEntity<>(sessionTbl, HttpStatus.OK);
    }
}
