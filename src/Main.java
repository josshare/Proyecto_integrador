import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Capturar 2 profesores
        for (int i = 0; i < 2; i++) {
            System.out.println("Registro de Profesor " + (i + 1));
            Profesor profesor = new Profesor();
            profesor.registrarProfesor();
            Profesor.profesores.add(profesor);
        }

        // Capturar 3 materias
        for (int i = 0; i < 3; i++) {
            System.out.println("Registro de Materia " + (i + 1));
            Materia materia = new Materia();
            materia.registrarMateria();
            Materia.materias.add(materia);
        }

        // Capturar 2 alumnos
        for (int i = 0; i < 2; i++) {
            System.out.println("Registro de Alumno " + (i + 1));
            Alumno alumno = new Alumno();
            alumno.registrarAlumno();
            Alumno.alumnos.add(alumno);
        }

        // Menú para visualizar información
        while (true) {
            System.out.println("Desea visualizar:");
            System.out.println("1. Profesor");
            System.out.println("2. Materia");
            System.out.println("3. Alumno");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    visualizarProfesor();
                    break;
                case 2:
                    visualizarMateria();
                    break;
                case 3:
                    visualizarAlumno();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void visualizarProfesor() {
        System.out.print("Ingrese el No. de Cédula del profesor: ");
        int noCedula = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Profesor profesor : Profesor.profesores) {
            if (profesor.noCedula == noCedula) {
                profesor.getDetalles();
                return;
            }
        }
        System.out.println("Profesor no encontrado.");
    }

    public static void visualizarMateria() {
        System.out.print("Ingrese el nombre de la Materia: ");
        String nombre = scanner.nextLine();
        for (Materia materia : Materia.materias) {
            if (materia.nombre.equalsIgnoreCase(nombre)) {
                materia.getDetalles();
                return;
            }
        }
        System.out.println("Materia no encontrada.");
    }

    public static void visualizarAlumno() {
        System.out.print("Ingrese el No. de Control Escolar del alumno: ");
        int noControlEscolar = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Alumno alumno : Alumno.alumnos) {
            if (alumno.noControlEscolar == noControlEscolar) {
                alumno.getDetalles();
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }
}
