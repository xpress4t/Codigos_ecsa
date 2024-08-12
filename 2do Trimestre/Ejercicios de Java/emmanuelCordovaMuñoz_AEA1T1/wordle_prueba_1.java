package emmanuelCordovaMuñoz_AEA1T1;

import java.util.Random;
import java.util.Scanner;

public class wordle_prueba_1 {

	public static void main(String[] args) throws Exception {
		Random rd = new Random();
		Scanner scan = new Scanner (System.in);
		
		int vidas = 5;
		String palabraOculta = "raton";
		String intentoPalabra="";
		
		System.out.println("\t\tWORDLE");
		System.out.println("Intenta adivinar la palabra secreta del día.");
		
		ingresarPalabra(scan,intentoPalabra);
		espaciosEnBlanco();
	}
	
	public static void ingresarPalabra(Scanner scan,String intentoPalabra) {
		do {
			try {
				System.out.println("Ingresa una palabra de 5 letras: ");
				intentoPalabra = scan.next();
			} catch (Exception e) {
				System.out.println(e);
				System.err.println("Esta palabra no tiene 5 letras, inténtalo de nuevo.");
			}
		}while(intentoPalabra.length()>5 || intentoPalabra.length()<5);
	}
	
	public static void espaciosEnBlanco() {
		for(int i=0;i<5;i++) {
			System.out.println("");
			for(int j=0;j<5;j++) {
				System.out.print("  ["+" ] ");
			}
		}
	}
}