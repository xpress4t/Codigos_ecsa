import java.util.Arrays;
import java.util.Scanner;
public class Experimentos_en_java {
	public static void main(String[] args) {
		// DECLARO UN ARRAY DE 5 ELEMENTOS
		int[] array=new int[5];
		
		// DECLARO EL Scanner PARA EL INGRESO DE DATOS
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingresa los datos del vector o array: ");
		
		// HAGO UN BUCLE PARA PEDIR LA MISMA CANTIDAD DE DATOS QUE LA LONGITUD DEL ARRAY
		for(int i=0;i<5;i++) {
			// ESCRIBO "i+1" PARA QUE EMPIECE DESDE 1 Y NO DESDE 0
			System.out.print("Posición "+(i+1)+" : ");
			array[i]=scan.nextInt();	
		}
		System.out.print("El array será: ");
		/*
		 * Arrays.toString(); SIRVE PARA IMPRIMIR EL ARRAY FINAL
		 * SIN LA NECESIDAD DE HACER OTRO BUCLE PARA IMPRIMIRLO
		 */
		System.out.println(Arrays.toString(array));
		System.out.print("El orden inverso será: [");
		
		/*
		 * SE PONE "-1" AL array.length YA QUE
		 * SE TIENE QUE EMPEZAR CON EL "i" DESDE LA POSICIÓN INICIAL QUE ES "0"
		 * ES DECIR, QUE SI PONEMOS SOLO array.length, 
		 * EL BUCLE LLEGARÍA HASTA LA POSICIÓN 5, COSA QUE ES INCORRECTO
		 * YA QUE AL EMPEZAR DESDE UN i=0 SERÍAN 6 POSICIONES (0, 1, 2, 3, 4, 5)
		 * Y LO CORRECTO SERÍA SOLO (0, 1, 2, 3, 4)
		 */
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(" "+array[i]+" ");
		}
		System.out.println("]");
		System.out.println("-------------------------------------------");
		
		System.out.println("Array con números aleatorios entre 1 y 100: ");
		/*
		 * HAGO UN BUCLE for PARA IMPRIMIR UN ARRAY DE 5 ELEMENTOS CON
		 * NÚMEROS ALEATORIOS COMPRENDIDOS ENTRE 1 Y 100
		 */
		for(int j=0;j<5;j++) {
			array[j]=(int)(Math.random()*100+1);
			System.out.println("Posición "+(j+1)+" : "+array[j]);
		}
		System.out.print("El array de números aleatorios será: ");
		System.out.println(Arrays.toString(array));
	}
}