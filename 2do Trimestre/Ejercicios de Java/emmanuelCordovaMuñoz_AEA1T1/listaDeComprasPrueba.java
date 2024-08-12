package emmanuelCordovaMuñoz_AEA1T1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class listaDeComprasPrueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion(scanner);

            switch (opcion) {
                case 1:
                    agregarProducto(scanner, listaDeCompras);
                    break;
                case 2:
                    eliminarProducto(scanner, listaDeCompras);
                    break;
                case 3:
                    mostrarProductos(listaDeCompras);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("------ Menú ------");
        System.out.println("1. Añadir un producto a la lista.");
        System.out.println("2. Eliminar un producto de la lista por nombre.");
        System.out.println("3. Mostrar todos los productos en la lista.");
        System.out.println("4. Salir del programa.");
        System.out.print("Elige una opción: ");
    }

    private static int obtenerOpcion(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar el buffer del scanner
            return -1; // Opción no válida
        }
    }

    private static void agregarProducto(Scanner scanner, ArrayList<String> listaDeCompras) {
        System.out.print("Introduce el nombre del producto: ");
        String producto = scanner.next();
        listaDeCompras.add(producto);
        System.out.println(producto + " añadido a la lista.");
    }

    private static void eliminarProducto(Scanner scanner, ArrayList<String> listaDeCompras) {
        System.out.print("Introduce el nombre del producto a eliminar: ");
        String producto = scanner.next();
        if (listaDeCompras.remove(producto)) {
            System.out.println(producto + " eliminado de la lista.");
        } else {
            System.out.println("Error: " + producto + " no encontrado en la lista.");
        }
    }

    private static void mostrarProductos(ArrayList<String> listaDeCompras) {
        System.out.println("------ Productos en la lista ------");
        for (int i = 0; i < listaDeCompras.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
        }
    }
}
