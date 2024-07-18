
/*
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.*;

public class juego_del_ahorcado_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		String palabra=new String();
		IntroducirPalabras(scan,palabra,lista);
		PalabraAleatoriaEscogida(palabra,lista);
		IntroducirLetras(scan,lista);
		
		do {
			
		}while(true);
		
	}
	
	public static void IntroducirPalabras(Scanner scan,String palabra,List<String> lista) {
		System.out.println("Introduce 4 palabras diferentes: ");
		for(int i=0;i<4;i++) {
			System.out.print((i+1)+".- ");
			palabra = scan.nextLine();
			lista.add(palabra);
		}
		System.out.println("Las palabras ingresadas son: "+lista);
	}
	
	public static void PalabraAleatoriaEscogida(String palabra,List<String> lista) {
		int numeroAleatorio=(int)(random()*4+1);
		switch (numeroAleatorio) {
		case 1:
			palabra=lista.get(0);
			break;
		case 2:
			palabra=lista.get(1);
			break;
		case 3:
			palabra=lista.get(2);
			break;
		case 4:
			palabra=lista.get(3);
			break;
		default:
			break;
		}
		System.out.println("La palabra aleatoria escogida es: "+palabra);
	}
	
	public static void EspaciosEnBlanco() {
		
	}
	
	public static void IntroducirLetras(Scanner scan, List<String> lista) {
		
	}
	public static void RecorrePalabras() {
		
	}
	
	public static void RellenarEspasciosEnBlanco() {
		
	}
}