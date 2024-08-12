package codigo;
public class semana5 {
	//	tamaño fijo, y no le puedo meter un 6to array, al array que paso por parametro, le añado mas tamaño, 
	//	y copiar de nuevo y hacer que haya un 6to array, o sea crear uno nuevo pero con 6 posiciones
	public static void main(String[] args) {
		int[] arrayNumero=new int[5];
	//	for(int i=0;i<100;i++) {
	//		arrayNumero=agregarDatoAlArray(arrayNumero,i,i);
	//	}
		arrayNumero=agregarDatoAlArray(arrayNumero,55555,200);
		for(int i=0;i<arrayNumero.length;i++) {
			System.out.println(arrayNumero[i]+" ");
		}
	}
	
	public static int[] agregarDatoAlArray(int[] arrayNumero, int valorIntroducir,int posicion) {
		int[] auxiliar=new int[arrayNumero.length];
		if(posicion>arrayNumero.length-1) {
			do {
				auxiliar=new int [auxiliar.length*2];
			}while(posicion>auxiliar.length-1);
			for(int i=0;i<arrayNumero.length;i++) {
				auxiliar[i]=arrayNumero[i];
			}
			arrayNumero=auxiliar;
		}
		arrayNumero[posicion]=valorIntroducir;
		return arrayNumero;
	}
		
}
