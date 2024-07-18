package barcosHundidos;
import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private Tablero tablero;
    private List<Barco> barcos;

    public Jugador(String nombre, int tamañoTablero) {
        this.nombre = nombre;
        this.tablero = new Tablero(tamañoTablero);
        this.barcos = new ArrayList<>();
        // Coloca 5 barcos de longitud 1 en posiciones aleatorias del tablero
        colocarBarcosAleatorios();
    }

    // Método para colocar 5 barcos de longitud 1 en posiciones aleatorias del tablero
    private void colocarBarcosAleatorios() {
        for (int i = 0; i < 5; i++) {
            int fila, columna;
            do {
                // Genera posiciones aleatorias hasta encontrar una casilla vacía
                fila = (int) (Math.random() * tablero.getTamaño());
                columna = (int) (Math.random() * tablero.getTamaño());
            } while (!puedeColocarBarco(fila, columna));

            Barco barco = new Barco(fila, columna);
            barcos.add(barco);
            tablero.colocarBarco(fila, columna);
        }
        mostrarTablero();   
    }

    // Método para verificar si un barco se puede colocar en una posición dada
    private boolean puedeColocarBarco(int fila, int columna) {
        for (Barco barco : barcos) {
            if (Math.abs(barco.getFila() - fila) <= 1 && Math.abs(barco.getColumna() - columna) <= 1) {
                return false; // No se puede colocar junto a otro barco del mismo equipo
            }
        }
        return true;
    }

    // Método para disparar a una casilla del tablero del oponente
    public boolean disparar( int fila, int columna) {
        if(getTablero().disparar(fila, columna)) {
        	for(Barco barco: barcos) {
        		if(barco.estaEnPosicion(fila, columna)) {
        			barco.marcarComoHundido();
        		}
        	}
        	return true;
        }
        return false;
    }

    // Método para mostrar el estado del tablero del jugador
    public void mostrarTablero() {
        System.out.println("Tablero de " + nombre + ":");
        tablero.mostrarTablero();
    }

    // Método para verificar si todos los barcos del jugador están hundidos
    public boolean todosBarcosHundidos() {
        for (Barco barco : barcos) {
            if (!barco.estaHundido()) {
                return false; // Todavía hay barcos sin hundir
            }
        }
        return true; // Todos los barcos están hundidos
    }

    // Getters y setters
    public Tablero getTablero() {
        return tablero;
    }

    public String getNombre() {
        return nombre;
    }
}
