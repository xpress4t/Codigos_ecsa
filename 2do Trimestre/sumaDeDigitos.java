public class sumaDeDigitos {
	public static void main(String[] args) {
		// Escribo el número que quiero hallar la suma de digitos
		String numero="14435";
		// Lo convierto a un long por si se me ocurre cambiar de número a uno más largo
		long numeroEntero=Long.parseLong(numero);
		long suma = sumaDeDigitos(numero);
		System.out.println("La suma de dígitos del número "+numero+" es: "+suma);
	}
	
	//Declaro una función la cual retornará la suma de dígitos
	public static long sumaDeDigitos(String numero) {
		int suma=0;
		for(int i=0;i<numero.length();i++) {
			// "Character.getNumericValue" regresa el valor int numérico 
			suma+=Character.getNumericValue(numero.charAt(i));
		}
		return suma;
	}
}
