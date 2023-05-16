package britanico.kira.Models_Aux;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class detalleAsistencias {
    int code = 0;
    int num_anios = 1;
    List<Fechas> fechas;
    Clase clase;
}
