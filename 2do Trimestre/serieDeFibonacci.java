public class serieDeFibonacci {
	public static void main(String[] args) {
		int numero=8;
		serieFibonacci(numero);
		System.out.println("La posicion numero "+numero+" en la serie de Fibonacci es: "+serieFibonacci(numero));
		
	}
	public static int serieFibonacci(int numero) {
		if(numero<=1) {
			return numero;
		}else {
			int x=0,y=1,resultado=0;
			for(int i=3;i<=numero;i++) {
				resultado=x+y;
				x=y;
				y=resultado;
			}
			return resultado;
		}
	}
}
