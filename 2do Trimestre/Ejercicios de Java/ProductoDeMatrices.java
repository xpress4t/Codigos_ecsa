public class ProductoDeMatrices {
		public static void main(String[] args) {
			int[][] matriz_1=new int[5][5];
			int[][] matriz_2=new int[5][5];
			int[][] matriz_producto=new int[5][5];
			System.out.println("\t\tMatriz 1");
			System.out.println("   ");
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					matriz_1[i][j]=(int)(Math.random()*9+1);
					if(i<=5 && j<=i) {
						matriz_1[i][j]=0;
					} 
					System.out.print("\t"+matriz_1[i][j]+"  ");
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println("\t\tMatriz 2");
			System.out.println("   ");
			for(int x=0;x<5;x++) {
				for(int y=0;y<5;y++) {
					matriz_2[x][y]=(int)(Math.random()*9+1);
					if(x<=5 && y<=x) {
						matriz_2[x][y]=0;
					}
					System.out.print("\t"+matriz_2[x][y]+"  ");
				}
				System.out.println("");
			}	
			System.out.println("");
			System.out.println("\tMultiplicación de Matriz 1 y Matriz 2");
			System.out.println("   ");
			for(int i=0;i<5;i++) {
				for(int y=0;y<5;y++) {
					int suma=0;
					for(int j=0;j<5;j++) {
						suma+=matriz_1[i][j]*matriz_2[j][y];
					}
					matriz_producto[i][y]=suma;
					System.out.print("\t"+matriz_producto[i][y]+"   ");
				}
				System.out.println("");
			}
		}
	}
	
	
	
	
	
	