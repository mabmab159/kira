package britanico.kira.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PS_CLASS_ATTRIBUTE")
public class PS_CLASS_ATTRIBUTE {
    @Id
    public PS_CLASS_ATTRIBUTE_ID psClassAttributeId;
}
