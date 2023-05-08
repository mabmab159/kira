package britanico.kira.DAO;

import britanico.kira.Models.PS_STDNT_ENRL;
import britanico.kira.Models.PS_STDNT_ENRL_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PS_STDNT_ENRL_DAO extends JpaRepository<PS_STDNT_ENRL, PS_STDNT_ENRL_ID> {

    @Query("SELECT CASE WHEN COUNT(*) > 0 THEN 'N' ELSE 'Y' END FROM PS_STDNT_ENRL A , PS_CLASS_TBL B " +
            "WHERE A.psStdntEnrlId.INSTITUTION = B.INSTITUTION AND A.psStdntEnrlId.ACAD_CAREER = B.ACAD_CAREER " +
            "AND A.SESSION_CODE = B.psClassTblId.SESSION_CODE AND A.psStdntEnrlId.STRM = B.psClassTblId.STRM " +
            "AND A.psStdntEnrlId.CLASS_NBR = B.CLASS_NBR AND A.STDNT_ENRL_STATUS = 'E' AND A.CRSE_GRADE_INPUT = '' " +
            "AND A.GRADING_BASIS_ENRL = 'GRD' AND SUBSTRING(B.SUBJECT,3,LEN(B.SUBJECT)) IN ('ADVANC','BASIC'," +
            "'INTERM','JUNIOR','KIDS','PREKID') AND A.psStdntEnrlId.EMPLID = :cod_alumno")
    String getConteo(@Param("cod_alumno") String cod_alumno);
}
