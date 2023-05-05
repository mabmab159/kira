package britanico.kira.Models_Aux;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import britanico.kira.Models.PS_CLASS_ATTRIBUTE;
import britanico.kira.Models.PS_CLASS_TBL;
import lombok.*;

import java.util.List;

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

    public static Clase convertirClase(PS_CLASS_TBL psClassTbl, List<PS_CLASS_ATTENDNCE> psClassAttendnce,
                                       PS_CLASS_ATTRIBUTE psClassAttribute) {
        Clase clase = new Clase();
        clase.setClass_nbr(psClassTbl.CLASS_NBR);
        clase.setSesiones(psClassAttendnce.size());
        clase.setNum_inasistencias((int) psClassAttendnce.stream().filter(p -> p.ATTEND_PRESENT.equals("N")).count());
        clase.setFaltas(clase.getNum_inasistencias());
        clase.setTardanzas((int) psClassAttendnce.stream().filter(p -> p.ATTEND_TARDY.equals("Y")).count());
        clase.setPina((int) Math.ceil((float) psClassAttendnce.size() * Integer.parseInt(psClassAttribute.psClassAttributeId.CRSE_ATTR_VALUE) / 100));
        clase.setObservacion(clase.getFaltas() > clase.getPina() ? "Se superó el máximo de inasistencias permitidas." :
                "El alumno se encuentra dentro del límite permitido de inasistencias.");
        return clase;
    }
}
