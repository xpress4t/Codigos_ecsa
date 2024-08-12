package codigo;
public class Ejercicios1 {
	public static void main(String[] args) {
		
		// parse --> cambiar tipo de dato
		
		String txt = "524";
		int numeroEntero = Integer.parseInt(txt);
		System.out.println(numeroEntero);
		System.out.println(txt);
		
		
		String txt1 = "532.62";
		double numeroDouble = Double.parseDouble(txt1);
		System.out.println(numeroDouble);
		System.out.println(txt1);
		
		
		String txt2 = "35845.293";
		float numeroFloat = Float.parseFloat(txt2);
		System.out.println(numeroFloat);
		System.out.println(txt2);
		
		
		int numeroDoubleToEntero = (int)numeroDouble;
		System.out.println(numeroDoubleToEntero);
		
		
		String txtNum = numeroDoubleToEntero+"";
		String b="TrUe";
		boolean boleano=Boolean.parseBoolean(b);
		System.out.println(boleano);
		
		System.out.println("Valores máx y mín de los enteros");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("Valores máx y mín de los doubles");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		/*
		 * 
		 * Hacer una función que pida 2 string, que los convierta a doubles y los sume 
		 * tiene que devolver el dato resultante en formato entero
		 * 
		 * 
		 * Hacer una funcion que pida 2 enteros, y que los concatene en un string 
		 * por ejemplo --> num1 = 1 y num2 = 12 --> string resultante 112
		 * Devolver el string resultante
		 * 
		 * 
		 * Hacer una función que acepte un tipo de dato double
		 * decir qué tipo de dato numérico es el más adecuado
		 * por ejemplo double d = 45 --> me tendría que decir "short"
		 * por ejemplo double d = 451254215693469867468 --> me tendría que decir long
		 * ignorar los que tengan decimales
		 * 
		 */
		
	}	
	
	
}
