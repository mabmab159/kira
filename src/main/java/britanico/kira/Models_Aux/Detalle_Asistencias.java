package britanico.kira.Models_Aux;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Detalle_Asistencias {
    int code;
    int num_anios;
    List<Fechas> fechas;
    Clase clase;
}
