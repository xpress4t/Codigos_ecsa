package emmanuelCordovaMuñoz_AEA1T1;

/*
 * ESCRIBIR UN PROGRAMA EN JAVA QUE PERMITA AL USUARIO REALIZAR LAS SIGUIENTES
 * OPERACIONES CON UNA LISTA DE NÚMEROS:
 * 
 * 1.- AGREGAR NÚMERO: PERMITE AL USUARIO INGRESAR UN NÚMERO ENTERO
 * 	   Y LO AGREGA A LA LISTA DE NÚMEROS.
 * 
 * 2.- MOSTRAR NÚMEROS: MUESTRA TODOS LOS NÚMEROS ACTUALMENTE EN LA LISTA.
 * 
 * 3.- CALCULAR OPERACIÓN: CALCULAR LA OPERACIÓN SEÑALADA DE TODOS LOS NÚMEROS 
 *     EN LA LISTA Y MUESTRA EL RESULTADO.
 *     
 * 4.- SALIR: FINALIZA EL PROGRAMA.
 * 
 * CONSIDERACIONES PARA EL PUNTO 3: 
 * 
 * 		- HAY QUE USAR EL TIPO DE DATO MÁS ADECUADO PARA CADA TIPO 
 * 	   	  DE OPERACIÓN.
 * 
 * 		- TENER EN CUENTA QUE AL USAR EL Scanner HAY QUE RECOGER
 * 		  EL TIPO DE DATO MÁS ADECUADO. SINO DEBERÁ LANZAR UNA EXCEPCIÓN.
 */
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class calculadoraBasica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> lista_de_numeros = new ArrayList<>();
		Bucle(scan,lista_de_numeros);
	}
	
	public static void Bucle(Scanner scan,List<Integer> lista_de_numeros) {
		int opcion;
		do {
			Menu();
			opcion=OpcionElegida(scan);
			if(opcion==1) {
				AgregarNúmero(scan,lista_de_numeros);
			}else if(opcion==2) {
				MostrarLista(scan,lista_de_numeros);
			}else if(opcion==3) {
				OperaciónSuma(lista_de_numeros);
				OperaciónResta(lista_de_numeros);
				OperaciónMultiplicación(lista_de_numeros);
				OperaciónDivisión(lista_de_numeros);
				OperaciónPotencia(lista_de_numeros);
			}else if(opcion==4){
				System.out.println("\nAdiós");
			}
		}while(opcion!=4);
		scan.close();
	}
	
	public static int OpcionElegida(Scanner scan) {
		try {
            return scan.nextInt();
        } catch (Exception e) {
            scan.nextLine();
            return 0;
        }
	}
	
	public static void Menu() {
		System.out.println("\n\t\tCaculadora Básica\n");
		System.out.println("1.- Agregar un número a la lista.");
		System.out.println("2.- Mostrar números de la lista.");
		System.out.println("3.- Calcular operaciones matemáticas de los números de la lista.");
		System.out.println("4.- Salir.");
		System.out.print("\nSeleccione la opción que desea ejecutar: ");
		System.out.print("");
	}
	
	public static void AgregarNúmero(Scanner scan,List<Integer> lista_de_numeros) {
		System.out.print("Ingrese un número entero para agregarlo a la lista de números: ");
		int numero = scan.nextInt();
		lista_de_numeros.add(numero);
		System.out.println("Acaba de ingresar el número "+numero);
	}
	
	public static void MostrarLista(Scanner scan,List<Integer> lista_de_numeros) {
		if(lista_de_numeros.size()==0) {
			System.out.println("No hay ningún número en la lista.");
			AgregarNúmero(scan,lista_de_numeros);
		}else {
			System.out.println("\nLa lista de números es:\n"+lista_de_numeros);
			
		}
	}
	
	public static void OperaciónSuma(List<Integer>lista_de_numeros) {
		System.out.println();
		System.out.print("La suma de los números de "+lista_de_numeros+" será: ");
		int suma=0;
		for(int i=0;i<lista_de_numeros.size();i++) {
			suma+=lista_de_numeros.get(i);
		}
		System.out.println(suma);
		System.out.println();
	}
	
	public static void OperaciónResta(List<Integer>lista_de_numeros) {
		System.out.print("La resta de los números de "+lista_de_numeros+" será: ");
		int resta=lista_de_numeros.get(0);
		for(int i=1;i<lista_de_numeros.size();i++) {
			resta-=lista_de_numeros.get(i);
		}
		System.out.println(resta);
		System.out.println();
	}
	
	public static void OperaciónMultiplicación(List<Integer>lista_de_numeros) {
		System.out.print("La multiplicación de los números de "+lista_de_numeros+" será: ");
		double multiplicación=1;
		for(int i=0;i<lista_de_numeros.size();i++) {
			multiplicación*=lista_de_numeros.get(i);
		}
		System.out.println(multiplicación);
		System.out.println();
	}
	
	public static void OperaciónDivisión(List<Integer>lista_de_numeros) {
		System.out.print("La división de los números de "+lista_de_numeros+" será: ");
		float división=lista_de_numeros.get(0);
		for(int i=1;i<lista_de_numeros.size();i++) {
			división/=lista_de_numeros.get(i);
		}
		System.out.println(división);
		System.out.println();
	}
	
	public static void OperaciónPotencia(List<Integer>lista_de_numeros) {
		System.out.print("La potencia de los números de "+lista_de_numeros+" será: ");
		double potencia=lista_de_numeros.get(0);
		for(int i=1;i<lista_de_numeros.size();i++) {
			potencia=pow(potencia,lista_de_numeros.get(i));
		}
		System.out.print(potencia);
		System.out.println();
	}
}
