package britanico.kira.Controller;

import britanico.kira.Models.PS_CLASS_ATTENDNCE;
import britanico.kira.Models.PS_CLASS_ATTENDNCE_ID;
import britanico.kira.Models_Aux.*;
import britanico.kira.Services.PS_CLASS_ATTENDNCE_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/wsmatriculaPRD")
public class wsmatriculaPRD_Asistencia {

    @Autowired public PS_CLASS_ATTENDNCE_Service classAttendnceService;

    @GetMapping
    public ResponseEntity<List<PS_CLASS_ATTENDNCE>> getAssistanceClass(String cod_alumno, String strm, int clase) {
        List<PS_CLASS_ATTENDNCE> listado = classAttendnceService.obtenerClases(cod_alumno, strm, clase);
        //List<PS_CLASS_ATTENDNCE> listado = classAttendnceService.findAll();
        /*List<Asistencias> asistencias = new ArrayList<>();
        Detalle_Asistencias salida = new Detalle_Asistencias();
        listado.stream().forEach(p -> System.out.println(p));
        for (PS_CLASS_ATTENDNCE psClassAttendnce : listado) {
            Asistencias asistenciasAux = new Asistencias();
            asistenciasAux.setMes(new SimpleDateFormat("MM").format(psClassAttendnce.CLASS_ATTEND_DT));
            asistenciasAux.setDia(new SimpleDateFormat("dd").format(psClassAttendnce.CLASS_ATTEND_DT));
            asistenciasAux.setAnio(new SimpleDateFormat("yyyy").format(psClassAttendnce.CLASS_ATTEND_DT));
            asistenciasAux.setFecha(new SimpleDateFormat("yyyy-MM-dd").format(psClassAttendnce.CLASS_ATTEND_DT));
            asistenciasAux.setPresente(psClassAttendnce.ATTEND_PRESENT);
            asistenciasAux.setTarde(psClassAttendnce.ATTEND_TARDY);
            asistenciasAux.setMinutos_contados(String.valueOf(psClassAttendnce.CONTACT_MINUTES));
            asistenciasAux.setReunion(true);
            asistenciasAux.setIcon(psClassAttendnce.CLASS_ATTEND_DT.before(new Date()) ? 2 : 1);
            asistencias.add(asistenciasAux);
        }
        Fechas fechas = new Fechas();
        List<Fechas> fechasList = new ArrayList<>();
        fechas.setAnio(asistencias.size() > 0 ? Integer.parseInt(asistencias.get(0).getAnio()) : 0);
        fechas.setMeses(asistencias.size() > 0 ? new Meses(Integer.parseInt(asistencias.get(0)
                .getMes()), Integer.parseInt(asistencias.get(0).getMes())) : null);
        fechas.setAsistencias(asistencias);
        fechasList.add(fechas);
        Detalle_Asistencias detalleAsistencias = new Detalle_Asistencias();
        detalleAsistencias.setCode(0);
        detalleAsistencias.setNum_anios(2023);
        detalleAsistencias.setFechas(fechasList);
        Clase clase1 = new Clase();
        clase1.setClass_nbr(String.valueOf(clase));
        clase1.setSesiones(asistencias.size());
        clase1.setNum_asistencias((int) asistencias.stream().filter(p -> p.presente.equals("Y")).count());
        clase1.setFaltas((int) asistencias.stream().filter(p -> p.presente.equals("N")).count());
        clase1.setTardanzas((int) asistencias.stream().filter(p -> p.tarde.equals("Y")).count());
        //clase1.setObservacion();
        //clase1.setPina();
        detalleAsistencias.setClase(clase1);*/
        return new ResponseEntity<>(listado, HttpStatus.OK);
    }
}
