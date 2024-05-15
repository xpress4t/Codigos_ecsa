public class EjercicioDeFunciones{
	/*
	 * Declaramos una funcion para cada uno de los tipos de datos:
	 * int, long, dobles, chars, string
	 * En cada una de las funciones tengo que declarar el tipo dato correspondiente
	 * Modificar esa variable
	 * 
	 * En el main tengo que llamar a todos esas funciones
	 * Modificar el orden de llamada 
	 * Probar a usar estructuras de control para llamar a las funciones en las 
	 * condiciones que querais
	 * 
	 */
	public static void main(String[] args) {
		entero();
		largo();
		dobles();
		caracteres();
		cadenas();
	}
	public static void entero() {
		int valor_1=100;
		System.out.println(valor_1);
	}
	public static void largo() {
		long valor_2=10000;
		System.out.println(valor_2);
	}
	public static void dobles() {
		double valor_3=10.324;
		System.out.println(valor_3);
	}
	public static void caracteres() {
		char valor_4='c';
		System.out.println(valor_4);
	}
	public static void cadenas() {
		String valor_5="Esto es una cadena";
		System.out.println(valor_5);
	}
}