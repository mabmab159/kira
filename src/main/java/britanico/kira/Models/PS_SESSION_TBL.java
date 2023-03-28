package britanico.kira.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "PS_SESSION_TBL")
public class PS_SESSION_TBL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String SESSION_CODE;
    public String INSTITUTION;
    public String ACAD_CAREER;
    public int STRM;
    public Date SESS_BEGIN_DT;
    public Date SESS_END_DT;
    public Date ENROLL_OPEN_DT;
    public Date FIRST_ENRL_DT;
    public Date LAST_ENRL_DT;
    public Date LAST_WAIT_DT;
    public Date CENSUS_DT;
    public boolean USE_DYN_CLASS_DATE;
    public Date SIXTY_PCT_DT;
    public Date FACILITY_ASSIGNMNT;
    public boolean SSR_ENR_APT_APPROV;
    public boolean SSR_VAL_APT_APPROV;
}
