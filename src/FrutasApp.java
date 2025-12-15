import java.util.ArrayList;
import java.util.Scanner;

public class FrutasApp {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(sc);

            switch (opcion) {
                case 1:
                    verFrutas(frutas);
                    break;
                case 2:
                    añadirFruta(frutas, sc);
                    break;
                case 3:
                    System.out.println("Función aún no implementada.");
                    break;
                case 4:
                    System.out.println("Función aún no implementada.");
                    break;
                case 5:
                    System.out.println("Función aún no implementada.");
                    break;
                case 0:
                    System.out.println("Adiós.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    /* ---------- Funciones ---------- */

    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Ver frutas");
        System.out.println("2. Añadir fruta");
        System.out.println("3. Borrar fruta por nombre");
        System.out.println("4. Buscar fruta");
        System.out.println("5. Ver cantidad total");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    public static int leerEntero(Scanner sc) {
        int valor = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return valor;
    }

    public static void verFrutas(ArrayList<String> frutas) {
        System.out.println("\nFrutas actuales:");
        if (frutas.isEmpty()) {
            System.out.println("(vacío)");
        } else {
            for (String f : frutas) {
                System.out.println("- " + f);
            }
        }
    }

    /* ---------- Funciones pendientes ---------- */

    public static void añadirFruta(ArrayList<String> frutas, Scanner sc) {
        System.out.print("Nombre de la fruta a añadir: ");
        String nombre = sc.nextLine();
        if (frutas.contains(nombre)) {
            System.out.println("Esa fruta ya existe.");
        } else {
            frutas.add(nombre);
            System.out.println("Fruta añadida.");
        }
    }

    public static void borrarFruta(ArrayList<String> frutas, Scanner sc) {
        // Pendiente
    }

    public static void buscarFruta(ArrayList<String> frutas, Scanner sc) {
        // Pendiente
    }

    public static void verCantidad(ArrayList<String> frutas) {
        // Pendiente
    }
}