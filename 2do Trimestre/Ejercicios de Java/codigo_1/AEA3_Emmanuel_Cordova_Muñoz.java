package codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class AEA3_Emmanuel_Cordova_Muñoz {

	public static void main(String[] args) {
		List<String> tablero = new ArrayList<>();
		List<String> letras_del_tablero = new ArrayList<>();
		List<Integer> numeros_del_tablero = new ArrayList<>();
		
		Random rd = new Random();
		
		// Defino las variables que utilizaré en el juego
		String equipo_1="X";
		String equipo_2="O";
		String agua="-";
		String hundido="=";
		
		tablero5x5(equipo_1,rd,tablero,letras_del_tablero,numeros_del_tablero);
		disparos();
		verificarTablero(equipo_1,rd,tablero,letras_del_tablero,numeros_del_tablero);
	}
	
	// Defino la función tablero que es donde imprimiré y añadiré los ejes X e Y 
	public static void tablero5x5(String equipo_1,Random rd,List<String>tablero,List<String>letras_del_tablero,List<Integer>numeros_del_tablero) {
		
		// Agrego las letras al tablero para el eje X 
		letras_del_tablero.add("A");
		letras_del_tablero.add("B");
		letras_del_tablero.add("C");
		letras_del_tablero.add("D");
		letras_del_tablero.add("E");
		
		// Agrego los números al tablero para el eje Y
		numeros_del_tablero.add(1);
		numeros_del_tablero.add(2);
		numeros_del_tablero.add(3);
		numeros_del_tablero.add(4);
		numeros_del_tablero.add(5);
		
		//Creo un bucle utilizando for y el método .add de ArrayList para imprimir el tablero
		System.out.println("  "+letras_del_tablero);
		tablero.add(0,equipo_1);
		for(int i=0;i<5;i++) {
			System.out.print("");
			for(int j=0;j<1;j++) {
				tablero.add("_");
			}
		}
		
		for(int k=0;k<5;k++) {
			System.out.print(numeros_del_tablero.get(k)+" ");
			System.out.println(tablero);
		}
		
	}
	
	// Defino la función donde se realizarán los disparos aleatorios en el tablero
	public static void disparos() {
		String proyectil="#";
		
	}
	
	// Defino la función para verificar si el tablero estará lleno luego de los disparos 
	public static void verificarTablero(String equipo_1,Random rd,List<String>tablero,List<String>letras_del_tablero,List<Integer>numeros_del_tablero) {
		do {
			System.out.println("");
			tablero5x5(equipo_1,rd,tablero,letras_del_tablero,numeros_del_tablero);
		}while(tablero.isEmpty());
	}
}