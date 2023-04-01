package britanico.kira.DAO;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PS_CLASS_ATTENDNCE_DAO extends JpaRepository<PS_CLASS_ATTENDNCE, String> {
    @Query("select  p from PS_CLASS_ATTENDNCE p where p.EMPLID = :cod_alumno and p.STRM = :strm and p.CLASS_NBR = " +
            ":clase")
    List<PS_CLASS_ATTENDNCE> obtenerClases(@Param("cod_alumno") String cod_alumno, @Param("strm") String strm,
                                           @Param("clase") int clase);


}
