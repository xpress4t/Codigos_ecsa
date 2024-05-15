public class sumaDeDigDeUnNum {
	public static void main(String[] args) {
		String numero="1449535";
		long suma = sumaDeDigitos(numero);
		System.out.println("La suma de dígitos del número "+numero+" es: "+suma);
	}
	public static long sumaDeDigitos(String numero) {
		int suma=0;
		for(int i=0;i<numero.length();i++) {
			suma+=Character.getNumericValue(numero.charAt(i));
		}
		return suma;
	}
}
