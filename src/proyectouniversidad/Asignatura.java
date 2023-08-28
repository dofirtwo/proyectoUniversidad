package proyectouniversidad;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Asignatura {

    private String nombre;
    private int horas;
    private ArrayList<Tema> temas;

    public Asignatura(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
        temas = new ArrayList<>();
    }

    public void modificarHoras(int horas) {
        this.horas = horas;
    }

    public void agregarTema(Tema tema) {
        temas.add(tema);
    }

    public void quitarTema(Tema tema) {
        temas.remove(tema);
    }

    public void listarTemas() {
        for (Tema tema : temas) {
            System.out.println("Tema: " + tema.obtenerNombre());
            System.out.println("Horas " + tema.obtenerHoras());
        }
    }
    public String obtenerNombre(){
        return nombre;
    }
}
