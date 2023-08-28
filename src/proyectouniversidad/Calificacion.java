package proyectouniversidad;

/**
 *
 * @author SENA
 */
public class Calificacion {

    private double nota1;
    private double nota2;
    private double notaFinal;
    private Estudiante estudiante;
    private Asignatura asignatura;

    public void asignarNota1(double nota) {
        this.nota1 = nota;
    }

    public void asignatNota2(double nota) {
        this.nota2 = nota;
    }

    public void calcularNotaFinal() {
        notaFinal = nota1 * 0.70 + nota2 * 0.30;
    }

    public double obtenerNotaFinal() {
        return notaFinal;
    }

    public void asignarEstudiante(Estudiante est) {
        estudiante = est;
    }

    public void asignarAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
