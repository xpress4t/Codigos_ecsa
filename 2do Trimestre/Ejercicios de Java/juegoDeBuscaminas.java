import java.util.Scanner;
import java.util.Random;

public class juegoDeBuscaminas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int gridSize = 5; // Tamaño del tablero
        int numMines = 5; // Número de minas
        char[][] board = new char[gridSize][gridSize];

        // Inicializar el tablero
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                board[i][j] = '-';
            }
        }

        // Colocar las minas aleatoriamente
        for (int i = 0; i < numMines; i++) {
            int row = random.nextInt(gridSize);
            int col = random.nextInt(gridSize);
            board[row][col] = 'M';
        }

        // Mostrar el tablero
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // Juego
        System.out.println("¡Bienvenido al juego Buscaminas!");
        boolean gameOver = false;
        while (!gameOver) {
            System.out.print("Ingrese la fila y columna (ejemplo: 1 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == 'M') {
                System.out.println("¡Has perdido! Una mina explotó.");
                gameOver = true;
            } else {
                int count = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (row + i >= 0 && row + i < gridSize && col + j >= 0 && col + j < gridSize) {
                            if (board[row + i][col + j] == 'M') {
                                count++;
                            }
                        }
                    }
                }
                board[row][col] = (char) (count + '0');
                for (int i = 0; i < gridSize; i++) {
                    for (int j = 0; j < gridSize; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
