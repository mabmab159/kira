package britanico.kira.DAO;

import britanico.kira.Models.PS_CLASS_TBL;
import britanico.kira.Models.PS_CLASS_TBL_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PS_CLASS_TBL_DAO extends JpaRepository<PS_CLASS_TBL, PS_CLASS_TBL_ID> {
    @Query("select p from PS_CLASS_TBL p where p.psClassTblId.STRM = :strm and p.CLASS_NBR = :clase")
    PS_CLASS_TBL getPsClassTbl(@Param("strm") String strm, @Param("clase") int clase);
}
