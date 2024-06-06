import java.util.ArrayList;
import java.util.Scanner;

public class Wordle_codigo_Adrian{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Sentencias
		ArrayList<String> palabras = new ArrayList<String>();
		String palabraDiaria = "texto";
		String palabraUsuario = "";
		int vidas = 6;
		
		// Inicio
		System.out.println("--------------------------------------------");
		System.out.println("     	    --> W O R D L E <--  		    ");
		System.out.println("--------------------------------------------");

		// Bucle principal hasta que no haya vidas o acertemos
		while (vidas > 0) {
			System.out.print("\nIntroduce una palabra --> ");
			
			palabraUsuario = pedirPalabra(sc, palabraDiaria);
			
			// Si acertamos se acaba el juego, si no damos pistas
			if(sonIgules(palabraUsuario, palabraDiaria)) {
				System.out.println();
				pistasPalabra(palabraUsuario, palabraDiaria, palabras);
				impresionPistas(palabras);
				System.out.println("\n\u001B[33;1m¡Felicidades! La palabra correcta es: " + "\u001B[32m" + palabraDiaria.toUpperCase() + "\u001B[0m");
				break;			
			}else {
				System.out.println("");
				pistasPalabra(palabraUsuario, palabraDiaria, palabras);
				impresionPistas(palabras);	
			}
			// Restamos el intento en cada iteración
			vidas--;
			System.out.println();
			System.out.println("\nTe quedan " + vidas + " intentos");
			System.out.println("--------------------------------------------");
		}
		// Cuando se acaba y no hay vidas hemos perdido
		if (vidas == 0) {
			System.out.println("\n\u001B[31;1mTe has quedado sin vidas, la palabra diaria es: " + "\u001B[32m" + palabraDiaria.toUpperCase() + "\u001B[0m");
		}

		System.out.println("--------------------------------------------");
		System.out.println("     	     NOS VEMOS MAÑANA    		    ");
		System.out.println("--------------------------------------------");

	}

	// Función para pedir al usuario la palabra para probar
	public static String pedirPalabra(Scanner sc, String palabraDiaria) {
		String palabraUsuario = sc.nextLine().toLowerCase();
		
			try {
				// La palabra debe tener la misma longitud que la palabraDiaria y ademas estar
				// compuesta solo por carácteres
				if (palabraUsuario.length() == palabraDiaria.length()) {

					for (int i = 0; i < palabraUsuario.length(); i++) {
						if (!Character.isLetter(palabraUsuario.charAt(i))) {
							System.out.println("\n\u001B[31mLa palabra solo debe contener letras.." + "\u001B[0m");
							System.out.print("Introduzca su palabra: ");
							return pedirPalabra(sc, palabraDiaria);
						}
					}
					return palabraUsuario;

				} else {
					System.out.println("\n\u001B[31mLa palabra debe tener " + palabraDiaria.length() + " caracteres" + "\u001B[0m");
					System.out.print("Introduzca su palabra: ");					
					return pedirPalabra(sc, palabraDiaria);
				}
			} catch (Exception e) {
				System.err.println("ERROR: " + e);
				return pedirPalabra(sc, palabraDiaria );
			}
	}

	// Función para comprobar que letras coinciden entre la palabra del usuario y la palabra diaria y dar pistas
	 public static void pistasPalabra(String palabraUsuario, String palabraDiaria, ArrayList<String> palabras) {
	        String palabraConPista = "";
	        // Recorremos 1 a 1 las letras de la palabra del usuario
	        for (int i = 0; i < palabraUsuario.length(); i++) {
	            char letra = palabraUsuario.charAt(i);
	            // Comprobamos si la letra está contenida y si es así si la posición es correcta
	            if (palabraDiaria.indexOf(letra) != -1) {
	                if (letra == palabraDiaria.charAt(i)) {
	                    palabraConPista += colorear(letra, "GREEN") + "  " ;
	                } else {
	                    palabraConPista += colorear(letra, "ORANGE") + "  " ;
	                }
	            } else {
	                palabraConPista += colorear(letra, "WHITE") + "  " ;
	            }
	        }
	        // Añadimos la palabra a la lista con las palabras que va probando el usuario
	        palabras.add(palabraConPista);
	    }

	// Función para comprobar si dos palabras son iguales
	public static boolean sonIgules (String palabraUsuario, String palabraDiaria) {
		return palabraUsuario.equals(palabraDiaria);
	}
	
	// Función auxiliar para imprimir con formato las pistas
	public static void impresionPistas (ArrayList<String> palabras) {
		for(String palabra : palabras) {
			System.out.println(palabra);
			System.out.println();
		}
	}
	
	// Función auxiliar pra aplicarle colores a una letra
	public static String colorear(char letra, String color) {
	    switch (color.toUpperCase()) {
	        case "GREEN":
	            return "\u001B[32;1m" + Character.toUpperCase(letra) + "\u001B[0m";
	        case "ORANGE":
	            return "\u001B[33;1m" + Character.toUpperCase(letra) + "\u001B[0m";
	        case "WHITE":
	            return Character.toUpperCase(letra) + "";
	        default:
	            return String.valueOf(letra);
	    }
	}

}
