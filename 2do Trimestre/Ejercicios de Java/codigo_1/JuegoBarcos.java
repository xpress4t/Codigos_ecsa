package codigo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Barco {
    int posicion;

    public Barco(int posicion) {
        this.posicion = posicion;
    }
}

public class JuegoBarcos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Barco> barcos = new ArrayList<>();
        Random random = new Random();

        // Crear barcos en posiciones aleatorias
        for (int i = 0; i < 5; i++) {
            barcos.add(new Barco(random.nextInt(10)));
        }

        int intentos = 0;

        while (!barcos.isEmpty()) {
            System.out.println("Introduce un disparo (0-9): ");
            int disparo = scanner.nextInt();

            if (dispararBarco(barcos, disparo)) {
                System.out.println("¡Has acertado un barco!");
            } else {
                System.out.println("Agua...");
            }

            intentos++;

            // Mostrar estado actual de los barcos
            System.out.print("Barcos restantes: ");
            for (Barco b : barcos) {
                System.out.print(b.posicion + " ");
            }
            System.out.println();
        }

        System.out.println("¡Felicidades, has hundido todos los barcos en " + intentos + " intentos!");
    }

    private static boolean dispararBarco(ArrayList<Barco> barcos, int disparo) {
        for (int i = 0; i < barcos.size(); i++) {
            Barco barco = barcos.get(i);
            if (disparo == barco.posicion) {
                barcos.remove(i);
                return true;
            }
        }
        return false;
    }
}
