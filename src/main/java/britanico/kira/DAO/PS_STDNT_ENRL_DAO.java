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

    @Query(value = "SELECT CL.CRSE_ID FROM PS_STDNT_ENRL IC INNER JOIN PS_CLASS_TBL CL ON CL.INSTITUTION = IC" +
            ".INSTITUTION AND CL.ACAD_CAREER = IC.ACAD_CAREER AND CL.STRM = IC.STRM AND CL.SESSION_CODE = IC" +
            ".SESSION_CODE AND CL.CLASS_NBR = IC.CLASS_NBR LEFT JOIN (SELECT ps.CRSE_ID FROM PS_CLST_DETL_TBL ps " +
            "WHERE ps.COURSE_LIST IN (SELECT PG.LVF_PARAM_VALUE FROM PS_LVF_PARAM_GENER PG WHERE PG.LVF_PARAM_ID IN " +
            "('LVF_LIST_CRSE_EX'))) EX ON EX.CRSE_ID = CL.CRSE_ID WHERE IC.INSTITUTION = :institution AND IC" +
            ".ACAD_CAREER = :acad_career AND IC.EMPLID = :emplid AND IC.STDNT_ENRL_STATUS = 'E' AND IC.CRSE_GRADE_OFF" +
            " NOT IN (' ','ABS', 'FDA') AND EX.CRSE_ID IS NULL AND CL.START_DT = (SELECT MAX(CL.START_DT) FROM " +
            "PS_STDNT_ENRL IC INNER JOIN PS_CLASS_TBL CL ON CL.INSTITUTION = IC.INSTITUTION AND CL.ACAD_CAREER = IC" +
            ".ACAD_CAREER AND CL.STRM = IC.STRM AND CL.SESSION_CODE = IC.SESSION_CODE AND CL.CLASS_NBR = IC.CLASS_NBR" +
            " LEFT JOIN (SELECT CRSE_ID FROM PS_CLST_DETL_TBL WHERE COURSE_LIST IN (SELECT LVF_PARAM_VALUE FROM " +
            "PS_LVF_PARAM_GENER WHERE LVF_PARAM_ID IN ('LVF_LIST_CRSE_EX'))) EX ON EX.CRSE_ID = CL.CRSE_ID WHERE IC" +
            ".INSTITUTION = :institution AND IC.ACAD_CAREER = :acad_career AND IC.EMPLID = :emplid AND IC" +
            ".STDNT_ENRL_STATUS = 'E' AND IC.CRSE_GRADE_OFF NOT IN (' ','ABS', 'FDA') AND EX.CRSE_ID IS NULL )",
            nativeQuery = true)
    String validarRepitencia(@Param("institution") String institution, @Param("acad_career") String acad_career,
                     @Param("emplid") String emplid);
}
