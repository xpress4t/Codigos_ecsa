import java.util.Random;
import java.util.Scanner;

public class dadoElegido {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random rd = new Random();
		int numeroDeCaras=0;
		generarNumeroAleatorio(scan,rd,numeroDeCaras);
	}
	public static void generarNumeroAleatorio(Scanner scan, Random rd, int numeroDeCaras) {
		System.out.print("Ingrese el número de caras del dado: ");
		numeroDeCaras = scan.nextInt();
		if(numeroDeCaras==1) {
			System.out.println("Un número para su dado de "+numeroDeCaras+" cara será: "+numeroDeCaras);
		}else {
			int numeroAleatorio=0;
			for(int i=0;i<numeroDeCaras;i++) {
				numeroAleatorio=rd.nextInt(1, numeroDeCaras+1);
			}
			System.out.println("Un número aleatorio para su dado de "+numeroDeCaras+" caras será: "+numeroAleatorio);
		}
	}
}