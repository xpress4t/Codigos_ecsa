import java.util.Scanner;
public class matrizConDatosIngresados {
	public static void main(String[] args) {
		Scanner imprimir=new Scanner(System.in);

		// Ingreso un texto de tipo string
		String texto;
		System.out.print("Ingrese un texto: ");
		texto=imprimir.nextLine();
		System.out.println("El texto ingresado es: "+texto);
		System.out.println("");
		
		// Ingreso un número de tipo entero
		int numeroEntero;
		System.out.print("Ingrese un número entero: ");
		numeroEntero=imprimir.nextInt();
		System.out.println("El número ingresado es: "+numeroEntero);
		System.out.println("");
		
		// Ingreso un número de tipo double
		double numeroDouble;
		System.out.print("Ingrese un número double: ");
		numeroDouble=imprimir.nextDouble();
		System.out.println("El número ingresado es: "+numeroDouble);
		System.out.println("");
		
		// Ingreso un número de tipo flotante
		float numeroFlotante;
		System.out.print("Ingrese un número flotante: ");
		numeroFlotante=imprimir.nextFloat();
		System.out.println("El número ingresado es: "+numeroFlotante);
		System.out.println("");
		
		// Ingreso una letra de tipo char
		char letra;
		System.out.print("Ingrese un caracter: ");
		letra=imprimir.next().charAt(0);
		System.out.println("La letra ingresada es: "+letra);
	}
}
