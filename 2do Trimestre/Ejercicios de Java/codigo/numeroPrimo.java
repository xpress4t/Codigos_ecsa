package codigo;

public class numeroPrimo {

	public static void main(String[] args) {
		int num=19987;
		numeroPrimo(num);
	}
	public static void numeroPrimo(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("no es primo");
				break;
			}else {
				System.out.println("es primo");
				break;
			}
		}
		
	}
	
}

	