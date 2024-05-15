import java.util.Scanner;
public class piramideDePascal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de filas para la pirámide de Pascal:");
        int filas = scanner.nextInt();
        long[][] piramide = new long[filas][];
        
        // Inicializamos la pirámide con los valores adecuados
        
        for (int i = 0; i < filas; i++) {
            piramide[i] = new long[i + 1];
            piramide[i][0] = 1;
            piramide[i][i] = 1;
            //Calculamos los datos
            for (int j = 1; j < i; j++) {
                piramide[i][j] = piramide[i - 1][j - 1] + piramide[i - 1][j];
            }
        }
        
        // Mostramos la pirámide
        for (int i = 0; i < filas; i++) {
            // Imprimimos espacios en blanco para centrar los números
            for (int j = 0; j < filas - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(piramide[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
