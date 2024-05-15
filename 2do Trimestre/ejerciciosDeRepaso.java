
public class ejerciciosDeRepaso {
	public static void main(String[] args) {
		
		// el trin quita el inicio y el final
		
	/* EJERCICIO 1 */
	int numero_1=17;
	int numero_2=28;
	calcularSuma(numero_1,numero_2);
	
	/* EJERCICIO 2 */
	double a=15.43;
	double b=24.94;
	calcularMultiplicacion(a,b);

	/* EJERCICIO 3 */
	double valor_1=43.5;
	double valor_2=4.1;
	calcularDivision(valor_1,valor_2);

	/* EJERCICIO 4 */
	double radio=4.5;
	areaCirculo(radio);

	/* EJERCICIO 5 */
	int numero=81641;
	numeroImparPar(numero);

	/* EJERCICIO 6 */
	double x=12;
	double y=31;
	double z=83;
	mayor(x,y,z);
	menor(x,y,z);
	
	/* EJERCICIO 10 */
	String texto = "p: nemaxe yah anañaM";
	ordenInverso(texto);
	}
	
	// Ejercicio 1
	public static void calcularSuma(int numero_1,int numero_2) {
		int suma=numero_1+numero_2;
		System.out.println("La suma de los dos enteros ingresados es: "+suma);
		System.out.println("----------------------------------");

	}
	
	// Ejercicio 2
	public static void calcularMultiplicacion(double a,double b) {
		double multiplicacion=a*b;
		System.out.println("La multiplicacion de los flotantes ingresados es: "+multiplicacion);
		System.out.println("----------------------------------");
	}
	
	// Ejercicio 3
	public static void calcularDivision(double valor_1,double valor_2){
		double division=valor_1/valor_2;
		System.out.println("La division de los flotantes ingresados es: "+division);
		System.out.println("----------------------------------");
	}

	// Ejercicio 4
	public static void areaCirculo(double radio){
		double area=3.14159*radio*radio;
		System.out.println("El área del círculo cuyo radio es 4.5, es: "+area);
		System.out.println("----------------------------------");
	}

	// Ejercicio 5
	public static void numeroImparPar(int numero){
		if(numero%2==0){
			System.out.println("El número 81641 es par");
		}else{
			System.out.println("El número 81641 es impar");
		}
		System.out.println("-------------------------------------");
	}

	// Ejercicio 6
	public static void mayor(double x,double y,double z){
		if(x>=y && x>=z){
			System.out.println(x+" es el mayor de los tres números");
		}else if(y>=x && y>=z){
			System.out.println(y+" es el mayor de los tres números");
		}else{
			System.out.println(z+" es el mayor de los tres números");
		}
		System.out.println("-------------------------------------");
	}
	

	public static void menor(double x,double y,double z){
		if(x<=y && x<=z){
			System.out.println(x+" es el menor de los tres números");
		}else if(y<=x && y<=z){
			System.out.println(y+" es el menor de los tre números");
		}else{
			System.out.println(z+" es el menor de los tres números");
		}
		System.out.println("-------------------------------------");
	}

	// Ejercicio 10

	public static void ordenInverso(String texto){
		String texto_al_reves=" ";
		for(int i=texto.length()-1;i>=0;i--){
			texto_al_reves=texto_al_reves+texto.charAt(i);
		}
		System.out.println("El texto al revés será --> "+texto_al_reves);
	}
	

}