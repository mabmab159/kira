package britanico.kira.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PS_CLASS_ATTENDNCE_ID implements Serializable {
    public String EMPLID;
    public String ACAD_CAREER;
    public String INSTITUTION;
    public String STRM;
    public int CLASS_NBR;
    public Date CLASS_ATTEND_DT;
    public Date ATTEND_TO_TIME;
    public int ATTEND_TMPLT_NBR;
}
