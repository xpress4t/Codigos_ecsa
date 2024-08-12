package Aplicacion_de_reservas_para_cine;

import java.util.Date;

public class Menu {

	public static void main(String[] args) {
		Date fecha = new Date();
		Película pelicula1 = new Película("Hannibal", null, null, null);
		Película pelicula2 = new Película("Hachiko", null, null, null);
		Película pelicula3 = new Película("Interestellar", null, null, null);
		Película pelicula4 = new Película("Oppenheimer", null, null, null);
		Película pelicula5 = new Película("Forest Gump", null, null, null);
		
		do {
			System.out.println("               "+fecha);
			System.out.println("!************** Bienvenido a cines Cinesa *************!");
			System.out.println("1.- Ver cartelera");
			System.out.println("2.- Escoger película");
			System.out.println("3.- Escoger asientos");
			System.out.println("4.- Calcular gastos");
			System.out.println("5.- Atrás");
			System.out.println("6.- Salir");
		}while(false);
	}
}