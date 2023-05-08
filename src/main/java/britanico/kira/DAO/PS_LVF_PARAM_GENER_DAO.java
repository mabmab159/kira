package britanico.kira.DAO;

import britanico.kira.Models.PS_LVF_PARAM_GENER;
import britanico.kira.Models.PS_LVF_PARAM_GENER_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
}
