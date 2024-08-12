package casas_solucion_Emmanuel;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Date fecha = new Date();
		// OBJETOS
		Casa miCasa = new Casa("Salamanca",6,4500000.0);
		Chalet miChalet = new Chalet("Retiro",8,2000000.0,400);
		Cabaña miCabaña = new Cabaña("Villalba",8,2150000.0,true);
		Atico miAtico = new Atico("Bilbao", 2, 100000.0, 2);
		
		// INFORMACION
		System.out.println(fecha.toString());
		// 1999-1900 para que muestre en pantalla la fecha correcta --> 1999
		Date fechaAux = new Date(1999-1900,4,28);
		System.out.println(fechaAux);
		System.out.println("<--------------------- Mi Casa ----------------------->");
		miCasa.mostrarInformacion();
		System.out.println("");
		miChalet.mostrarInformacion();
		miChalet.mostrarPiscina();
		System.out.println("");
		miCabaña.mostrarInformacion();
		System.out.println("");
		miAtico.mostrarInformacion();
	}
}