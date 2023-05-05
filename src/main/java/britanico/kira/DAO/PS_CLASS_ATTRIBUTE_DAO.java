package britanico.kira.DAO;

import britanico.kira.Models.PS_CLASS_ATTRIBUTE;
import britanico.kira.Models.PS_CLASS_ATTRIBUTE_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PS_CLASS_ATTRIBUTE_DAO extends JpaRepository<PS_CLASS_ATTRIBUTE, PS_CLASS_ATTRIBUTE_ID> {
    @Query("select B from PS_CLASS_TBL A, PS_CLASS_ATTRIBUTE B where B.psClassAttributeId.CRSE_ID = A.psClassTblId" +
            ".CRSE_ID and B.psClassAttributeId.CRSE_OFFER_NBR = A.psClassTblId.CRSE_OFFER_NBR and B" +
            ".psClassAttributeId.STRM = A.psClassTblId.STRM and B.psClassAttributeId.SESSION_CODE = A.psClassTblId" +
            ".SESSION_CODE and B.psClassAttributeId.CLASS_SECTION = A.psClassTblId.CLASS_SECTION and B" +
            ".psClassAttributeId.CRSE_ATTR = 'PINA' and A.psClassTblId.STRM = :strm and A.CLASS_NBR = :clase")
    PS_CLASS_ATTRIBUTE obtenerClase(@Param("strm") String strm, @Param("clase") int clase);
}
