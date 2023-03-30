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
    public int mes;
    public int dia;
    public int anio;
    public String fecha;
    public String presente;
    public String tarde;
    public int minutos_contados;
    public boolean reunion;
    public int icon;
}
