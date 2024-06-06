public class sumaDeMatrices {
	public static void main(String[] args) {
		// int suma=0;
		int [][] matriz=new int [10][10];
		System.out.println("\tMatriz 1");
		System.out.println("   ");
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				matriz[i][j]=(int)(Math.random()*9+1);
				if(i<=10 && j<=i) {
					matriz[i][j]=0;
				} 
				System.out.print(matriz[i][j]+"  ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("\tMatriz 2");
		System.out.println("   ");
		for(int x=0;x<10;x++) {
			for(int y=0;y<10;y++) {
				matriz[x][y]=(int)(Math.random()*9+1);
				if(x<=10 && y<=x) {
					matriz[x][y]=0;
				}
				System.out.print(matriz[x][y]+"  ");
			}
			System.out.println("");
		}	
		System.out.println("");
		System.out.println("\tSuma de Matrices");
		System.out.println("   ");
	}
}
