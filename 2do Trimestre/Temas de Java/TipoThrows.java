public class TipoThrows {
	// Pongo un throws para decirle al programa que posiblemente 
	// haya una excepcion de algún tipo
	public static void main(String[] args) throws Exception {
		try {
			dividirNum(10,0);
		} catch (Exception excepcion) {
			excepcion.printStackTrace();
		}
	}
	public static void dividirNum(int x1,int x2) throws Exception {
		try {
			System.out.println("La divisón es: "+x1/x2);
		}catch(Exception excepcion) {
			System.out.println(excepcion);
			throw new Exception("Has intentado dividir entre 0");
		}
	}
}