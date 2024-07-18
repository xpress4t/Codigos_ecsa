import java.util.Scanner;
public class pruebaDeCodigo {
    public static void main(String[] args){
        int numSecreto=(int)(Math.random()*100);
		int intentos=0;
		while (true) {
			int numABuscar=pedirNum();
			if(numABuscar>numSecreto){
				System.out.println("El numero introducido es mayor que el número oculto");
			}else if(numABuscar<numSecreto){
				System.out.println("El número introducido es menor que el número oculto");
			}else{
				System.out.println("Si, has ganado, el número secreto era: "+numSecreto+"\nHas ganado "+intentos);
				break;
			}
			intentos++;
		}
    }
	public static int pedirNum(){
		System.out.println("Introduce un número entero entre 0 y 99");
		Scanner sc = new Scanner(System.in);
		int numUsuario;
		try {
			numUsuario = sc.nextInt();
		} catch (Exception e) {
			// El usuario ha introducido cualquier cosa menos un número entero
			System.out.println("No has introducido un número");
			return pedirNum();
		}
		if(numUsuario<0 || numUsuario>99){
			System.out.println("El número introducido está fuera de rango");
			return pedirNum();
		}
		return numUsuario;
	}
}
