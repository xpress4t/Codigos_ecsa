package codigo;
public class ejerciciosDeRepaso {
	public static void main(String[] args) {
		
		// el trin quita el inicio y el final
		
		/* EJERCICIO 1
		 * Suma y Resta de Números Enteros: Escribe un programa que solicite al usuario dos
		 * números enteros y luego muestre la suma y la resta de esos números.
		 */
	int numero_entero_1=17;
	int numero_entero_2=28;
	calcularSuma(numero_entero_1,numero_entero_2);
	
	float a=15.43f;
	float b=24.94f;
	calcularMultiplicacion(a,b);
	
	int num=19987;
	}
	
	// Ejercicio 1
	public static void calcularSuma(int numero_entero_1,int numero_entero_2) {
		int suma=numero_entero_1+numero_entero_2;
		System.out.println("La suma de los dos enteros ingresados es: "+suma);
	}
	
	// Ejercicio 2
	public static void calcularMultiplicacion(float a,float b) {
		float multiplicacion=a*b;
		System.out.println("La multiplicacion de los flotantes ingresados es: "+multiplicacion);
	}
	
	// Ejercicio 3
}