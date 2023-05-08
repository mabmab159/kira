package britanico.kira.Models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PS_STDNT_ENRL")
public class PS_STDNT_ENRL {
    @EmbeddedId
    public PS_STDNT_ENRL_ID psStdntEnrlId;
    public String CRSE_CAREER;
    public String SESSION_CODE;
    public String SESSN_ENRL_CNTL;
    public String STDNT_ENRL_STATUS;
    public String ENRL_STATUS_REASON;
    public String ENRL_ACTION_LAST;
    public String ENRL_ACTN_RSN_LAST;
    public String ENRL_ACTN_PRC_LAST;
    public Date STATUS_DT;
    public Date ENRL_ADD_DT;
    public Date ENRL_DROP_DT;
    public float UNT_TAKEN;
    public float UNT_PRGRSS;
    public float UNT_PRGRSS_FA;
    public float UNT_BILLING;
    public float CRSE_COUNT;
    public String GRADING_BASIS_ENRL;
    public Date GRADING_BASIS_DT;
    public String OVRD_GRADING_BASIS;
    public String CRSE_GRADE_OFF;
    public String CRSE_GRADE_INPUT;
    public Date GRADE_DT;
    public String REPEAT_CODE;
    public Date REPEAT_DT;
    public int CLASS_PRMSN_NBR;
    public int ASSOCIATED_CLASS;
    public int STDNT_POSITIN;
    public String AUDIT_GRADE_BASIS;
    public String EARN_CREDIT;
    public String INCLUDE_IN_GPA;
    public String UNITS_ATTEMPTED;
    public float GRADE_POINTS;
    public float GRADE_POINTS_FA;
    public float GRD_PTS_PER_UNIT;
    public String MANDATORY_GRD_BAS;
    public int RSRV_CAP_NBR;
    public String RQMNT_DESIGNTN;
    public String RQMNT_DESIGNTN_OPT;
    public String RQMNT_DESIGNTN_GRD;
    public String INSTRUCTOR_ID;
    public int DROP_CLASS_IF_ENRL;
    public String ASSOCIATION_99;
    public String OPRID;
    public String TSCRPT_NOTE_ID;
    public String TSCRPT_NOTE_EXISTS;
    public String NOTIFY_STDNT_CHING;
    public String REPEAT_CANDIDATE;
    public String VALID_ATTEMPT;
    public String GRADE_CATEGORY;
    public String SEL_GROUP;
    public int DYN_CLASS_NBR;
    public float UNT_EARNED;
    public Date LAST_UPD_DT_STMP;
    public Date LAST_UPD_TM_STMP;
    public Date LAST_ENRL_DT_STMP;
    public Date LAST_ENRL_TM_STMP;
    public Date LAST_DROP_DT_STMP;
    public Date LAST_DROP_TM_STMP;
    public String ENRL_REQ_SOURCE;
    public String LAST_UPD_ENREQ_SRC;
    public String GRADING_SCHEME_ENR;
    public int RELATE_CLASS_NBR_1;
    public int RELATE_CLASS_NBR_2;
    public String ACAD_PROG;
}
