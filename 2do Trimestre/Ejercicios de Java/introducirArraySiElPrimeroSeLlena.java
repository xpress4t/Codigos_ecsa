/*
 * TAMAÑO FIJO, Y NO LE PUEDO METER UN 6TO ARRAY, AL ARRAY QUE PASO POR PARÁMETRO,
 * LE AÑADO MÁS TAMAÑO, Y COPIAR DE NUEVO Y HACER QUE HAYA UN 6TO ARRAY, O SEA CREAR UNO NUEVO,
 * PERO CON 6 POSICIONES 
 * 
 */
public class introducirArraySiElPrimeroSeLlena {
	public static void main(String[] args) {
		int[] arrayNumero=new int[5];
			for(int i=0;i<100;i++) {
				arrayNumero=agregarDatoAlArray(arrayNumero,i,i);
			}
			arrayNumero=agregarDatoAlArray(arrayNumero,55555,120);
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
