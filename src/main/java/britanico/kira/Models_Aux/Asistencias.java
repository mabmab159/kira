package britanico.kira.Models_Aux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
