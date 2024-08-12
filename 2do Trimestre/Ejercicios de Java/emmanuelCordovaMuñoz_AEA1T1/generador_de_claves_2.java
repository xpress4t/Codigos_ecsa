package emmanuelCordovaMuñoz_AEA1T1;

import java.util.Random;
import java.util.Scanner;

public class generador_de_claves_2 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner (System.in);
		Random rd = new Random();
		String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String minusculas = "abcdefghijklmnñopqrstuvwxyz";
		String numeros = "0123456789";
		String caracteres = "()[]{}<>¡!¿?ºª·&^*¨Ç;'.,:_|@\\#~¬€$-+*/%=";
		
		pedirLongitud(scan);
		bucleParaCadaString(mayusculas,minusculas,numeros,caracteres);
		
	}
	
	public static void pedirLongitud(Scanner scan) throws Exception {
		int longitud=0;
		do {
			try {
				System.out.print("Ingrese la longitud de su contraseña: ");
				longitud = scan.nextInt();
			} catch (Exception e) {
				System.err.println("Intenta ingresar un dato válido");
				scan.nextLine();
				continue;
			}
		}while(longitud<12);
	}
	
	public static void bucleParaCadaString(String mayusculas, String minusculas, String numero, String caracteres) {
		
	}
	
}