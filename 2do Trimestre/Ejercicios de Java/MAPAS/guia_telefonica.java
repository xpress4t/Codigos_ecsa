package MAPAS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class guia_telefonica {

	public static void main(String[] args) {
		Map<String,String> guia = new HashMap<>();
		
		List<String> lista = new ArrayList<>();
		
		Map<String,List<String>> mapa = new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("");
			System.out.println("\t\tAgenda Telefónica Simple\n");
			System.out.println("1.- Añadir nombre y número de contacto");
			System.out.println("2.- Buscar número");
			System.out.println("3.- Eliminar número");
			System.out.println("4.- Añadir número extra");
			System.out.println("5.- Salir del programa\n");
			System.out.print("Elige una opción --> ");
			
			int opcion_ingresada=0;
			opcion_ingresada=scan.nextInt();
			scan.nextLine();
			switch (opcion_ingresada) {
				case 1:
					agregarNumero(guia,lista,scan);
					System.out.println();
					break;
				case 2:
					buscarNumero(guia,lista);
					System.out.println();
					break;
				case 3:
					eliminarNumero();
					System.out.println();
					break;
				case 4:
					agregarNumeroExtra();
					System.out.println();
					break;
	
			default:
				System.out.println("Hasta luego");
				break;
			}
		}
		
	}
	
	public static void agregarNumero(Map<String,String> guia,List<String> lista,Scanner scan) {
		System.out.print("\nNombre --> ");
		String nombre = scan.nextLine();
		System.out.print("Número --> ");
		String numero = scan.nextLine();
		
		String contacto=nombre+" : "+numero;
		String numeroExtra = "";
		guia.put(nombre,numeroExtra);
		lista.add(contacto);
		imprimirContactos(lista);
		
	}
	
	public static void imprimirContactos(List<String> lista) {
	    System.out.println("\nLista de contactos:");
	    for (String contacto : lista) {
	        System.out.println(contacto);
	    }
	}
	
	public static void buscarNumero(Map<String,String> guia,List<String> lista) {
		
	}
	
	public static void eliminarNumero() {
		
	}
	
	public static void agregarNumeroExtra() {
		
	}
	
	public static void opciones() {
		
	}

}
