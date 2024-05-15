public class matrizConForEach {
    public static void main(String[] args) {
		int [][] matriz = new int [5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matriz[i][j]=(int)(Math.random()*9+1);
			}
		}
		for(int[] i : matriz) {
			for(int matrizImp : i) {
				System.out.print(matrizImp+" ");
			}
			System.out.println();
		}
	}
}
