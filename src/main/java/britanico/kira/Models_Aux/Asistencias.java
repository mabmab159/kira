package britanico.kira.Models_Aux;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Asistencias {
    public String mes;
    public String dia;
    public String anio;
    public String fecha;
    public String presente;
    public String tarde;
    public String minutos_contados;
    public boolean reunion;
    public int icon;

    public static Asistencias convertirAsistencia(PS_CLASS_ATTENDNCE psClassAttendnce) {
        Asistencias asistencias = new Asistencias();
        asistencias.setMes(new SimpleDateFormat("MM").format(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT));
        asistencias.setDia(new SimpleDateFormat("d").format(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT));
        asistencias.setAnio(new SimpleDateFormat("yyyy").format(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT));
        asistencias.setFecha(new SimpleDateFormat("yyyy-MM-dd").format(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT));
        asistencias.setPresente(psClassAttendnce.ATTEND_PRESENT);
        asistencias.setTarde(psClassAttendnce.ATTEND_TARDY);
        asistencias.setMinutos_contados(String.valueOf(psClassAttendnce.CONTACT_MINUTES));
        asistencias.setReunion(true);
        asistencias.setIcon(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT.before(new Date()) ? 2 : 1);
        return asistencias;
    }
}
