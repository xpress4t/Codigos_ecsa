import java.util.Random;
import java.util.Scanner;
public class JuegoDeAdivinarNumero {
    public static void main(String[] args) {
        jugarAdivinaNumero();
    }
    public static void jugarAdivinaNumero() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100); // Generar un número aleatorio entre 0 y 99
        int intentos = 0;
        boolean adivinado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Intenta adivinar un número entre 0 y 99.");

        while (!adivinado) {
            System.out.print("Ingresa tu intento: ");
            try {
                int intento = sc.nextInt();
                intentos++;
                if (intento < 0 || intento > 99) {
                    throw new IllegalArgumentException("El número debe estar en el rango de 0 a 99.");
                }
                if (intento == numeroAleatorio) {
                    adivinado = true;
                } else if (intento < numeroAleatorio) {
                    System.out.println("El número es mayor. Intenta de nuevo.");
                } else {
                    System.out.println("El número es menor. Intenta de nuevo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ingresa un número válido.");
                sc.nextLine(); // Limpiar el búfer de entrada
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("¡Felicidades! Adivinaste el número " + numeroAleatorio + " en " + intentos + " intentos.");
        sc.close();
    }
}
