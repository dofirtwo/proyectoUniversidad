package proyectouniversidad;

/**
 *
 * @author SENA
 */
public class Tema {

    private String nombre;
    private int horas;

    public Tema(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public void modificarHoras() {
        this.horas = horas;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerHoras() {
        return horas;
    }
}
