package codigo;

import java.util.Iterator;

public class verificarNumeroPalindromo {
	public static void main(String[] args) {
		int [][] matriz=new int [9][9];
		for(int i=0;i<9;i++) {
			System.out.println("--------------------------------------------");
			for(int j=0;j<9;j++) {
				matriz[i][j]=(int)(Math.random()*9+1);
				System.out.print("|");
				System.out.print(" "+matriz[i][j]+"  ");  
			}
			System.out.println("");
		}
	}
}


