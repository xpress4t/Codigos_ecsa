package emmanuelCordovaMuñoz_AEA1T1;
import java.util.Arrays;
public class huevadas_3 {
	public static void main(String[] args) {
		/*
		 * if(5==5)
		 * 		System.out.println();
		 * else
		 * 		System.out.println();
		 * System.out.pritln();
		 * 
		 */
		int [] array =new int[5];
		array[0]=42;
		array[1]=-4;
		array[2]=-63;
		array[3]=633;
		array[4]=7;
		
		System.out.println(Arrays.toString(array));
		System.out.println("--------------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("--------------------------");
		for(int aux: array) {
			System.out.println(aux);
		}
		System.out.println("--------------------------");
		String txt="Hola buenos días";
		for(char t:txt.toCharArray()) {
			System.out.println(t);
		}
		System.out.println("--------------------------");
		int x=68;
		String resultado = (x%2==0)? (x>5)? "Es par y mayor que 5" : "Es par y menor que 5" : "Es impar";
		System.out.println(resultado);
		
		if(x%2==0) {
			if(x>=5) {
				System.out.println("ES PAR y mayor de 5");
			}else {
				System.out.println("ES PAR y menor de 5");
			}
		}else {
			System.out.println("ES IMPAR");
		}
	}
}