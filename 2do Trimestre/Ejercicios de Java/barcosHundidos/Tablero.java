package barcosHundidos;

public class Tablero {
    private char[][] casillas;
    private int tamaño;

    // Constructor para crear un tablero de tamaño específico
    public Tablero(int tamaño) {
        this.tamaño = tamaño;
        casillas = new char[tamaño][tamaño];
        // Inicializamos todas las casillas con '-' para representar agua
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                casillas[i][j] = '-';
            }
        }
    }

    // Método para colocar un barco en el tablero
    public boolean colocarBarco(int fila, int columna) {
        if (fila < 0 || fila >= tamaño || columna < 0 || columna >= tamaño) {
            // Verificamos que la posición esté dentro de los límites del tablero
            return false;
        }

        if (casillas[fila][columna] == '-') {
            // Verificamos que la casilla esté vacía (agua) antes de colocar un barco
            casillas[fila][columna] = '0'; // 'B' representa un barco
            return true;
        } else {
            return false; // La casilla ya está ocupada por otro barco
        }
    }

    // Método para disparar a una casilla del tablero
    public boolean disparar(int fila, int columna) {
        if (fila < 0 || fila >= tamaño || columna < 0 || columna >= tamaño) {
            // Verificamos que la posición esté dentro de los límites del tablero
            return false;
        }

        if (casillas[fila][columna] == '0') {
            // Si la casilla contiene un barco, lo marcamos como 'X' (hundido)
            casillas[fila][columna] = 'X';
            return true;
        } else if (casillas[fila][columna] == '-') {
            // Si la casilla está vacía, la marcamos como '-' (agua)
            casillas[fila][columna] = '-';
            return true;
        } else {
            // Si ya se disparó en esta casilla, no se puede disparar de nuevo
            return false;
        }
    }

    // Método para mostrar el tablero
    public void mostrarTablero() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(casillas[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }

    // Método para verificar si un jugador ha ganado (todos sus barcos están hundidos)
    public boolean todosBarcosHundidos() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (casillas[i][j] == '0') {
                    return false; // Todavía hay barcos sin hundir
                }
            }
        }
        return true; // Todos los barcos están hundidos
    }

	public char[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(char[][] casillas) {
		this.casillas = casillas;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
    
}
