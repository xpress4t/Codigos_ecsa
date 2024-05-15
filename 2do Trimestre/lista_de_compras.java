/*
 * Ejercicio: Simulador de Lista de la Compra
	Objetivo: Crear una aplicación de consola en Java que permita al usuario añadir y eliminar productos de una lista de la compra.
	
	INSTRUCCIONES:
	
	1.	Utiliza Scanner para leer la entrada del usuario.
	2.	Crea un ArrayList<String> para almacenar los nombres de los productos de la lista de la compra.
	3.	Implementa un menú con las siguientes opciones:
	
		•	Añadir un producto a la lista.
		•	Eliminar un producto de la lista por nombre.
		•	Mostrar todos los productos en la lista.
		•	Salir del programa.
		
	CONSIDERACIONES:
	
		•	Cuando se añade un producto, el programa debe preguntar al usuario por el nombre del producto y luego añadirlo al ArrayList.
		•	Al eliminar un producto, el programa debe preguntar por el nombre del producto. 
			Si el producto está en la lista, debe ser eliminado. Si no, muestra un mensaje de error.
		•	Al mostrar los productos, enumera cada producto con un índice para facilitar la visualización.
		•	Asegúrate de manejar cualquier excepción que pueda ocurrir, como entradas no válidas del usuario.

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lista_de_compras {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		List<String> lista_de_compras = new ArrayList<>();
		int opcion;
		do {
			System.out.println("\t\tBienvenido a El Corte Inglés");
			System.out.println();
			System.out.println("1.- Añadir un producto a la lista.");
			System.out.println("2.- Eliminar un producto de la lista por nombre.");
			System.out.println("3.- Mostrar todos los productos en la lista.");
			System.out.println("4.- Salir del programa.");
			System.out.println();
			System.out.print("Seleccione una opción: ");
			opcion=seleccion_de_opcion(scan);
			switch (opcion) {
			case 1:
				añadir_producto(scan,lista_de_compras);
				break;
			case 2:
				eliminar_producto(scan,lista_de_compras);
				break;
			case 3:
				mostrar_productos(lista_de_compras);
				break;
			case 4:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println();
				break;
			}
		}while(opcion!=4);
		scan.close();
	}
	
	public static int seleccion_de_opcion(Scanner scan) {
		try {
            return scan.nextInt();
        } catch (Exception e) {
            scan.nextLine();
            return -1;
        }
	}
	public static void añadir_producto(Scanner scan, List<String> lista_de_compras) {
		System.out.print("Ingrese el nombre del producto --> ");
		String producto=scan.next();
		lista_de_compras.add(producto);
		System.err.println(producto+" se añadió a la lista.");
		System.out.println();
	}
	public static void eliminar_producto(Scanner scan, List<String> lista_de_compras) {
		System.out.println("Ingrese el nombre del producto que desea eliminar --> ");
		String producto=scan.next();
		if(lista_de_compras.remove(producto)) {
			System.out.println(producto+" a sido eleiminado de la lista.");
		}else {
			System.out.println(producto+" no se encuentra en la lista.");
		}
	}
	public static void mostrar_productos(List<String> lista_de_compras) {
		System.out.println("Los productos de su lista son: ");
			for(int i=0;i<lista_de_compras.size();i++) {
				System.out.println((i+1)+".-"+lista_de_compras.get(i));
			}
	}
}