public class suma_de_filas_y_columnas {
	public static void main(String[] args) {
		int[][] matriz=new int [7][5];
		String espacio="=";
		for(int i=0;i<7;i++) {
			int sumaFilas=0;
			for(int j=0;j<5;j++) {
				matriz[i][j]=(int)(Math.random()*9+1);
				sumaFilas+=matriz[i][j];
				System.out.print(" "+matriz[i][j]+" ");
			}
			System.out.println("= "+sumaFilas);
		}
		for(int k=0;k<5;k++) {
			System.out.print(" "+espacio+" ");
		}
		System.out.println("");
		for(int j=0;j<5;j++) {
			int sumaColumnas=0;
			for(int i=0;i<7;i++) {
				sumaColumnas+=matriz[i][j];
			}
			System.out.print(" "+sumaColumnas);
		}
	}
}
