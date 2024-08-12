package emmanuelCordovaMuñoz_AEA1T1;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;

public class huevadas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		metodos_de_listas();
		System.out.println();
		
		matriz_impresa();
		System.out.println();
		
		jugando_con_metodos_de_listas();
		System.out.println();
		
		lista_con_numeros_aleatorios_sin_repetir();
		System.out.println();
	}
	
	public static void metodos_de_listas() {
		ArrayList<Float> lista_1 =new ArrayList<Float>();
		
		lista_1.add(3.14f);
		lista_1.add(2.0f);
		lista_1.add(7.5f);
		
		System.out.println(lista_1);
		System.out.println(lista_1.get(2));
		lista_1.set(1, 6.22f);
		System.out.println(lista_1);
		
		lista_1.set(1, 8.32f);
		lista_1.set(0, null);
		lista_1.set(2, 1.2533f);
		System.out.println(lista_1);
		
		lista_1.set(0,45.324f);
		System.out.println(lista_1);
	}
	
	public static void matriz_impresa() {
		int [][] matriz = new int [5][5];
		for(int i=0;i<matriz.length;i++) {
			System.out.println();
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j]=(int)(random()*9+1);
				System.out.print(matriz[i][j]+" ");
			}
		}
		System.out.println();
	}
	
	public static void jugando_con_metodos_de_listas() {
		ArrayList<Integer> lista_2 = new ArrayList<Integer>();
		for(int i=1;i<10;i++) {
			lista_2.add(i);
		}
		
		System.out.println(lista_2);
		
		for(int j=0;j<9;j++) {
			lista_2.set(j, (int)(random()*9+1));
		}
		System.out.print(lista_2);
		System.out.println();
	}
	
	public static void lista_con_numeros_aleatorios_sin_repetir() {
		ArrayList<Integer> lista_3 = new ArrayList<Integer>();
	        for(int i=0;i<10;i++) {
	            int numeroAleatorio;   
	            do{
	            	numeroAleatorio = (int)(random()*50+1);
	            }while(lista_3.contains(numeroAleatorio));
	            lista_3.add(numeroAleatorio);
	        }
	        System.out.println(lista_3);
	}
}