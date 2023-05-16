package britanico.kira.DAO;

import britanico.kira.Models.PS_LVF_EST_CUR_EQU;
import britanico.kira.Models.PS_LVF_EST_CUR_EQU_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PS_LVF_EST_CUR_EQU_DAO extends JpaRepository<PS_LVF_EST_CUR_EQU, PS_LVF_EST_CUR_EQU_ID> {
    @Query(value = "SELECT CRSE_ID_EXT FROM PS_LVF_EST_CUR_EQU WHERE CRSE_ID = :crse_id", nativeQuery = true)
    public List<String> equivalentCourses(@Param("crse_id") String crse_id);
}
