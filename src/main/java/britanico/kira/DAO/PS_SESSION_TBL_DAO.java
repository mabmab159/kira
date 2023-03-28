package britanico.kira.DAO;

import britanico.kira.Models.PS_CLASS_TBL;
import britanico.kira.Models.PS_SESSION_TBL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PS_SESSION_TBL_DAO extends JpaRepository<PS_SESSION_TBL, String> {

    @Query("select p from PS_SESSION_TBL p where p.STRM= :term")
    PS_SESSION_TBL findClass(@Param("term") int term);
}
