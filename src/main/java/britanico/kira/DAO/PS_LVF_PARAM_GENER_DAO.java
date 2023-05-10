package britanico.kira.DAO;

import britanico.kira.Models.PS_LVF_PARAM_GENER;
import britanico.kira.Models.PS_LVF_PARAM_GENER_ID;
import britanico.kira.Models_Aux.prueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PS_LVF_PARAM_GENER_DAO extends JpaRepository<PS_LVF_PARAM_GENER, PS_LVF_PARAM_GENER_ID> {
    @Query("SELECT p.LVF_PARAM_VALUE from PS_LVF_PARAM_GENER p where p.psLvfParamGenerId" +
            ".LVF_PARAM_ID='BRT_MESES_PLC'")
    public String months();

    @Query("SELECT p.LVF_PARAM_VALUE FROM PS_LVF_PARAM_GENER p WHERE p.psLvfParamGenerId.LVF_PARAM_ID = " +
            "'BRT_MESES_DISCONTINUIDAD'")
    public String monthsDiscontinuity();

    @Query(value = "SELECT EX.TEST_ID ,EX.TEST_COMPONENT ,EX.TEST_DT ,CC.CRSE_ID FROM PS_STDNT_TEST_COMP EX ," +
            "PS_BRT_STDNTTST_HH BX ,PS_CRSE_CATALOG CC WHERE EX.EMPLID = BX.EMPLID AND EX.TEST_ID = BX.TEST_ID AND EX" +
            ".TEST_COMPONENT = BX.TEST_COMPONENT AND EX.TEST_DT = BX.TEST_DT AND EX.TEST_DT = (SELECT MAX(X.TEST_DT) " +
            "FROM PS_STDNT_TEST_COMP X WHERE EX.EMPLID = X.EMPLID) AND CC.DESCR = EX.TEST_COMPONENT AND CC.EFFDT = " +
            "(SELECT MAX(X.EFFDT) FROM PS_CRSE_CATALOG X WHERE X.CRSE_ID = CC.CRSE_ID AND X.EFFDT <= GETDATE()) AND " +
            "EX.EMPLID = :emplid AND BX.BIZ_ESTADO_PAGO NOT IN ('AN','VC') AND CASE WHEN (DATEADD(MONTH , CAST" +
            "(:months AS INT) , EX.TEST_DT)+1) <= GETDATE() THEN 'N' ELSE 'Y' END = 'Y'", nativeQuery = true)
    public String lastPlacement(@Param("emplid") String emplid, @Param("months") String months);

    @Query(value = "SELECT X.FEC_FIN_CL ,YEAR(X.FEC_FIN_CL) FROM " +
            "(SELECT " +
            "IC.EMPLID, IC" +
            ".ACAD_CAREER, IC" +
            ".STRM, IC.CLASS_NBR, IC" +
            ".SESSION_CODE, IC.CRSE_GRADE_OFF, MS.LVF_MES_BRIT, IC.ENRL_ADD_DT, RE.FEC_FIN_CL, CS.DESCR, IC" +
            ".LAST_ENRL_DT_STMP, IC.LAST_ENRL_TM_STMP, CS.END_DT, ROW_NUMBER() OVER(ORDER BY CONVERT(INT, IC.STRM) " +
            "DESC, CONVERT(INT, MS.LVF_MES_BRIT) DESC, RE.FEC_FIN_CL DESC) AS NUM FROM PS_STDNT_ENRL IC INNER JOIN " +
            "PS_LVF_TERM_TBL3 MS ON MS.INSTITUTION = IC.INSTITUTION AND MS.ACAD_CAREER = IC.ACAD_CAREER AND MS.STRM =" +
            " IC.STRM AND MS.SESSION_CODE = IC.SESSION_CODE INNER JOIN PS_CLASS_TBL CS ON CS.INSTITUTION = IC" +
            ".INSTITUTION AND CS.ACAD_CAREER = IC.ACAD_CAREER AND CS.STRM = IC.STRM AND CS.SESSION_CODE = IC" +
            ".SESSION_CODE AND CS.CLASS_NBR = IC.CLASS_NBR INNER JOIN (SELECT PAT.CRSE_ID, PAT.CRSE_OFFER_NBR, PAT" +
            ".STRM, PAT.SESSION_CODE, PAT.CLASS_SECTION, MAX(PAT.END_DT) AS FEC_FIN_CL FROM PS_CLASS_MTG_PAT PAT " +
            "GROUP" +
            " BY" +
            " PAT.CRSE_ID, PAT.CRSE_OFFER_NBR, PAT.STRM, PAT.SESSION_CODE, PAT.CLASS_SECTION) RE ON RE.CRSE_ID = CS" +
            ".CRSE_ID AND RE.CRSE_OFFER_NBR = CS.CRSE_OFFER_NBR AND RE.STRM = CS.STRM AND RE.SESSION_CODE = CS" +
            ".SESSION_CODE AND RE.CLASS_SECTION = CS.CLASS_SECTION LEFT JOIN PS_GRADE_TBL GB ON GB.SETID=IC" +
            ".INSTITUTION AND GB.GRADING_SCHEME = IC.GRADING_SCHEME_ENR AND GB.GRADING_BASIS=IC.GRADING_BASIS_ENRL " +
            "AND GB.CRSE_GRADE_INPUT=IC.CRSE_GRADE_OFF AND GB.EFFDT = (SELECT MAX(B_ED.EFFDT) FROM PS_GRADE_TBL B_ED " +
            "WHERE GB.SETID = B_ED.SETID AND GB.GRADING_SCHEME = B_ED.GRADING_SCHEME AND B_ED.EFFDT <= GETDATE()) " +
            "WHERE IC.INSTITUTION = :institution AND IC.EMPLID = :emplid AND IC.STDNT_ENRL_STATUS = 'E' AND IC" +
            ".CRSE_GRADE_OFF <> ' ' AND IC.GRADING_BASIS_ENRL IN ('ANC','GRD','GRE','GRP') AND GB.DESCR <> 'FDA' AND " +
            "GB.DESCR <> 'FAIL DUE TO ABSENCES' AND CASE WHEN (DATEADD(MONTH, ((YEAR(CS.END_DT) - 1900) * 12) + MONTH" +
            "(CS.END_DT) + CAST(:meses_discontinuidad AS INT) +1, -1))> GETDATE() THEN 1 ELSE 0 END=1) X WHERE X.NUM " +
            "= 1", nativeQuery = true)
    public Object[] lastCourseNoFDA(@Param("institution") String institution, @Param("emplid") String emplid,
                                        @Param("meses_discontinuidad") String meses_discontinuidad);
}
