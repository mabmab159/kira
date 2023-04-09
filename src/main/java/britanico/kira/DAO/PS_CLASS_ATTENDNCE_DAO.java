package britanico.kira.DAO;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import britanico.kira.Models.PS_CLASS_ATTENDNCE_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

public interface PS_CLASS_ATTENDNCE_DAO extends JpaRepository<PS_CLASS_ATTENDNCE, PS_CLASS_ATTENDNCE_ID> {

    //@Query("select p from PS_CLASS_ATTENDNCE p where p.EMPLID = :cod_alumno and p.STRM")

    @Query("select p from PS_CLASS_ATTENDNCE p where p.psClassAttendnceId.EMPLID = :cod_alumno and p.psClassAttendnceId.STRM = :strm and p.psClassAttendnceId.CLASS_NBR = " +
            ":clase")
    List<PS_CLASS_ATTENDNCE> obtenerClases(@Param("cod_alumno") String cod_alumno, @Param("strm") String strm,
                                           @Param("clase") int clase);
}
