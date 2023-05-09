package britanico.kira.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PS_CLASS_MTG_PAT_ID implements Serializable {
    public String CRSE_ID;
    public int CRSE_OFFER_NBR;
    public String STRM;
    public String SESSION_CODE;
    public String CLASS_SECTION;
}
