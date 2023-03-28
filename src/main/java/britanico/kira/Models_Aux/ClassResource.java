package britanico.kira.Models_Aux;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassResource {
    public String session;
    public String course_offer;
    public int term;
    public int number;
    public int section;
    public String start_date;
    public String end_date;
    public String cancellation_date;
    public String location;
    public int max_enrollments;
    public int min_enrollments;
    public int enrollments;
    public String enrollment_status;
    public String status;
    public String meetings;
    public String book;
    public String price;
    public String currency;
}
