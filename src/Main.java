import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Jose", "Martinez", 1, 20, "Masculino", "cuarto", new ArrayList<>());
        Alumno.alumnos.add(alumno);
        alumno.getDetalles();

        // Ejemplo de uso de los métodos
        alumno.registrarAlumno();
        alumno.agregarMateria();
        alumno.eliminarMateria();
        alumno.eliminarAlumno();

        Profesor profesor = new Profesor("Maria", "Gomez", "Femenino", 40, "Ingeniería", 12345);
        profesor.registrarProfesor();
        profesor.eliminarProfesor();

        Materia materia = new Materia("Matemáticas", 4, "Profesor A");
        materia.registrarMateria();
        materia.eliminarMateria();
    }
}