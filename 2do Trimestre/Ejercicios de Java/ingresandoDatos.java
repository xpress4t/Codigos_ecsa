import java.util.Scanner;
public class ingresandoDatos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese un número entero: ");
		int numero=sc.nextInt();
		System.out.println("El número ingresado es: "+numero);
		
		System.out.print("Ingrese un número flotante: ");
		float numeroFloat=sc.nextFloat();
		System.out.println("El número inrgesado es: "+numeroFloat);
		sc.nextLine(); // Se pone este sc.nextLine(); para que no se salte de frente al ingresar
					   // un número entero, ya que cuando presionamos la tecla ENTER, esta cuenta como si fuera 
					   // un caracter y asi es como se pasa de frente al final del programa
					   // (itnentarlo en casa nuevamente sin el sc.nextLine(); para ver lo que sucede :)
		
		System.out.print("Ingrese un texto: ");
		String texto=sc.nextLine();
		System.out.println("El texto ingresado es: "+texto);
	}
}
