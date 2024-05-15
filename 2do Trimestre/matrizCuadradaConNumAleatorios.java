public class matrizCuadradaConNumAleatorios {
	public static void main(String[] args) {
		int [][] matriz=new int [10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				matriz[i][j]=(int)(Math.random()*9+1);
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
