package barcosHundidos;

import java.util.Scanner;

public class JugarBarcosHundidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de Barcos Hundidos!");
        System.out.print("Nombre del Jugador 1: ");
        String nombreJugador1 = scanner.nextLine();
        System.out.print("Nombre del Jugador 2: ");
        String nombreJugador2 = scanner.nextLine();

        Jugador jugador1 = new Jugador(nombreJugador1, 5); // Tamaño del tablero 5x5
        Jugador jugador2 = new Jugador(nombreJugador2, 5); // Tamaño del tablero 5x5

        Jugador jugadorActual = jugador1; // Comenzamos con el Jugador 1

        while (true) {
            System.out.println("\n\n\n" + jugadorActual.getNombre() + ", es tu turno.");
            jugadorActual.mostrarTablero();
            System.out.print("Ingresa la fila para disparar: ");
            int fila = scanner.nextInt();
            System.out.print("Ingresa la columna para disparar: ");
            int columna = scanner.nextInt();

            Jugador oponente = (jugadorActual == jugador1) ? jugador2 : jugador1;
            
            if (oponente.disparar(fila, columna)) {
                System.out.println("¡Has impactado un barco!");
            } else {
                System.out.println("¡Has disparado al agua!");
            }
            
            if (oponente.todosBarcosHundidos()) {
                System.out.println(jugadorActual.getNombre() + " ha ganado. ¡Felicidades!");
                break;
            }
            
            // Cambiar al otro jugador
            jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
        }
    }
}
