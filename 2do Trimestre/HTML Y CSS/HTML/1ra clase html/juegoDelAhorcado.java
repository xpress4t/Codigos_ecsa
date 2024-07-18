import java.util.Scanner;
public class juegoDelAhorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "comida"; // Palabra secreta
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        int intentos = 6;

        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }

        System.out.println("¡Bienvenido al juego del Ahorcado!");
        System.out.println("La palabra tiene " + palabraSecreta.length() + " letras.");
        
        while (intentos > 0) {
            System.out.print("Palabra adivinada: ");
            for (char c : palabraAdivinada) {
                System.out.print(c + " ");
            }
            System.out.println("\nIntentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);
            boolean letraEncontrada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraAdivinada[i] = letra;
                    letraEncontrada = true;
                }
            }
            if (!letraEncontrada) {
                intentos--;
                System.out.println("Letra incorrecta. Intenta de nuevo.");
            }
            if (palabraSecreta.equals(String.valueOf(palabraAdivinada))) {
                System.out.println("¡Ganaste! La palabra es: " + palabraSecreta);
                break;
            }
        }
        if (intentos == 0) {
            System.out.println("¡Perdiste! La palabra era: " + palabraSecreta);
        }
    }
}
