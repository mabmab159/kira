package britanico.kira.Models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PS_CLST_DETL_TBL")
public class PS_CLST_DETL_TBL {

    @EmbeddedId
    public PS_CLST_DETL_TBL_ID psClstDetlTblId;
    public String WILDCARD_IND;
    public Date CRSVALID_BEGIN;
    public Date CRSVALID_END;
    public String TRNSFR_LVL_ALLOWD;
    public String TEST_CRDT_ALLOWD;
    public String OTHR_CRDT_ALLOWD;
    public String INCL_GPA_REQ;
    public String EXCL_IP_CREDIT;
    public float GRADE_POINTS_MIN;
    public float UNITS_MINIMUM;
    public String INSTITUTION;
    public String ACAD_GROUP;
    public String SUBJECT;
    public String CATALOG_NBR;
    public String WILD_PATTERN_TYPE;
    public String CRSE_ID;
    public String INCLUDE_EQUIVALENT;
    public String STRM;
    public int ASSOCIATED_CLASS;
    public int CRS_TOPIC_ID;
    public String RQMNT_DESIGNTN;
    public String SAA_DSP_WILD_CRSES;
    public String DESCR;
    public String SAA_DESCR254;
    public String SAA_WHERE_CLAUSE;
}
