import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Profesor implements Persona {
    String nombre;
    String apellido;
    String sexo;
    int edad;
    String titulo;
    int noCedula;

    static ArrayList<Profesor> profesores = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public Profesor() {}

    public Profesor(String nombre, String apellido, String sexo, int edad, String titulo, int noCedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.titulo = titulo;
        this.noCedula = noCedula;
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
        edad = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Título: ");
        titulo = scanner.nextLine();
        System.out.print("No. Cédula: ");
        noCedula = scanner.nextInt();
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