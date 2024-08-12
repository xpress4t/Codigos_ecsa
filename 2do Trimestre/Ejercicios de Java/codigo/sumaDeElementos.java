package codigo;
public class sumaDeElementos {
	public static void main(String[] args) {
		int [][] matriz=new int [15][15];
		String resultado="=";
		for(int i=0;i<15;i++) {
			int suma_1=0;
			for(int j=0;j<15;j++) {
				matriz[i][j]=(int)(Math.random()*10);
				System.out.print(" "+matriz[i][j]+" ");
				suma_1+=matriz[i][j];
			}
			System.out.println("= "+suma_1);
		}
		for(int k=0;k<15;k++) {
			System.out.print(" "+resultado+" ");
		}
		System.out.println("");
		for(int j=0;j<15;j++) {
			int suma_2=0;
			for(int i=0;i<15;i++) {
				suma_2+=matriz[i][j];
			}
			System.out.print(" "+suma_2);
		}
	}
}