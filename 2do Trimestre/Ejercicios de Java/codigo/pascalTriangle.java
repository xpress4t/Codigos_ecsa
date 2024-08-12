package codigo;

import java.util.Scanner;

public class pascalTriangle {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner (System.in);
		System.out.print("Ingrese el numero de filas: ");
		n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println();
			for(int k=0;k<=n-i-1;k++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("  "+combinacion(i,j)+" ");
			}
			System.out.println();
		}
	}
	public static int factorial(int n) {
			int resultado=1;
			for(int i=1;i<=n;i++) {
				resultado*=i;	
			}
			return resultado;
		}
	public static int combinacion(int n,int k) {
		return (factorial(n))/(factorial(k)*factorial(n-k));
	}

}
