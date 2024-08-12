package codigo;

public class EjerciciosDeMath {

	public static void main(String[] args) {
		/* EJERCICIO 1 */
		int minimo=1;
		int maximo=100;
		System.out.println("Un número aleatorio en el rango de "+minimo+" a "+maximo+" será: "+numeroAleatorio(minimo,maximo));
		System.out.println("----------------------------");
		/* EJERCICIO 2 */
		double cateto_1=12;
		double cateto_2=6;
		
		System.out.println("El valor de la hipotenusa con los valores "+cateto_1+" y "+cateto_2+" es: "+calcularHipotenusa(cateto_1,cateto_2));
		
		/*EJRCICIO 3 */
		int[] array_1= {12,87};
		int[] array_2= {56,91};
		
		/* EJERCICIO 5 */
		double[] vector_1= {1,5};
		double[] vector_2= {4,12};
		anguloEntreVectores(vector_1,vector_2);
		System.out.println(anguloVectores(vector_1,vector_2));
		
	}
	
	/* EJERCICIO 1 */
	public static int numeroAleatorio(int minimo,int maximo) {
		return (int)(Math.random()*100)+1;
	}
	
	/* EJERCICIO 2 */
	public static double calcularHipotenusa(double cateto_1,double cateto_2) {
		double suma_de_cuadrados=Math.pow(cateto_1,2)+Math.pow(cateto_2,2);
		return Math.sqrt(suma_de_cuadrados);
	}
	
	/* EJERCICIO 3 */
	public static void calcularMaxMin(int[] arrayNums) {
		int max=arrayNums[0];
		int min=arrayNums[0];
		for(int i=0;i<arrayNums.length;i++) {
			min=Math.min(min,arrayNums[i]);
			max=Math.max(max,arrayNums[i]);
		}
		System.out.println("El valor máximo del array es: "+max);
		System.out.println("El valor mínimo del array es: "+min);
	}
	
	/* EJERCICIO 5 */
	public static void anguloEntreVectores(double[] vector_1,double[] vector_2) {
		//PRODUCTO ESCALAR SOBRE EL PRODUCTO DE SUS MODULOS
		double producto_1=vector_1[0]*vector_2[0];
		double producto_2=vector_1[1]*vector_2[1];
		double producto_escalar=producto_1+producto_2;
		System.out.println("Producto escalar entre los vectores (1,5) y (4,12) --> "+producto_escalar);
		
		double producto_3=Math.sqrt(Math.pow(vector_1[0],2)+Math.pow(vector_1[1],2));
		double producto_4=Math.sqrt(Math.pow(vector_2[0],2)+Math.pow(vector_2[1],2));
		double producto_modulo=producto_3*producto_4;
		System.out.println("El producto de los módulos de los vectores (1,5) y (4,12) --> "+producto_modulo);
		
		double coseno_entre_dos_angulos=producto_escalar/producto_modulo;
		System.out.println("El coseno del angulo formado por los dos vectores es: "+coseno_entre_dos_angulos);
		
		System.out.println("El angulo final es: "+Math.toDegrees(Math.acos(coseno_entre_dos_angulos)));
	}
	
	public static double anguloVectores(double[] vector_1,double[] vector_2) {
		double productoEscalar=vector_1[0]*vector_2[0]+vector_1[1]*vector_2[1];
		double modulo1=Math.sqrt(Math.pow(vector_1[0],2)+Math.pow(vector_1[1],2));
		double modulo2=Math.sqrt(Math.pow(vector_2[0],2)+Math.pow(vector_2[1],2));
		double resultado=Math.toDegrees(Math.acos(productoEscalar/modulo1*modulo2));
		return resultado;
	}
}
