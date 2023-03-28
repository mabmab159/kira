package britanico.kira.DAO;

import britanico.kira.Models.PS_CLASS_TBL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PS_CLASS_TBL_DAO extends JpaRepository<PS_CLASS_TBL, String> {

    @Query("select p from PS_CLASS_TBL p where p.STRM= :term and p.CLASS_NBR= :number")
    PS_CLASS_TBL findClass(@Param("term") int term, @Param("number") int number);
}
