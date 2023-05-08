package britanico.kira.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;
@Embeddable
public class PS_CLST_DETL_TBL_ID implements Serializable {
    public String COURSE_LIST;
    public Date EFFDT;
    public int R_COURSE_SEQUENCE;
}
