package emmanuelCordovaMuñoz_AEA1T1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String palabra = new String();
        IntroducirPalabras(scan, palabra, lista);
        palabra = PalabraAleatoriaEscogida(lista);

        int intentosFallidos = 0;
        StringBuilder palabraOculta = new StringBuilder("_".repeat(palabra.length()));

        do {
            mostrarAhorcado(intentosFallidos);
            System.out.println("Palabra: " + palabraOculta);
            char letra = pedirLetra(scan);

            if (palabra.contains(String.valueOf(letra))) {
                actualizarPalabraOculta(palabra, palabraOculta, letra);
            } else {
                intentosFallidos++;
            }

        } while (!juegoTerminado(palabra, palabraOculta.toString(), intentosFallidos));

        scan.close();
    }

    public static void IntroducirPalabras(Scanner scan, String palabra, List<String> lista) {
        System.out.println("Introduce 4 palabras diferentes: ");
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ".- ");
            palabra = scan.nextLine();
            lista.add(palabra);
        }
        System.out.println("Las palabras ingresadas son: " + lista);
    }

    public static String PalabraAleatoriaEscogida(List<String> lista) {
        int numeroAleatorio = new Random().nextInt(4);
        String palabra = lista.get(numeroAleatorio);
        System.out.println("La palabra aleatoria escogida es: " + palabra);
        return palabra;
    }

    public static void mostrarAhorcado(int intentosFallidos) {
        // Aquí podrías mostrar una imagen ASCII del ahorcado según la cantidad de intentos fallidos.
        // Por simplicidad, solo mostramos el número de intentos fallidos en este ejemplo.
        System.out.println("Intentos fallidos: " + intentosFallidos);
    }

    public static char pedirLetra(Scanner scan) {
        System.out.println("Introduzca una letra: ");
        return scan.next().charAt(0);
    }

    public static void actualizarPalabraOculta(String palabra, StringBuilder palabraOculta, char letra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                palabraOculta.setCharAt(i, letra);
            }
        }
    }

    public static boolean juegoTerminado(String palabra, String palabraOculta, int intentosFallidos) {
        if (palabraOculta.equals(palabra)) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
            return true;
        } else if (intentosFallidos == 6) {
            System.out.println("¡Oh no! Has agotado tus intentos. La palabra correcta era: " + palabra);
            return true;
        }
        return false;
    }
}
