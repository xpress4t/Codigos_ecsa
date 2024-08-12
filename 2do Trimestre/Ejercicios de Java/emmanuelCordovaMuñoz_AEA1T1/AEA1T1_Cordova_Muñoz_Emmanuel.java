package emmanuelCordovaMuñoz_AEA1T1;
public class AEA1T1_Cordova_Muñoz_Emmanuel {
	public static void main(String[] args) {
		
		// EJERCICIO 1 //
		int numero=10;
		tabla_de_multiplicar(numero);	
		
		//EJERCICIO 2 //
	 	int numero_3=0;
	 	suma_termina_3(numero_3);
		
		// EJERCICIO 3 //
		int numero_48=48;
		divisores_de_48(numero_48);
		
		// EJERCICIO 4 //
		String txt="Hola, tengo hambre";
		contadorVocales(txt);
		
		// EJERCICIO 5 //
		int edad=24;
		edad_de_persona(edad);
		
		// EJERCICIO 6 //
		int number1=10;
		int number2=20;
		double result=sumar(number1,number2);
		System.out.println("Resultado suma: "+result);
		result=multiplicar(number1,number2);
		System.out.println("Resultado de multiplicacion: "+result);
		String name="Juan";
		saludar(name);
	}
	
	
	// EJERCICIO 1 //
	public static void tabla_de_multiplicar(int numero) {
		int multiplicacion=1;
		System.out.println("      // EJERCICIO 1 //       ");
		System.out.println("                              ");
		for(int i=1;i<=10;i++) {
			multiplicacion=numero*i;
			System.out.println(i+" * "+numero+" = "+multiplicacion);
		}
		System.out.println("--------------------------------");
	}
	
	
	// EJERCICIO 3 //
	public static void divisores_de_48(int numero_48) {
		int divisores=1;
		System.out.println("      // EJERCICIO 3 //       ");
		System.out.println("                              ");
		for(int i=1;i<=48;i++) {
			divisores=numero_48/i;
			if(numero_48%i==0) {
			System.out.println(numero_48+" / "+i+" = "+divisores);
		}
		}
		System.out.println("--------------------------------");
	}
	
	
	// EJERCICIO 5 //
	public static void edad_de_persona(int edad) {
		System.out.println("      // EJERCICIO 5 //       ");
		System.out.println("                              ");
		if(edad<=12) {
			System.out.println("Tiene "+edad+" años, entonces es un niño.");
		}else if(edad>12 && edad<=18) {
			System.out.println("Tiene "+edad+" años, entonces es un adolescente.");
		}else if(edad>18 && edad<=40) {
			System.out.println("Tiene "+edad+" años, entonces es un adulto joven.");
		}else if(edad>40 && edad<=110) {
			System.out.println("Tiene "+edad+" años, entonces es un adulto mayor.");
		}else {
			System.out.println("Tiene "+edad+" años, entonces no sé que es ¿o.O?.");
		}
		System.out.println("--------------------------------");
	}
	
	
	// EJECICIO 6 //
	
	/*
	 * Línea 9: Falta cerrar el paréntesis luego de la palabra result
	 *
	 * Línea 11: FaLta el punto y coma al final de la línea de código
	 * 
	 * Linea 22: Cambiar el multiply por multiplicar ó al revés, y especificar que tipo de variable es b,
	 * 			 que en el caso del código, sería int b
	 * 
	 * Línea 14: Debe cambiarse por un "=", ya que el "==" es para comparar una igualdad estricta
	 * 
	 */
	public static double sumar(int a,int b) {
		System.out.println("      // EJERCICIO 6 //       ");
		System.out.println("                              ");
	return a+b;
	}
	public static int multiplicar(int a,int b) {
	return a*b;
	}
	public static void saludar(String name) {
		System.out.println("Hola, "+name);
	}	
	
	
	// EJERCICIO 2 //
	
	
	  public static void suma_termina_3(int numero_3) {
		System.out.println("      // EJERCICIO 2 //       ");
		System.out.println("                              ");
	 	int sumando=0;
	 	for(int i=0;i<100;i++) {
	 		if(i%10==3) {
	 			sumando+=i;
	 		}
	  }
	  System.out.println("La suma es: "+sumando);
	  System.out.println("--------------------------------");
	  }
	  
	  
	  
	  // EJERCICIO 4 //
	  public static void contadorVocales(String txt) {
		System.out.println("      // EJERCICIO 4 //       ");
		System.out.println("                              ");
		  int contador=0;
		  for(int i=0;i<txt.length();i++) {
			  char c=txt.charAt(i);
			  if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				  contador++;
			  }
		  }
		  System.out.println("Hay "+contador+" vocales");
		  System.out.println("--------------------------------");
	  }
}

	







