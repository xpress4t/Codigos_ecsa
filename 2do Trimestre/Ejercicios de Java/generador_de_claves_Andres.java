import java.util.Random;
import java.util.Scanner;

public class generador_de_claves_Andres {

	public static void main(String[] args) {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
		System.out.println("De cuántos carácteres quieres tu contraseña");
		Scanner sc = new Scanner(System.in);
		int longContraseña = sc.nextInt();
		sc.nextLine();
		String contraseñaSegura = generarContraseñaSegura(longContraseña, caracteres);
		System.out.println("Tu contraseña segura es: "+contraseñaSegura);
	}

	public static String generarContraseñaSegura(int longContraseña, String caracteres) {
		String contraseña = "";
		Random rd = new Random();
		for (int i = 0; i < longContraseña; i++) {
			int indiceAleatorio = rd.nextInt(0, caracteres.length());
			contraseña += caracteres.charAt(indiceAleatorio);
		}
		System.out.print(contraseña);
		return comprobarContraseña(contraseña) ? contraseña : generarContraseñaSegura(longContraseña, caracteres);
	}

	public static boolean comprobarContraseña(String contraseña) {
		int contadorLetras = 0;
		int contadorNumeros = 0;
		int contadorCaracteres = 0;
		for (char c : contraseña.toCharArray()) {
			if (Character.isDigit(c)) {
				contadorNumeros++;
			} else if (Character.isLetter(c)) {
				contadorLetras++;
			} else {
				contadorCaracteres++;
			}
		}
		System.out.println(" "+contadorNumeros+"/"+contadorLetras+"/"+contadorCaracteres);
		return contadorNumeros >= 3 && contadorLetras >= 3 && contadorCaracteres >= 3;
	}
}