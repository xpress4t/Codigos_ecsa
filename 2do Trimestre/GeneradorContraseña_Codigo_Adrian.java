import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GeneradorContraseña_Codigo_Adrian{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int longitud=0;
		boolean segura = false;
		boolean longitudCorrecta = false;
		String contraseña = null;
		
		// Control para introducir longitud correcta para la contraseña
		while (!longitudCorrecta) {
			System.out.print("Introduce la longitud de la contraseña --> ");
			try {
				longitud = sc.nextInt();
				if(longitud >= 9) {
					longitudCorrecta=true;
				}else {
					System.out.println("La longitud mínima es 9");
				}
				
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("ERROR: " + e);
			}
		}
		
		// Bucle para generar y comprobar contraseñas
		do {
			contraseña = generarContraseña(longitud);
			System.out.println(contraseña);
		}while (!esSegura(contraseña));
		
		System.out.println("Su contraseña es: " + contraseña);

	}

	// Función que devuelve la contraseña de la longitud deseada generada aleatoriamente
	public static String generarContraseña(int longitud) {
		String opciones= "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890,.-;:_<>!$%&/()=?¿'¡^`+*´Ç@|#~€";
		Random rd = new Random();
		int posicion;
		String contraseña = "";
		
		// Rellenamos la contraseña con valores aleatorios de "opciones"
		for (int i = 0 ; i < longitud ; i ++) {
			posicion = rd.nextInt(0,opciones.length());
			contraseña += opciones.charAt(posicion);
		}
		return contraseña;
	}

	// Función que comprueba si la contraseña contiene al menos 3 letras, 3 números y 3 caracteres especiales
	public static boolean esSegura(String contraseña) {
		int contadorNumeros = 0;
		int contadorLetras = 0;
		int contadorCaracteresEspeciales = 0;

		// Se comprueba de que tipo es cada caracter añadiendo un contador para cada tipo
		for (int i = 0; i < contraseña.length(); i++) {
			if (Character.isLetter(contraseña.charAt(i))) {
				contadorLetras++;
			}else if(Character.isDigit(contraseña.charAt(i))) {
				contadorNumeros++;
			}else {
				contadorCaracteresEspeciales++;
			}
		}
		
		if(contadorNumeros>=3 && contadorLetras>=3 && contadorCaracteresEspeciales>=3) {
			return true;
		}else {
			return false;
		}

	}

}
