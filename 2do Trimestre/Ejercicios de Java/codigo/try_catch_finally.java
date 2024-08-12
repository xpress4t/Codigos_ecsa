package codigo;
public class try_catch_finally {
	public static void main(String[] args) {
		int[]num=new int[6];
		int num1=5;
		try {
			System.out.println(num[3]);
			System.out.println(num1/0);
		// CUANDO TE SALES DE UN ARRAY --> (ArrayIndexOutOfBoundsException e)
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Ha ocurrido un error(array): "+e);
		}catch(ArithmeticException e) {
			System.err.println("Ha ocurrido un error(dividir/0): "+e);
		}catch(Exception e){
			System.out.println("Excepción geérica");
		}
		finally {
			System.out.println("Este es el bloque finally");
		}
		System.out.println("Esto SI que se va a ejecutar");
		
		// Excepción tipo NullPointerException
		String cadena_1 = null;
		try {      
			int longitud = cadena_1.length();        
			System.out.println("Longitud de la cadena: " + longitud); 
		}catch (NullPointerException e) {  
			System.err.println("Error: Se produjo una NullPointerException.");
		}
		
		// Excepción tipo NumberFormatException
		String numeroTexto = "abc123";
        try {
            int numero = Integer.parseInt(numeroTexto);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error: No se pudo convertir la cadena a número.");
        }
        
        // Excepción tipo StringIndexOutOfBoundsException
        String cadena_2 = "Hola";
        try {
            char caracter = cadena_2.charAt(10);
            System.out.println("Carácter: " + caracter);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Error: Se produjo una StringIndexOutOfBoundsException.");
        }
        
        // Excepción tipo NegativeArraySizeException
        int tamaño = -5;
        try {
            int[] array = new int[tamaño];
            System.out.println("Arreglo creado con tamaño: " + tamaño);
        } catch (NegativeArraySizeException e) {
            System.err.println("Error: Se produjo una NegativeArraySizeException.");
        }
        
        
        
	}
}