package codigo;
import java.util.Scanner;
public class pruebasDeFuncionesExamen {
	public static void main(String[] args) {
        do {        	
        	jugarBingo();
        }while(continuar()); 
    }
    
    
    public static void jugarBingo() {
        int[][] cartonJugador1 = generarCarton();
        int[][] cartonJugador2 = generarCarton();

        System.out.println("Cartón del Jugador 1:");
        imprimirCarton(cartonJugador1);

        System.out.println("\nCartón del Jugador 2:");
        imprimirCarton(cartonJugador2);

        int[] bombo = generarBombo();

        System.out.println("\nComienza el juego de Bingo:");
        jugarBingo(cartonJugador1, cartonJugador2, bombo);
    }
    public static int[] generarBombo() {
        int[] bombo = new int[20];
        for (int i = 0; i < 20; i++) {
            bombo[i] = i + 1;
        }
        return bombo;
    }
    public static void imprimirCarton(int[][] carton) {
        for (int x = 0; x < carton.length; x++) {
            for (int y = 0; y < carton[x].length; y++) {
                System.out.print(carton[x][y] + "  ");
            }
            System.out.println();
        }
    }
    
    public static boolean contieneNumero(int[][] carton, int numero) {
    	for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == numero) {
					return true;
				}
			}
		}
		return false;
    }
    
    // Esta función solicita al usuario si desea continuar
    //jugando y devuelve true si la respuesta es "S" (Sí) o false si es "N" (No).
	public static boolean continuar() {
		 Scanner sc=new Scanner(System.in);
		 String continuacion=sc.nextLine();
		 if(continuacion=="S") return true;
		 else return false;
	}

    // Esta función genera un cartón de Bingo aleatorio de 2x5, 
    // llenando cada celda con números únicos entre 1 y 20.
    // tiene que haber la misma cantidad de número 1-10 que 11-20
    public static int[][] generarCarton() {
    	int[][] carton= new int [2][5];
    	
    	for (int i=0;i<5;i++) {
    	    int numero=(int) (Math.random() * 10 + 1);
    	    while (contieneNumero(carton,numero)==true) {
    		    numero=(int) (Math.random() * 10 + 1);
    	    }
    	    carton[0][i]=numero;
    	}
    	
    	for (int i=0;i<5;i++) {
    	    int numero=(int) (Math.random()*(20-10+1)+10);
    	    while (contieneNumero(carton,numero)==true) {
    		    numero=(int) (Math.random() * 10 + 1);
    	    }
    	    carton[1][i]=numero;
    	}
     	return carton;
    }

   

    // Esta función simula el juego de Bingo, 
    //extrayendo números del bombo y verificando si 
    //algún jugador ha completado su cartón.
    public static void jugarBingo(int[][] cartonJugador1, int[][] cartonJugador2, int[] bombo) {
    	for(int f=0;f<bombo.length;f++) {
    		if(esCartonCompleto(cartonJugador1)) {
    			System.out.println("Ha ganado el jugador 1");
    			break;
    		}
    		if(esCartonCompleto(cartonJugador2)) {
    			System.out.println("Ha ganado el jugador 2");
    			break;
    		}
    		System.out.println("Sacamos el número "+bombo[f]);
    		System.out.println("Carton J1");
    		completarCarton(cartonJugador1,bombo[f]);
    		imprimirCarton(cartonJugador1);
    		System.out.println("Carton J2");
    		completarCarton(cartonJugador2,bombo[f]);
    		imprimirCarton(cartonJugador2);
    	}
    }


    // Función para verificar si un cartón está completo.
    // Si todo el carton es 0 estará completo
    public static boolean esCartonCompleto(int[][] carton) {
    	int contador=0;
    	for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == 0) {
					contador++;	
				}
			}
		}
    	if(contador==10) return true;
    	else return false;
    }
    

    public static boolean completarCarton(int[][] carton, int numero) {
    	for (int x = 0; x < carton.length; x++) {
			for (int y = 0; y < carton[x].length; y++) {
				if (carton[x][y] == numero) {
					carton[x][y]=0;
					return true;
				}
			}
		}
		return false;
    }
		
}