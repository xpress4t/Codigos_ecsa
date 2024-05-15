import java.util.Scanner;
public class juego_de_adivinar_numero {
	public static void main(String[] args) {
		adivinandoNumero();
	}
	public static void adivinandoNumero() {
		Scanner scan=new Scanner(System.in);
		int numeroGenerado=(int)(Math.random()*100);
		int numeroIngresado=0;
		System.out.println("¡Bienvenido al juego de adivinar el número!");
		System.out.print("Por favor, ingrese un número en el rango de 1 a 100 : ");
		if(numeroIngresado<numeroGenerado) {
				System.out.println("El número a adivinar es mayo, vuelve a ingresar otro número : ");
				numeroIngresado=scan.nextInt();
			}else if(numeroIngresado>numeroGenerado) {
				System.out.println("El número a a divinar es menor, vuelve a ingresar otro número : ");
				numeroIngresado=scan.nextInt();
			}else {
				System.out.println("Adivinaste");
			}
		do {
			try {
				numeroIngresado=scan.nextInt();
			} catch (Exception e) {
				System.err.println("Error, has ingresado un valor que no es un número entero.");
				System.out.print("Por favor, ingrese un número en el rango de 1 a 100 : ");
				scan.nextLine();
			}
			
		} while (numeroIngresado==0);
	}
	
}