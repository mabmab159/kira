package britanico.kira.Utils;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import britanico.kira.Models_Aux.Asistencias;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListarAsistencias {
    public List<Asistencias> listarAsistencia(List<PS_CLASS_ATTENDNCE> listado) {
        List<Asistencias> asistencias = new ArrayList<>();
        for (PS_CLASS_ATTENDNCE psClassAttendnce : listado) {
            Asistencias asistenciasAux = new Asistencias();
            asistenciasAux.setMes(new SimpleDateFormat("MM").format(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT));
            asistenciasAux.setDia(new SimpleDateFormat("dd").format(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT));
            asistenciasAux.setAnio(new SimpleDateFormat("yyyy").format(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT));
            asistenciasAux.setFecha(new SimpleDateFormat("yyyy-MM-dd").format(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT));
            asistenciasAux.setPresente(psClassAttendnce.ATTEND_PRESENT);
            asistenciasAux.setTarde(psClassAttendnce.ATTEND_TARDY);
            asistenciasAux.setMinutos_contados(String.valueOf(psClassAttendnce.CONTACT_MINUTES));
            asistenciasAux.setReunion(true);
            asistenciasAux.setIcon(psClassAttendnce.psClassAttendnceId.CLASS_ATTEND_DT.before(new Date()) ? 2 : 1);
            asistencias.add(asistenciasAux);
        }
        return asistencias;
    }
}
