/*
 * crea un metodo que lance una excepcion, el metodo deberá recibir un nombre 
 * y posteriormente crear un arreglo de tipo char 
 * que contenga cada uno de los caracteres de la palabra,
 * si la palabra tiene mas de 5 caracteres, mandas la excepcion, 
 * sino, devuelves el arreglo resultante. 
 * Posterioremente usa el metodo con su respectivo try-catch. en java
 * 
 */
import java.util.Scanner;
public class ProblemaDeExcepciones {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese un nombre: ");
		String x=scan.nextLine();
		try {
			String cadena=nombreExcepcion(x);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error tipo: StringIndexOutOfBoundsException");
		}
	}
	public static String nombreExcepcion(String nombre) throws Exception {
		if(nombre.length()>5) {
			throw new Exception("El nombre sobrepasó el rango de 5 letras.");
		}
		return nombre;
	}
}