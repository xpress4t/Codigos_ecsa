public class matrizTriangSup {
	public static void main(String[] args) {
		int [][] matriz=new int [5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matriz[i][j]=(int)(Math.random()*9+1);
				if(i<=5 && j<=i) {
					matriz[i][j]=0;
				}
				System.out.print(matriz[i][j]+"  ");
			}
			System.out.println("");
		}
	}
}
