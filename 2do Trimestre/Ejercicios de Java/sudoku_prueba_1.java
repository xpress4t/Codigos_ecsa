import java.util.Scanner;
public class sudoku_prueba_1 {

	public static void main(String[] args) {
		int[][] sudoku = new int[9][9]; // Tablero de Sudoku 9x9

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Imprimir el tablero actual
            imprimirSudoku(sudoku);

            // Pedir al usuario que ingrese fila, columna y número
            System.out.print("Ingrese fila (1-9), columna (1-9) y número (1-9), o 0 para salir: ");
            int fila = scanner.nextInt() - 1;
            int columna = scanner.nextInt() - 1;

            if (fila < 0 || fila >= 9 || columna < 0 || columna >= 9) {
                System.out.println("Coordenadas fuera de rango. Intente de nuevo.");
                continue;
            }

            int numero = scanner.nextInt();
            if (numero < 0 || numero > 9) {
                System.out.println("Número fuera de rango. Intente de nuevo.");
                continue;
            }

            sudoku[fila][columna] = numero;
        }
    }

    // Método para imprimir el tablero de Sudoku
    public static void imprimirSudoku(int[][] sudoku) {
        System.out.println("Tablero de Sudoku:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
	}

}
