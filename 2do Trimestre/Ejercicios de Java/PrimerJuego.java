/*
Inicio del Juego: 
	El juego comienza generando un número aleatorio dentro de un rango especificado. En este ejemplo, el rango es de 0 a 99. 
	El jugador no conoce este número y debe adivinar cuál es. 
Adivinanza del Jugador: 
	El jugador hace una suposición sobre cuál cree que es el número aleatorio. 
	En el ejemplo, el jugador ingresa su suposición a través del teclado. 
Verificación: 
	El programa verifica la suposición del jugador y la compara con el número aleatorio generado previamente. 
	Hay tres posibles resultados: 
	Si la suposición del jugador es igual al número aleatorio, el juego termina, y el jugador recibe un mensaje de felicitación. 
	Si la suposición es menor que el número aleatorio, se le informa al jugador que el número es mayor y se le permite realizar otra suposición. 
	Si la suposición es mayor que el número aleatorio, se le dice al jugador que el número es menor y se le permite realizar otra suposición. 
Iteración: 
	El juego continúa en un ciclo hasta que el jugador adivine correctamente el número. 
	Cada vez que el jugador realiza una suposición incorrecta, se le brinda una pista para ayudarlo a acercarse al número correcto. 
Fin del Juego: 
	Cuando el jugador adivina correctamente el número, el juego muestra la cantidad de intentos que le llevó al jugador adivinarlo. 
	Luego, el juego termina, y el jugador puede decidir si desea jugar nuevamente o no. 
 */
import java.util.Scanner;
public class PrimerJuego {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeroGenerado=(int)(Math.random()*100);
		System.out.println("Ingrese un número entero en el rango de 0 a 99: ");
		int numeroIngresado=sc.nextInt();
		System.out.println("Su número ingresado es: "+numeroIngresado);
		mensaje(numeroIngresado,numeroGenerado);
		System.out.println(mensaje(numeroIngresado,numeroGenerado));
		
	}
	
	
	public static int mensaje(int numeroIngresado,int numeroGenerado) {
		if(numeroIngresado==numeroGenerado) {
			System.out.println("Felicitaciones, adivinaste el número.");
		}else if(numeroIngresado<numeroGenerado) {
			System.out.println("El número generado es mayor, vuelva a ingresar otro número: ");
		}else if(numeroIngresado>numeroGenerado) {
			System.out.println("El número ingresado es menor, vuelva a ingresar otro número");
		}

		return 0;
	}
}