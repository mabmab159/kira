package britanico.kira.Models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PS_GRADE_TBL")
public class PS_GRADE_TBL {
    @EmbeddedId
    public PS_GRADE_TBL_ID psGradeTblId;
    public String DESCR;
    public String DESCRSHORT;
    public String GRADE_CONVERT;
    public float GRADE_POINTS;
    public String EARN_CREDIT;
    public String INCLUDE_IN_GPA;
    public String IN_PROGRESS_GRD;
    public String VALID_ATTEMPT;
    public String GRADE_CATEGORY;
    public String EXCLUDE_PRGRSS_UNT;
    public String SSR_GRADE_FLAG;
    public String SSR_INCL_GRD_IN_SS;
    public String SSR_INCL_GRD_RPTCK;
}
