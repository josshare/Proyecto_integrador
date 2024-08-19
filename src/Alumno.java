import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
class Alumno extends Persona implements EntidadEducativa {
    int noControlEscolar;
    String semestre;

    static ArrayList<Alumno> alumnos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public Alumno() {}

    public Alumno(String nombre, String apellido, int noControlEscolar, int edad, String sexo, String semestre, ArrayList<String> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.noControlEscolar = noControlEscolar;
        this.edad = edad;
        this.sexo = sexo;
        this.semestre = semestre;
    }

    //@Override
    public void getDetalles(Materia materia) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("No. Control Escolar: " + noControlEscolar);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Semestre: " + semestre);
        System.out.println("Materias: " + materia);
    }

    @Override
    public void registrar() {
        registrarAlumno();
    }

    @Override
    public void eliminar() {
        eliminarAlumno();
    }

    public void registrarAlumno() {
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        apellido = scanner.nextLine();
        System.out.print("No. Control Escolar: ");
        noControlEscolar = scanner.nextInt();
        System.out.print("Edad: ");
        try {
            edad = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida para la edad. Por favor, ingrese un número entero.");
            scanner.nextLine(); // Consume the invalid input
            return; // Exit the method if the input is invalid
        }
        scanner.nextLine(); // Consume newline
        System.out.print("Sexo: ");
        sexo = scanner.nextLine();
        System.out.print("Semestre: ");
        semestre = scanner.nextLine();
        //materias = new ArrayList<>();
        System.out.println("Alumno registrado exitosamente.");
    }

    public void eliminarAlumno() {
        System.out.print("Ingrese el No. de Control Escolar del alumno a eliminar: ");
        int noControlEscolar = scanner.nextInt();
        Iterator<Alumno> iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = iterator.next();
            if (alumno.noControlEscolar == noControlEscolar) {
                iterator.remove();
                System.out.println("Alumno eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }
}
