package britanico.kira.Models_Aux;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fechas {
    public int anio;
    public Meses meses;
    public List<Asistencias> asistencias;

    public static List<Fechas> convertirFecha(List<PS_CLASS_ATTENDNCE> psClassAttendnces) {
        System.out.println(psClassAttendnces);
        List<Fechas> fechas = new ArrayList<>();
        Fechas fechas1 = new Fechas();
        fechas1.setAnio(Integer.parseInt(new SimpleDateFormat("yyyy").format(psClassAttendnces.get(0).psClassAttendnceId.CLASS_ATTEND_DT)));
        fechas1.setMeses(new Meses(Integer.parseInt(new SimpleDateFormat("MM").format(psClassAttendnces.get(0).psClassAttendnceId.CLASS_ATTEND_DT)),
                Integer.parseInt(new SimpleDateFormat("MM").format(psClassAttendnces.get(psClassAttendnces.size() - 1).psClassAttendnceId.CLASS_ATTEND_DT))));
        fechas1.setAsistencias(psClassAttendnces.stream().map(Asistencias::convertirAsistencia).collect(Collectors.toList()));
        fechas.add(fechas1);
        return fechas;
    }
}
