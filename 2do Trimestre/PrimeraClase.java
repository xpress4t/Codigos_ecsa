//Importo la clase Math para no tener que escribir Math.pow() al momento de declarar variables
import static java.lang.Math.*;
import java.util.Scanner;

public class PrimeraClase {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		double powBC = pow(b, c);
		System.out.println("x" + a); // System es una clase porque empieza con mayúscula
		System.out.println("x" + b);
		System.out.println("x" + c);
		System.out.println("a+b+c = " + (a + b + c));
		System.out.println("a*b*b*c*c*c = " + (a * b * b * c * c * c));
		System.out.println("b a la potencia c = " + (powBC * PI));

		// Declaramos una variable de tipo número entero con signo y valor 1
		int variableTipoNumero = 1;
		// Vamos a modificar su valor por 2
		variableTipoNumero = 2;
		// Esta línea va a dar error porque intentamos meter un decimal en una variable
		// de tipo entera
		// variableTipoNumero = 1.5;

		// Declaramos una variable de tipo número decimal con valor 1.5
		float variableTipoDecimal = 1.5f;

		// Declaramos una variable de tipo booleano con valor Verdadero
		boolean variableTipoBooleano = true;

		// Declaramos una variable de tipo caracter con valor 'a' (SIEMPRE CON COMILLAS
		// SIMPLES)
		char variableTipoCaracter = 'a';

		String variableTipoString = "cadena";

		// Declarar 3 variables de cada tipo con valores diferentes

		int entero_1 = 101;
		int entero_2 = 11;
		int entero_3 = 12;
		System.out.println("101 + 11 + 12 = " + (entero_1 + entero_2 + entero_3));
		float decimal_1 = 3.14159f;
		float decimal_2 = 8.32f;
		float decimal_3 = 6.4326781234f;
		float suma;
		suma = decimal_1 + decimal_2 + decimal_3;
		System.out.println(suma);
		boolean verdadero = true;
		boolean falso = false;

		char caracter_1 = 'x';
		char caracter_2 = 'y';
		char caracter_3 = 'z';

		String cadena_1 = "Emmanuel";
		String cadena_2 = "Cordova";
		String cadena_3 = "Muñoz";
		System.out.println(cadena_1 + " " + cadena_2 + " " + cadena_3);

		short numeroPequeño = 5;
		double numeroDoble = 452342456.234235f;

		System.out.println(numeroDoble);

		int edad = 17;
		if (edad > 17) {
			System.out.println("Es mayor de edad");
		}
		edad = 18;
		if (edad > 17) {
			if (edad % 2 == 0) {
				System.out.println("Es mayor de edad y par");
			}
		}
		if (edad > 17 && edad % 2 == 0) {
			System.out.println("Es mayor de edad y par");
		}
		
		
		// edad ->18
		
		switch(edad) {
		case 1:
			System.out.println("La edad vale 1");
			break;
		case 17:
			System.out.println("La edad vale 17");
			break;
		case 18:
			System.out.println("La edad vale 18");
			break;
			default:
				System.out.println("No se que edad tienes");
		}
		
		edad = 21;
		switch(edad) {
		case 17:
		case 18:
		case 19:
			System.out.println("El alumno aprueba la asignatura");
			break;
		case 20:
				System.out.println("La edad vale 20");
				break;
		default:
			System.out.println("Tienes 21 años");
		}
		
		
		String nombreUsuario = "Andres";
		switch(nombreUsuario) {
		case "Estuche":
			System.out.println("El usuario se llama estuche");
			break;
		case "Felipe":
			System.out.println("El usuario se llama Felipe");
			break;
		case "Andrés":
			System.out.println("El usuario se llama Andrés");
			default:
				System.out.println("Who knows");
		}
		
		System.out.println("------------------------------------");
		
// WHILE
		
		int num=0;
		while(num!=10) {
			System.out.println("La variable vale: "+num);
			// para variables de tipo String o booleano no sirve poner ++num o num++
			// en cambio para variables de tipo numerico si que da igual poner ++num o num++
			// num=num+1;
			// num+=1;
			// num++;
			// ++num;
			num++;
		}
		
		System.out.println("------------------------------------");
// DO WHILE
		 num=0;
		 do {
			 System.out.println("La variable vale: "+num);
			 ++num;
		 }while(num!=10);
		 
		 System.out.println("------------------------------------");
			
//FOR
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		
		
		
		
//Suma de 1+2+3+4+5+6+7+8+9+10
		int suma1=0;
		for(int numero=1;numero<=10;numero++) {
			if(numero%2==0) {
				suma1+=numero;
			}
		}
		System.out.println("La suma de los pares hasta el 10 es: "+suma1);
		System.out.println("------------------------------------");
		
		int i=1;
		int sumaWhile=0;
		while(i!=11) {
			sumaWhile+=i;
			i++;
//			Esto es por si quiero parar en cierto numero, por ejemplo, si quiero que sume hasta 28			
//			
//			if(sumaWhile==28) {
//				break;
//			}
		}
		System.out.println("La suma de los 10 primeros numeros es: "+sumaWhile);
		System.out.println("------------------------------------");
		
		int sumaDo=0,j=1;
		do {
			sumaDo+=j;
			j++;
		}while(j!=11);
		System.out.println("La suma de los 10 primeros numeros es: "+sumaDo);
		System.out.println("------------------------------------");
	}
}

/*
 * abs(x) ----> devuelve el valor absoluto de x ceil(x) ---> devuelve el entero
 * mas pequeño que es mayor o igual a x floor(x) ---> devuelve el entero mas
 * grande que es menor o igual a x random(x) ---> devuelve un numero aleatorio
 * entre 0 y 1 round(x) ---> devuelve el entero mas cercano a x E ---> es el
 * numero de euler PI ---> es el numero pi
 * 
 * 
 * 
 	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		int numero_x1 = scanner.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		int numero_x2 = scanner.nextInt();
		
		int PrimeraClase = numero_x1 + numero_x2;
		
		System.out.println("La suma de " + numero_x1 + " + " + numero_x2 + " es igual a: " + PrimeraClase);
			
		scanner.close();
 * 
 */
