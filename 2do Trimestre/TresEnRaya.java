import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matriz = new String[3][3];
		Scanner sc = new Scanner(System.in);
		iniciarJuego(sc, matriz);
	}

	// Menu principal de inicio del juego 
	public static void iniciarJuego(Scanner sc, String[][] aux) {
		System.out.println("Buenas, este es el juego del tres en raya");
		System.out.println("Para comenzar ponga si, en caso negativo ponga no");
		String txt = "";
		try {
			txt = sc.nextLine();
			txt = txt.toLowerCase();
		} catch (Exception e) {
			System.out.println("Pon un caracter valido merluzo");
			iniciarJuego(sc, aux);
		}
		if (txt.equals("si")) {
			rellenaMatriz(aux);
		} else {
			System.out.println("Adios!");
		}
	}
	
	// Rellena la matriz con barras bajas para que quede bien
	// visualmente y clarifique el juego
	public static void rellenaMatriz(String[][] aux) {
		for (int x = 0; x < aux.length; x++) {
			for (int y = 0; y < aux.length; y++) {
				aux[x][y] = "_";
			}
		}
		mostrarMatriz(aux);
		juegaJugador(aux);
	}

	//Funcion para mostrar la matriz despues de cada jugada
	public static void mostrarMatriz(String[][] aux) {
		System.out.println("----------------------");
		for (int x = 0; x < aux.length; x++) {
			for (int y = 0; y < aux.length; y++) {
				System.out.print(aux[x][y] + " ");
			}
			System.out.println("");
		}
		System.out.println("----------------------");
	}

	// Funcion que guarda las posiciones que inserta el usuario y la pinta con "X"
	public static void juegaJugador(String[][] aux) {
		Scanner sc = new Scanner(System.in);
		int posX = 0;
		int posY = 0;
		try {
			System.out.println("Digame la posicion X");
			// Se pone -1 para traducir de matematico a posiciones del array
			posX = Integer.parseInt(sc.nextLine()) - 1;
			System.out.println("Digame la posicion Y");
			posY = Integer.parseInt(sc.nextLine()) - 1; 
		} catch (Exception e) {
			System.out.println("Solo se pueden poner numeros maestro");
		}
		if (aux[posY][posX].equals("X") || aux[posY][posX].equals("O")) {
			System.out.println("Esa posicion ya esta completa");
			juegaJugador(aux);
		} else {
			aux[posY][posX] = "X";
			mostrarMatriz(aux);
		}
		if (comprobarJugada(aux) == true) {
			System.out.println("El juego a terminado, te redireccionamos a");
			System.out.println("el menu principal por si quieres volver a jugar");
			iniciarJuego(sc, aux);
		} else {
			juegaMaquina(aux, sc);
		}
	}

	// Funcion que hace que la maquina aleatoriamente juegue y ponga una "O"
	public static void juegaMaquina(String[][] aux, Scanner sc) {
		int posX = 0;
		int posY = 0;
		posX = (int) (Math.random() * 3);
		posY = (int) (Math.random() * 3);
		System.out.println(posX + " " + posY);
		if (aux[posY][posX].equals("X") || aux[posY][posX].equals("O")) {
			System.out.println("Esa posicion ya esta completa");
			juegaMaquina(aux, sc);
		} else {
			aux[posY][posX] = "O";
			mostrarMatriz(aux);
		}
		if (comprobarJugada(aux) == true) {
			System.out.println("El juego a terminado, te redireccionamos a");
			System.out.println("el menu principal por si quieres volver a jugar");
			System.out.println("----------------------");
			iniciarJuego(sc, aux);
		} else {
			juegaJugador(aux);
		}
	}

	// Funcion que comprueba todas las posibles victorias y derrotas del usuario en cada ronda
	// Se devuelve booleano para comprobar si continuar con el juego o parar
	public static boolean comprobarJugada(String[][] aux) {
		// Para las filas
		for (int x = 0; x < aux.length; x++) {
			if (aux[0][x].equals(aux[1][x]) && aux[0][x].equals(aux[2][x]) && aux[0][x].equals("X")) {
				System.out.println("----------------------");
				System.out.println("Ganaste!!!!!!");
				System.out.println("----------------------");
				return true;
			} else if (aux[0][x].equals(aux[1][x]) && aux[0][x].equals(aux[2][x]) && aux[0][x].equals("O")) {
				System.out.println("----------------------");
				System.out.println("Perdiste!!!!!!");
				System.out.println("----------------------");
				return true;
			}
		}
		//Para las columnas
		for (int x = 0; x < aux.length; x++) {
			if (aux[x][0].equals(aux[x][1]) && aux[x][0].equals(aux[x][2]) && aux[x][0].equals("X")) {
				System.out.println("----------------------");
				System.out.println("Ganaste!!!!!!");
				System.out.println("----------------------");
				return true;
			} else if (aux[x][0].equals(aux[x][1]) && aux[x][0].equals(aux[x][2]) && aux[x][0].equals("O")) {
				System.out.println("----------------------");
				System.out.println("Perdiste!!!!!!");
				System.out.println("----------------------");
				return true;
			}
		}
		//Diagonales
		if (aux[0][0].equals(aux[1][1]) && aux[0][0].equals(aux[2][2]) && aux[0][0].equals("X")) {
			System.out.println("----------------------");
			System.out.println("Ganaste!!!!!!");
			System.out.println("----------------------");
			return true;
		} else if (aux[0][0].equals(aux[1][1]) && aux[0][0].equals(aux[2][2]) && aux[0][0].equals("O")) {
			System.out.println("----------------------");
			System.out.println("Perdiste!!!!!!");
			System.out.println("----------------------");
			return true;
		} else if (aux[2][0].equals(aux[1][1]) && aux[2][0].equals(aux[0][0]) && aux[0][2].equals("X")) {
			System.out.println("----------------------");
			System.out.println("Ganaste!!!!!!");
			System.out.println("----------------------");
			return true;
		} else if (aux[2][0].equals(aux[1][1]) && aux[2][0].equals(aux[0][0]) && aux[0][2].equals("X")) {
			System.out.println("----------------------");
			System.out.println("Perdiste!!!!!!");
			System.out.println("----------------------");
			return true;
		}
		return false;

	}

}
