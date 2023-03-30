package britanico.kira.DAO;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PS_CLASS_ATTENDNCE_DAO extends JpaRepository<PS_CLASS_ATTENDNCE, String> {
    @Query("select p from PS_CLASS_ATTENDNCE p where p.EMPLID = :cod_alumno")
    List<PS_CLASS_ATTENDNCE> obtenerClases(String cod_alumno);
}
