package britanico.kira.Models;

import javax.persistence.*;
@Entity
@Table(name = "PS_CLASS_TBL")
public class PS_CLASS_TBL {
    @EmbeddedId
    public PS_CLASS_TBL_ID psClassTblId;
    public int CLASS_NBR;
    public String CAMPUS_EVENT_NBR;
}
