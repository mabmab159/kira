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

    @Override
    public String toString() {
        return "PS_CLASS_ATTENDNCE{" +
                "psClassAttendnceId=" + psClassAttendnceId +
                ", CLASS_ATTEND_TYPE='" + CLASS_ATTEND_TYPE + '\'' +
                ", ATTEND_PRESENT='" + ATTEND_PRESENT + '\'' +
                ", ATTEND_TARDY='" + ATTEND_TARDY + '\'' +
                ", ATTEND_LEFT_EARLY='" + ATTEND_LEFT_EARLY + '\'' +
                ", ATTEND_REASON='" + ATTEND_REASON + '\'' +
                ", ATTEND_FROM_TIME=" + ATTEND_FROM_TIME +
                ", CONTACT_MINUTES=" + CONTACT_MINUTES +
                ", INSTRUCTOR_ID='" + INSTRUCTOR_ID + '\'' +
                ", LAST_NAME_SRCH='" + LAST_NAME_SRCH + '\'' +
                ", FIRST_NAME_SRCH='" + FIRST_NAME_SRCH + '\'' +
                '}';
    }
}
