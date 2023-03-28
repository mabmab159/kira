package britanico.kira.Models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "PS_CLASS_TBL")
public class PS_CLASS_TBL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String CRSE_ID;
    public int CRSE_OFFER_NBR;
    public int CLASS_SECTION;
    public String ACAD_GROUP;
    public String SUBJECT;
    public String INSTITUTION;
    public String ACAD_CAREER;
    public int STRM;
    public String SESSION_CODE;
    public int CLASS_NBR;
    public String ENRL_STAT;
    public String CLASS_STAT;
    public String CLASS_TYPE;
    public String ASSOCIATED_CLASS;
    public int ENRL_CAP;
    public int MIN_ENRL;
    public int ENRL_TOT;
    public String ACAD_ORG;
    public String NEXT_STDNT_POSITIN;
    public String CAMPUS;
    public String LOCATION;
    public String INSTRUCTION_MODE;
    public String START_DT;
    public String END_DT;
    public String CANCEL_DT;

}
