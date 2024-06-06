import java.util.Scanner;
public class ArbolDeNavidadConFunciones {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("¿De cuántos pisos quiere su árbol de navidad?  ");
		int pisos = scan.nextInt();
		ArbolDeNavidad(pisos);
	}
	public static void ArbolDeNavidad(int pisos) {
		for(int i=0;i<pisos;i++) {
			System.out.println("");
			for(int j=0;j<pisos-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=2*i+1;k>0;k--) {
					System.out.print("*");
				}
		}
		for(int x=0;x<2;x++) {
			System.out.println("");
			for(int w=0;w<pisos-2;w++) {
				System.out.print(" ");
			}
			for(int y=0;y<3;y++) {
				System.out.print("|");
			}
		}
	}
}
