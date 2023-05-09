package britanico.kira.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PS_GRADE_TBL_ID implements Serializable {
    public String SETID;
    public String GRADING_SCHEME;
    public Date EFFDT;
    public String GRADING_BASIS;
    public String CRSE_GRADE_INPUT;
}
