package britanico.kira.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PS_CLASS_ATTENDNCE")
public class PS_CLASS_ATTENDNCE {
    @EmbeddedId
    public PS_CLASS_ATTENDNCE_ID psClassAttendnceId;
    public String CLASS_ATTEND_TYPE;
    public String ATTEND_PRESENT;
    public String ATTEND_TARDY;
    public String ATTEND_LEFT_EARLY;
    public String ATTEND_REASON;
    public Date ATTEND_FROM_TIME;
    public int CONTACT_MINUTES;
    public String INSTRUCTOR_ID;
    public String LAST_NAME_SRCH;
    public String FIRST_NAME_SRCH;

}
