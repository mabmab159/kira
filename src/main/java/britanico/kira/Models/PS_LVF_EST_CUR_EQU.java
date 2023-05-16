package britanico.kira.Models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PS_LVF_EST_CUR_EQU")
public class PS_LVF_EST_CUR_EQU {
    @EmbeddedId
    public PS_LVF_EST_CUR_EQU_ID psLvfEstCurEquId;
}
