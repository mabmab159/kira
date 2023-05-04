package britanico.kira.Models_Aux;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import britanico.kira.Models.PS_CLASS_TBL;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clase {
    public int class_nbr;
    public int sesiones;
    public int num_inasistencias;
    public int faltas;
    public int tardanzas;
    public String observacion;
    public int pina;

    public Clase convertirClase(PS_CLASS_TBL psClassTbl, List<PS_CLASS_ATTENDNCE> psClassAttendnce) {
        Clase clase = new Clase();
        clase.setClass_nbr(psClassTbl.CLASS_NBR);
        clase.setSesiones(psClassAttendnce.size());
        clase.setNum_inasistencias((int) psClassAttendnce.stream().filter(p -> p.ATTEND_PRESENT.equals("N")).count());
        clase.setFaltas(clase.getNum_inasistencias());
        clase.setTardanzas((int) psClassAttendnce.stream().filter(p->p.ATTEND_TARDY.equals("Y")).count());
        clase.setObservacion("Agregar logica");
        clase.setPina(2);
        //clase.setTardanzas();
        return clase;
    }
}
