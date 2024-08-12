package emmanuelCordovaMuñoz_AEA1T1;

import java.util.Random;
import java.util.Scanner;
/*
 * 1. CREAR UN OBJETO Random PARA GENERAR NÚMEROS ALEATORIOS.
 * 2. UTILIZA UN OBJETO Scanner PARA OBTENER LA LONGITUD DESEADA DE LA CONTRASEÑA DEL USUARIO.
 * 3. DEFINE UNA CADENA DE CARACTERES QUE CONTENGA LETRAS MAYÚSCULAS, LETRAS MINÚSCULAS, DÍGITOS 
 * 	  Y CARACTERES ESPECIALES. PUEDES PERSONALIZAR ESTA CADENA SEGÚN TUS PREFERENCIAS.
 * 4. UTILIZA UN BUCLE PARA GENERAR LA CONTRASEÑA ALEATORIA. EN CADA ITERACIÓN DE BUCLE, ELIGE 
 * 	  ALEATORIAMENTE UN CARACTER DE LA CADENA DEFINIDA Y AGRÉGALO A LA CONTRASEÑA GENERADA.
 * 5. ASEGÚRATE DE QUE LA LONGITUD DE LA CONTRASEÑA GENERADA COINCIDA CON LA LONGITUD ESPECIFICADA
 * 	  POR EL USUARIO.
 * 6. MUESTRA LA CONTRASEÑA GENERADA AL USUARIO AL FINALIZAR EL PROGRAMA.
 * 7. LA CONTRASEÑA DEBE CONTENER, AL MENOS, 3 NÚMEROS, 3 LETRAS Y 3 CARACTERES ESPECIALES.
 * 
 */
public class generador_de_claves {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String minusculas = "abcdefghijklmnñopqrstuvwxyz";
		String numeros = "0123456789";
		String caracteres = "()[]{}<>¡!¿?ºª·&^*¨Ç;'.,:_|@\\#~¬€$-+*/%=";
		
		bucle(mayusculas,minusculas,numeros,caracteres,rd);
	}
	
	public static void bucle(String mayusculas,String minusculas, String numeros, String caracteres,Random rd) {
			for(int i=0;i<3;i++) {
				int a = rd.nextInt(mayusculas.length());
	            char elemento = mayusculas.charAt(a);
	            System.out.print(elemento);
			}
			for(int j=0;j<3;j++) {
				int a = rd.nextInt(minusculas.length());
	            char elemento = minusculas.charAt(a);
	            System.out.print(elemento);
			}
			for(int m=0;m<3;m++) {
				int a = rd.nextInt(numeros.length());
	            char elemento = numeros.charAt(a);
	            System.out.print(elemento);
			}
			for(int n=0;n<3;n++) {
				int a = rd.nextInt(caracteres.length());
	            char elemento = caracteres.charAt(a);
	            System.out.print(elemento);
			}
	}
}