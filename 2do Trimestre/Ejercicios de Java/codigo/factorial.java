package codigo;

import java.security.PublicKey;
public class factorial {
	public static void main(String[] args) {
		int[] arrayEnteros=new int [5];
		int[] arrayEnteros1= {1,2,3,4};
		System.out.println(arrayEnteros1[3]);
		arrayEnteros1[3]=1;
		System.out.println(arrayEnteros1[3]);
		System.out.println(arrayEnteros.length);
		pasoPorReferenciaArray(arrayEnteros);
		System.out.println(arrayEnteros[1]+" el valor en posición 1");
		pasoPorReferenciaArray(arrayEnteros);
		System.out.println(arrayEnteros[1]+" el valor en posición 1");
		// Ejercicio 1 
		//Hacer una función que reciba un array de tipo numérico
		// Esa función tiene que recorrer todas las posiciones del array
		// asignando a cada posición el valor de la posición 
		// Fuera de esa función hacer un bucle para imprimir los datos
		// -> 'en la posición X está el valor Y'
		
		int[] arrayEjercicio1=new int[10];
		ejercicio1(arrayEjercicio1);
		for(int i=0;i<arrayEjercicio1.length;i++) {
			System.out.println("El valor en la posición: "+i+" es "+arrayEjercicio1[i]);
		}
		
		
		
		//Calcular el número de espacios en un string
		
		String txt="Hola_buenos_días_me_llamo_Andrés_y_he_merendado_una_manzana";
		char espacio = '_';
		int numEspacios=0;
		for(int i=0;i<txt.length();i++) {
			if(txt.charAt(i)==espacio) {
				numEspacios+=1;
			}
		}	
		System.out.println(numEspacios);
	}
	/*****************************************/
	public static void pasoPorReferenciaArray(int[] aux) {
		aux[1]=1000;
	}
	
	/*
	 * 
	 * Hacer una función que reciba un array de tipo numérico
	 * Esa función tiene que recorrer todas las posiciones del array
	 * asignando a cada posición el valor de la posición
	 * 
	 * Fuera de esa función hacer un bucle parai mprimir los datos
	 * -> 'en la posición X está el valor Y'
	 * 
	 */
	public static void ejercicio1(int[] arrayNumerico) {
		for(int i=0;i<arrayNumerico.length;i++) {
			arrayNumerico[i]=i;
		}
		
		
	// Declara un array de 10 posiciones con números aleatorios
	// Dime cual es la suma de todos sus valores
		
		int [] arrayNums= {1,2,3,8,15,22,18,41,50};
		int sumaInt=0;
		for(int i=0;i<arrayNums.length;i++) {
			sumaInt+=arrayNums[i];
		}
		System.out.println("La suma de los números del array es: "+sumaInt);
		
	//Ahora sumo los números pares
		
		int sumaPares=0;
		for(int j=0;j<arrayNums.length;j++) {
			if(arrayNums[j]%2==0) {
				sumaPares+=arrayNums[j];
			}
		}
		System.out.println(sumaPares);
	}
	
	/*
	 * Declara un array de 10 posiciones con números aleatorios
	 * Dime cual es el valor máx de ese array
	 * 
	 */
}

