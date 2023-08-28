package proyectouniversidad;

import java.util.Calendar;

/**
 *
 * @author SENA
 */
public class ProyectoUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grupo grupo1 = new Grupo("ADSO", "2468288");
        Estudiante est1 = new Estudiante("Maria", Calendar.getInstance().getTime());
        Estudiante est2 = new Estudiante("Pedro", Calendar.getInstance().getTime());
        grupo1.matricularEstudiante(est1);
        grupo1.matricularEstudiante(est2);
        grupo1.mostrarDatosEstudiantes();
        grupo1 = null;
        System.out.println("Datos del estudiante 1: " + est1.obtenerNombre());

        Presencial pre = new Presencial("POO", "ADSO", 400);
        Salon salon = new Salon(209);
        Horario horario = new Horario("Viernes", 6, 12);
        pre.asignarSalon(salon);
        pre.asignarHorario(horario);

        String dia = pre.obtenerHorario().obtenerDia();
        System.out.println("La asignatura " + pre.obtenerNombre() + " se orienta el dia: " + dia);
    }

}
