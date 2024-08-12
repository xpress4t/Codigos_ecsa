/*    Autor:
 * 			 _____________________
 *   		|					  |
 * 			|	Emmanuel Ismael	  |
 * 			|	Cordova Muñoz     |
 * 			|_____________________|
 * 
 */
package codigo;
public class Ejercicios {
	public static void main(String[] args) {
		/* 
		 Ejercicio 1:
		 	Declara 4 variables de tipo entero y dales los siguientes valores: 5, 16, 175 y -12 respectivamente
		 Ejercicio 2:		 	 
		 	Declara las variables necesarias(del tipo más adecuado) para hacer las siguientes operaciones:
		 		- variable 1 multiplicando variable 2
		 		- variable 3 menos variable 1 por variable 4
		 		- (variable 1 menos variable 3) mas variable 4
		 		- variable 4 dividido variable 3 
		 Ejercicio 3:
	 		Crea un programa que usando los  4 números enteros declarados en el ejercicio 1 verifique las siguientes condiciones y muestra un mensaje apropiado para cada una:
				- (Con la estructura IF) Si la variable 1 es mayor o igual a la variable 3
				- (Con la estructura IF) Si la variable 2 es par
				- (Con la estructura IF) Si la variable 4 es negativo
				- (Con la estructura IF) Si la variable 1 es mayor mayor que la varible 2, en caso negativo comprobar si es mayor que la variable 3, en caso negativo si es mayor que la variable 4, en caso contrario mostrar por pantalla que es el número más bajo 
				- (Con la estructura IF) En una sola línea comprobar si la variable 3 es menor que el resto de variables				
		Ejercicio 4:	
			- (Con la estructura SWITCH) Declara una variable que represente el número del día de la semana(1 es lunes y 7 es domingo). Mostrar por pantalla que día de la semana es en función de esa variable 
			- (Con la estructura SWITCH) Declara un texto que sea el nombre del mes. Mostrar por pantalla el número de mes (1 es enero y 12 diciembre)
			- (Con la estructura SWITCH) Usando una variable de tipo numérico entero que represente una nota numérica del 1 al 10. 
				Utiliza una switch para convertir esa nota en una calificación (por ejemplo, A, B, C, D o F) de acuerdo con la siguiente escala:
					9-10: A
					7-8: B
					5-6: C
					3-4: D
					1-2: F
				Concatena en el resultado por pantalla la letra correspondiente y la nota numérica, por ejemplo "A-9" o "D-3"
				Cualquier nota diferente de estas notas mostrará un "Tu nota no es válida"			
	 */
		// EJERCICIO 1 
		float numero1 = 5f,numero2 = 16f,numero3 = 175f,numero4 = -12f;
		
		// EJERCICIO 2
		double multiplicacion,resta_Y_multiplicacion,resta,resta_1,suma_1;
		float division;
		multiplicacion = numero1*numero2;
		System.out.println("La multiplicacion de "+numero1+" * "+numero2+" es "+multiplicacion);
		
		resta = numero3-numero1;
		resta_Y_multiplicacion = resta*numero4;
		System.out.println("La resta de "+numero3+" y "+numero1+" es "+resta+" . Luego, el producto de "+resta+" y "+numero4+" es "+resta_Y_multiplicacion);
		
		resta_1=numero1-numero3;
		suma_1=resta_1+numero4;
		System.out.println("La resta de "+numero1+" y "+numero3+" es "+resta_1+". Luego, la suma de "+resta_1+" y "+numero4+" es "+suma_1);
		
		division=numero4/numero3;
		System.out.println("La division de "+numero4+" y "+numero3+" es "+division);
		
		// EJERCICIO 3
		if(numero1>=numero3){
			System.out.println(numero1+" es mayor o igual que "+numero3);
		}else{
			System.out.println(numero1+" no es mayor o igual que "+numero3);
		}
		
		if(numero2%2==0){
			System.out.println(numero2+" es par");
		}else{
			System.out.println(numero2+" no es par");
		}
		
		if(numero4<0){
			System.out.println(numero4+" es negativo");
		}else{
			System.out.println(numero4+" no es negativo");
		}
		if(numero1>numero2){
			System.out.println(numero1+" es mayor que "+numero2);
			}else if(numero1>numero3){
				System.out.println(numero1+" es mayor que "+numero3);
				}else if(numero1>numero4){
					System.out.println(numero1+" es mayor que "+numero4);
					}else{
					System.out.println(numero1+" es el menor de los numeros");
				}
		
		if(numero3<numero1 && numero3<numero2 && numero3<numero4) {
			System.out.println(numero3+" es la menor de las variables");
		}else {
			System.out.println(numero3+" es la mayor de las variables ");
		}
		
		// EJERCICIO 4
		int dia_de_la_semana = 3;
		switch(dia_de_la_semana) {
		case 1:
			System.out.println("Hoy es lunes");
			break;
		case 2:
			System.out.println("Hoy es martes");
			break;
		case 3:
			System.out.println("Hoy es miercoles");
			break;
		case 4:
			System.out.println("Hoy es jueves");
			break;
		case 5:
			System.out.println("Hoy es viernes");
			break;
		case 6:
			System.out.println("Hoy es sabado");
			break;
		case 7:
			System.out.println("Hoy es domingo");
			break;	
		}
		
		String nombre_del_mes = "Septiembre";
		switch(nombre_del_mes) {
		case "Enero":
			System.out.println("Es el mes número 1");
			break;
		case "Febrero":
			System.out.println("Es el mes número 2");
			break;
		case "Marzo":
			System.out.println("Es el mes número 3");
			break;
		case "Abril":
			System.out.println("Es el mes número 4");
			break;
		case "Mayo":
			System.out.println("Es el mes número 5");
			break;
		case "Junio":
			System.out.println("Es el mes número 6");
			break;
		case "Julio":
			System.out.println("Es el mes número 7");
			break;
		case "Agosto":
			System.out.println("Es el mes número 8");
			break;
		case "Septiembre":
			System.out.println("Es el mes número 9");
			break;
		case "Octubre":
			System.out.println("Es el mes número 10");
			break;
		case "Noviembre":
			System.out.println("Es el mes número 11");
			break;
		case "Diciembre":
			System.out.println("Es el mes número 12");
			break;
			
		}
		
		int nota = 10;
		switch(nota) {
		case 9,10:
			System.out.println("Tienes una A-"+nota);
			break;
		case 7,8:
			System.out.println("Tienes una B-"+nota);
			break;
		case 5,6:
			System.out.println("Tienes una C-"+nota);
			break;
		case 3,4:
			System.out.println("Tienes una D-"+nota);
			break;
		case 1,2:
			System.out.println("Tienes una E-"+nota);
			break;
			
		}
		
	}
}
