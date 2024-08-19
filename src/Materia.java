import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Materia {
    String nombre;
    int noCréditos;
    private Profesor profesor;

    static ArrayList<Materia> materias = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public Materia() {}

    public Materia(String nombre, int noCréditos, String profesor) {
        this.nombre = nombre;
        this.noCréditos = noCréditos;
    }

    public void getDetalles() {
        System.out.println("Nombre de la Materia: " + nombre);
        System.out.println("No. Créditos: " + noCréditos);
        //System.out.println("Profesor: " + profesor.getNombre());
    }

    public void registrarMateria() {
        System.out.print("Nombre de la Materia: ");
        nombre = scanner.nextLine();
        System.out.print("No. Créditos: ");
        noCréditos = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Nombre del Profesor: ");
        System.out.println("Materia registrada exitosamente.");
    }

    public void eliminarMateria() {
        System.out.print("Ingrese el nombre de la Materia a eliminar: ");
        String nombre = scanner.nextLine();
        Iterator<Materia> iterator = materias.iterator();
        while (iterator.hasNext()) {
            Materia materia = iterator.next();
            if (materia.nombre.equalsIgnoreCase(nombre)) {
                iterator.remove();
                System.out.println("Materia eliminada exitosamente.");
                return;
            }
        }
        System.out.println("Materia no encontrada.");
    }
}
