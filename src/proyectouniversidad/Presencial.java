package proyectouniversidad;

/**
 *
 * @author SENA
 */
public class Presencial extends Asignatura {

    private String libro;
    private Salon salon;
    private Horario horario;

    public Presencial(String libro, String nombre, int horas) {
        super(nombre, horas);
        this.libro = libro;
    }

    public String obtenerLibro() {
        return libro;
    }

    public void asignarSalon(Salon salon) {
        this.salon = salon;
    }

    public void asignarHorario(Horario horario) {
        this.horario = horario;
    }

    public Horario obtenerHorario() {
        return horario;
    }

    public Salon obtenerSalon() {
        return salon;
    }
}
