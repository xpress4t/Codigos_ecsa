import java.util.Scanner;
import java.util.Arrays;
public class bingoxxxxxxxxxxx {
    public static void main(String[] args) {
        do {
            jugarBingo();
        } while (continuar());
    }

    public static void jugarBingo() {
        int[][] cartonJugador1 = generarCarton();
        int[][] cartonJugador2 = generarCarton();
        System.out.println("Cartón del Jugador 1:");
        imprimirCarton(cartonJugador1);
        System.out.println("\nCartón del Jugador 2:");
        imprimirCarton(cartonJugador2);
        int[] bombo = generarBombo();
        System.out.println("\nComienza el juego de Bingo:");
        jugarBingo(cartonJugador1, cartonJugador2, bombo);
    }

    public static int[] generarBombo() {
        int[] bombo = new int[20];
        for (int i = 0; i < 20; i++) {
            bombo[i] = i + 1;
        }
        return bombo;
    }

    public static void imprimirCarton(int[][] carton) {
        for (int x = 0; x < carton.length; x++) {
            for (int y = 0; y < carton[x].length; y++) {
                System.out.print(carton[x][y] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean contieneNumero(int[][] carton, int numero) {
        for (int x = 0; x < carton.length; x++) {
            for (int y = 0; y < carton[x].length; y++) {
                if (carton[x][y] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean continuar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Deseas continuar jugando? (S/N): ");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("S");
    }

    public static int[][] generarCarton() {
        int[][] carton = new int[2][5];
        int[] numeros1a10 = new int[10];
        int[] numeros11a20 = new int[10];

        // Inicializa los arreglos con valores únicos
        for (int i = 0; i < 10; i++) {
            numeros1a10[i] = i + 1;
            numeros11a20[i] = i + 11;
        }

        // Llena el cartón con números aleatorios 1-10
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 2) {
                    int randomIndex = (int) (Math.random() * numeros1a10.length);
                    carton[i][j] = numeros1a10[randomIndex];
                    numeros1a10[randomIndex] = numeros1a10[numeros1a10.length - 1];
                    numeros1a10 = Arrays.copyOf(numeros1a10, numeros1a10.length - 1);
                } else {
                    int randomIndex = (int) (Math.random() * numeros11a20.length);
                    carton[i][j] = numeros11a20[randomIndex];
                    numeros11a20[randomIndex] = numeros11a20[numeros11a20.length - 1];
                    numeros11a20 = Arrays.copyOf(numeros11a20, numeros11a20.length - 1);
                }
            }
        }

        return carton;
    }

    public static void jugarBingo(int[][] cartonJugador1, int[][] cartonJugador2, int[] bombo) {
        int turno = 1;
        boolean jugador1Completo = false;
        boolean jugador2Completo = false;

        while (!jugador1Completo && !jugador2Completo && bombo.length > 0) {
            int numeroExtraido = extraerNumero(bombo);
            System.out.println("Número extraído del bombo: " + numeroExtraido);

            if (contieneNumero(cartonJugador1, numeroExtraido)) {
                marcarNumero(cartonJugador1, numeroExtraido);
                jugador1Completo = esCartonCompleto(cartonJugador1);
            }

            if (contieneNumero(cartonJugador2, numeroExtraido)) {
                marcarNumero(cartonJugador2, numeroExtraido);
                jugador2Completo = esCartonCompleto(cartonJugador2);
            }

            System.out.println("Cartón del Jugador 1:");
            imprimirCarton(cartonJugador1);
            System.out.println("Cartón del Jugador 2:");
            imprimirCarton(cartonJugador2);

            turno = 3 - turno; // Alternar entre Jugador 1 y Jugador 2
        }

        if (jugador1Completo) {
            System.out.println("¡Bingo! El Jugador 1 ha completado su cartón.");
        } else if (jugador2Completo) {
            System.out.println("¡Bingo! El Jugador 2 ha completado su cartón.");
        } else {
            System.out.println("¡El bombo está vacío! El juego ha terminado en empate.");
        }
    }

    public static int extraerNumero(int[] bombo) {
        int index = (int) (Math.random() * bombo.length);
        int numeroExtraido = bombo[index];

        // Eliminar el número extraído del bombo
        for (int i = index; i < bombo.length - 1; i++) {
            bombo[i] = bombo[i + 1];
        }
        bombo = Arrays.copyOf(bombo, bombo.length - 1);

        return numeroExtraido;
    }

    public static void marcarNumero(int[][] carton, int numero) {
        for (int x = 0; x < carton.length; x++) {
            for (int y = 0; y < carton[x].length; y++) {
                if (carton[x][y] == numero) {
                    carton[x][y] = 0; // Marcar el número como 0
                    return;
                }
            }
        }
    }

    public static boolean esCartonCompleto(int[][] carton) {
        for (int x = 0; x < carton.length; x++) {
            for (int y = 0; y < carton[x].length; y++) {
                if (carton[x][y] != 0) {
                    return false; // El cartón no está completo
                }
            }
        }
        return true; // El cartón está completo
    }
}
