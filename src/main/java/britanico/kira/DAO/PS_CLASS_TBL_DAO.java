package britanico.kira.DAO;

import britanico.kira.Models.PS_CLASS_TBL;
import britanico.kira.Models.PS_CLASS_TBL_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PS_CLASS_TBL_DAO extends JpaRepository<PS_CLASS_TBL, PS_CLASS_TBL_ID> {
    @Query("select p from PS_CLASS_TBL p where p.psClassTblId.STRM = :strm and p.CLASS_NBR = :clase")
    PS_CLASS_TBL obtenerClase(@Param("strm") String strm, @Param("clase") int clase);

    @Query("SELECT P FROM PS_CLASS_TBL P WHERE P.psClassTblId.SESSION_CODE=:session_code and P.psClassTblId" +
            ".STRM=:strm and (P.ENRL_CAP-P.ENRL_TOT)>0 and P.psClassTblId.CRSE_ID in (:codigoClase)")
    List<PS_CLASS_TBL> listadoDeClasesRecomendar(@Param("session_code") String session_code,
                                                 @Param("strm") String strm, @Param("codigoClase") List<String> codigoClase);
}
