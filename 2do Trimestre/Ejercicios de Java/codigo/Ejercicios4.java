package codigo;
public class Ejercicios4 {
	public static void main(String[] args) {
		// METODO WHILE
		int i=0;
		while(i<10) {
			if(i==5) {
				break;
			}
			System.out.println("El valor de i es: "+i);
			i++;
		}
		System.out.println("---------");
		
		//METODO DO-WHILE
		i=0;
		do {
			if(i==5) {
				break;
			}
			System.out.println("El valor de i es: "+i);
			i++;
		}while(i<10);
		System.out.println("---------");
		
		//METODO FOR
		for(i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("El valor de i es: "+i);
		}
		System.out.println("---------");
		
		
		//CONTINUE
		
		int j=0;
		while(j<10) {
			if(j==5) {
				continue;
			}
			System.out.println("El valor de j es: "+j);
			j++;
		}
		System.out.println("---------");
		
		//METODO DO-WHILE
		j=0;
		do {
			if(j==5) {
				j++;
				continue;
			}
			System.out.println("El valor de j es: "+j);
		}while(j<10);
		System.out.println("---------");
		
		
		//METODO FOR
		for(j=0;j<10;j++) {
			if(j==5) {
				continue;
			}
			System.out.println("El valor de j es: "+j);
		}
		System.out.println("---------");
		
		
		/* 
		 * HAY QUE HACER UNA FUNCION QUE SAQUE VALORES ENTEROS ALEATORIOS 1-100 Y ME DIGA  
		 * CUANTOS INTENTOS HA NECESITADO PARA ENCONTRAR EL 53
		 */
		
		System.out.println(calcularIntentos(53));

	}
	
	// FUNCION QUE DIGA NUMERO DE INTENTOS PARA HALLAR EL 53
	public static int calcularIntentos(int valorBuscado) {
		int intentos=0;
		while(true) {
			if(aleatorio()==valorBuscado) {
				break;
			}
			intentos++;
		}
		return intentos;
	}
	public static int aleatorio() {
		return (int)(Math.random()*100)+1;
	}
}
