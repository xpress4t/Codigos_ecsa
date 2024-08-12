package t001;

import java.util.ArrayList;
import java.util.Random;

enum ValorCasilla {
    Equipo1("X"),
    Equipo2("0"),
    Agua("-"),
    Hundido("=");

    private final String valor;

    ValorCasilla(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

class Casilla {
    private ValorCasilla contenido;

    public Casilla() {
        this.contenido = ValorCasilla.Agua;
    }

    public void setContenido(ValorCasilla contenido) {
        this.contenido = contenido;
    }

    public ValorCasilla getContenido() {
        return contenido;
    }
}

class Tablero {
    private final int dimension = 5;
    private ArrayList<ArrayList<Casilla>> tablero;

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
        colocarBarcos(ValorCasilla.Equipo1);
        colocarBarcos(ValorCasilla.Equipo2);
    }

    private void colocarBarcos(ValorCasilla equipo) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(dimension);
            int y = random.nextInt(dimension);
            if (tablero.get(x).get(y).getContenido() == ValorCasilla.Agua) {
                tablero.get(x).get(y).setContenido(equipo);
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
                System.out.print(tablero.get(i).get(j).getContenido().getValor() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean disparar() {
        Random random = new Random();
        int x = random.nextInt(dimension);
        int y = random.nextInt(dimension);
        ValorCasilla contenido = tablero.get(x).get(y).getContenido();
        if (contenido == ValorCasilla.Agua) {
            System.out.println("Agua!");
        } else {
            System.out.println("¡Barco hundido!");
            tablero.get(x).get(y).setContenido(ValorCasilla.Hundido);
        }
        mostrarTablero();
        return !hayBarcosDisponibles(ValorCasilla.Equipo1) || !hayBarcosDisponibles(ValorCasilla.Equipo2);
    }

    private boolean hayBarcosDisponibles(ValorCasilla equipo) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (tablero.get(i).get(j).getContenido() == equipo) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class prueba_barcos {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.mostrarTablero();
        while (!tablero.disparar()) {
            // El juego continúa hasta que no haya barcos disponibles en alguno de los equipos.
        }
        System.out.println("¡Juego terminado!");
    }
}