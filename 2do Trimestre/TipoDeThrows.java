public class TipoDeThrows {
	/*
	 * PONGO UN THROWS PARA DECIRLE AL PROGRAMA QUE POSIBLEMENTE 
	 * HAYA UNA EXCEPCIÓN DE ALGÚN TIPO.
	 * 
	 * PUEDO QUITAR O PONER EL "throws Exception" DENTRO DE 
	 * public static void main(String[] ARGS) { 
	 * YA QUE NO AFECTARÁ NADA AL MOMENTO DE EJECUTAR EL CÓDIGO.
	 * 
	 */
		public static void main(String[] args) {
			try {
				dividirNum(10,0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void dividirNum(int x1,int x2) throws Exception {
			try {
				System.out.println("La divisón es: "+x1/x2);
			}catch(Exception e) {
				System.out.println(e);
				throw new Exception("Has intentado dividir entre 0");
			}
		}
}