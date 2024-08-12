package t001;

import java.util.ArrayList;
import java.util.Random;

class Casilla {
    public String contenido;

    public Casilla() {
        this.contenido = "-";
    }
}

class Tablero {
    public ArrayList<ArrayList<Casilla>> tablero;
    public final int dimension = 5;

    public Tablero() {
        tablero = new ArrayList<>();

        for (int i = 0; i < dimension; i++) {
            ArrayList<Casilla> fila = new ArrayList<>();
            for (int j = 0; j < dimension; j++) {
                fila.add(new Casilla());
            }
            tablero.add(fila);
        }

        // Colocar barcos de forma automática
        colocarBarcos("X");
        colocarBarcos("0");
    }

    public void colocarBarcos(String equipo) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(dimension);
            int y = random.nextInt(dimension);

            if (tablero.get(x).get(y).contenido.equals("-")) {
                tablero.get(x).get(y).contenido = equipo;
            } else {
                i--; // Volver a intentar colocar el barco en una posición válida
            }
        }
    }

    public void mostrarTablero() {
        System.out.println("  A B C D E");
        for (int i = 0; i < dimension; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < dimension; j++) {
                System.out.print(tablero.get(i).get(j).contenido + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean disparar() {
        Random random = new Random();
        int x = random.nextInt(dimension);
        int y = random.nextInt(dimension);

        String contenido = tablero.get(x).get(y).contenido;

        if (contenido.equals("-")) {
            System.out.println("Agua!");
        } else {
            System.out.println("¡Barco hundido!");
            tablero.get(x).get(y).contenido = "=";
        }

        mostrarTablero();

        return !hayBarcosDisponibles("X") || !hayBarcosDisponibles("0");
    }

    public boolean hayBarcosDisponibles(String equipo) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (tablero.get(i).get(j).contenido.equals(equipo)) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class prueba_de_barcos_2 {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.mostrarTablero();

        while (!tablero.disparar()) {
            // El juego continúa hasta que no haya barcos disponibles en alguno de los equipos.
        }

        System.out.println("¡Juego terminado!");
    }
}
