import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.InputMismatchException;

class Profesor extends Persona {
    String especialidad;
    String titulo;
    int noCedula;

    static ArrayList<Profesor> profesores = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public Profesor() {}

    public Profesor(String nombre, String apellido, String sexo, int edad, String titulo, int noCedula) {
        super(nombre, apellido, edad, sexo);
        this.especialidad = especialidad;
    }
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void getDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad);
        System.out.println("Título: " + titulo);
        System.out.println("No. Cédula: " + noCedula);
    }

    public void registrarProfesor() {
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        apellido = scanner.nextLine();
        System.out.print("Sexo: ");
        sexo = scanner.nextLine();
        System.out.print("Edad: ");
        try {
            edad = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida para la edad. Por favor, ingrese un número entero.");
            scanner.nextLine(); // Consume the invalid input
            return; // Exit the method if the input is invalid
        }
        scanner.nextLine(); // Consume newline
        System.out.print("Título: ");
        titulo = scanner.nextLine();
        System.out.print("No. Cédula: ");
        try {
            noCedula = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Numero de Cédula no Valido. Por favor, ingrese un número entero.");
            scanner.nextLine(); // Consume the invalid input
            return; // Exit the method if the input is invalid
        }
        scanner.nextLine(); // Consume newline
        System.out.println("Profesor registrado exitosamente.");
    }

    public void eliminarProfesor() {
        System.out.print("Ingrese el No. de Cédula del profesor a eliminar: ");
        int noCedula = scanner.nextInt();
        Iterator<Profesor> iterator = profesores.iterator();
        while (iterator.hasNext()) {
            Profesor profesor = iterator.next();
            if (profesor.noCedula == noCedula) {
                iterator.remove();
                System.out.println("Profesor eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Profesor no encontrado.");
    }
}