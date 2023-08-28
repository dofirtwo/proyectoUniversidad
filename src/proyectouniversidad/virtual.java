package proyectouniversidad;

/**
 *
 * @author SENA
 */
public class virtual extends Asignatura {

    private String url;
    private Plataforma plataforna;

    public virtual(String url, String nombre, int horas) {
        super(nombre, horas);
        this.url = url;
    }

    public String obtenerUrl() {
        return url;
    }

    public void asignarPlataforma(Plataforma plataforma) {
        this.plataforna = plataforma;
    }
}
