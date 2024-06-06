public class funciones{
	public static void main(String[] args) {
		int i=0;
		
		System.out.println("El valor de i es:"+i);
		saludar();
		i++;
		System.out.println("El valor de i es:"+i);
		decirNombre("Andrés",18);
		areaRectangulo(5,15);
		System.out.println(areaRectangulo(5,15));
		int rectanguloArea=areaRectangulo(5,15);
		System.out.println("El área del rectángulo es: "+rectanguloArea);
		rectanguloArea++;
		

		// Comparación de cadenas
		String cadena1="Buenos";
		String cadena2="días";
		boolean texto=cadenasIguales(cadena1,cadena2);
		System.out.println("Las cadenas son: "+texto);
		
		// Ver si un número es par o impar
		int numero=12345;
		boolean parOimpar=numeroPar(numero);
		System.out.println(numero+" es: "+parOimpar);

		posCaracter("verde azul amarillo rojo negro blanco",11);
		System.out.println(posCaracter("verde azul amarillo rojo negro blanco",21));
		
		// Conversión de Celcius a Fahrenheit
		conversion(30);
		System.out.println("30.0ºC son "+conversion(30)+"ºF");
	}
	public static void saludar() {
		for(int i=0;i!=10;i++) {
			System.out.println("Saludos");
		}
	}
	public static void decirNombre(String nombre,int edad) {
		System.out.println("Hola buenos días: "+nombre+" y tengo: "+edad+" años");
		areaCuadrado(5);
	}
	public static void areaCuadrado(int lado) {
		System.out.println("El área del cuadrado es: "+lado*lado);
	}
	public static int areaRectangulo(int base,int altura) {
		return base*altura;
	}
	public static int numero() {
		return areaRectangulo(5,15);
	}
	
	
	public static char primerCaracter(String txt) {
		char c=txt.charAt(0);
		return c;
	}
	
	/*
	 * Funcion que verifique si ,
	 * dos cadenas de texto son iguales
	 *  y que devuelva un true o false
	 *  
	 */
	
	public static boolean cadenasIguales(String cadena1,String cadena2) {
		if(cadena1.equals(cadena2)) {
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * Funcion que devuelva un booleano 
	 * que me diga si un numero es par o impar
	 * 
	 */
	public static boolean numeroPar(int numero) {
		if(numero%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	// funcion que me pida el string y numero (posicion del caracter ) y la posicion correspondiente que yo quiera saber 
	// o sea que escribo emmanuel y quiera la posicion 6
	
	public static char posCaracter(String texto,int posicion) {
		if (texto.length()-1>posicion) {
			return texto.charAt(posicion);
		}
		return '0';
		
	}
	
	// funcion que convierta grados celcius a fahrenheit
	// (30 °C × 9 / 5) + 32 = 86 °F
	
	public static double conversion(double temperatura_1) {
		return (((temperatura_1*9)/5)+32);
	}
}