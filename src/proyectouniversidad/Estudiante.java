package proyectouniversidad;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class Estudiante {

    private String nombre;
    private Date fechaNacimiento;

    public Estudiante(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Date obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
