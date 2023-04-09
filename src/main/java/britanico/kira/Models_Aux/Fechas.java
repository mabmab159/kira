package britanico.kira.Models_Aux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fechas {
    public int anio;
    public Meses meses;
    public List<Asistencias> asistencias;
}
