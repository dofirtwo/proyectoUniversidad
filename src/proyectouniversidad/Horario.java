package proyectouniversidad;

/**
 *
 * @author SENA
 */
public class Horario {

    private String dia;
    private int horaInicio;
    private int horaFinal;

    public Horario(String dia, int horaInicio, int horaFinal) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public String obtenerDia() {
        return dia;
    }

    public int obtenerHoraInicio() {
        return horaInicio;
    }

    public int obtenerHoraFinal() {
        return horaFinal;
    }
}
