package codigo;
public class clase_sobre_throws {
	public static void main(String[] args) throws Exception {
		try {
			dividirNum(5,0);
		} catch (Exception e) {
			// TODO: Auto-generated catch block
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
