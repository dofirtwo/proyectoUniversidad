package proyectouniversidad;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Grupo {

    private String nombre;
    private String codigo;
    private ArrayList<Estudiante> estudiantes;

    public Grupo(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        estudiantes = new ArrayList<>();
    }

    public void matricularEstudiante(Estudiante est) {
        estudiantes.add(est);
    }

    public ArrayList<Estudiante> retornarEstudiante() {
        return estudiantes;
    }

    public void mostrarDatosEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.obtenerNombre());
            System.out.println("Fecha Nacimiento: " + estudiante.obtenerFechaNacimiento());
        }
    }
}
