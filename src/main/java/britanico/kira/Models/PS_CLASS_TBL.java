package britanico.kira.Models;

import javax.persistence.*;

@Entity
@Table(name = "PS_CLASS_TBL")
public class PS_CLASS_TBL {
    @EmbeddedId
    public PS_CLASS_TBL_ID psClassTblId;
    public int CLASS_NBR;
    public String CAMPUS_EVENT_NBR;
    public String SUBJECT;
    public String CATALOG_NBR;
    public String INSTITUTION;
    public String ACAD_CAREER;
    public int ENRL_CAP;
    public int ENRL_TOT;
}
