package codigo;

public class null_11_10_23 {
	public static void main(String[] args) {
		
		// LOS TIPOS DE DATOS PRIMITIVOS NO FUNCIONAN CON NULL 
		// (POR EJEMPLO, INT, CHAR, SHORT, DOUBLE, ETC)
		
		//"String txt = null;" es lo mismo que hacer "String txt";
		
		String txt="hola buenos dias";
		System.out.println(txt.indexOf("n"));
		// PARA SABER LA 1ª POSICION DEL PARAMETRO
		System.out.println(txt.toUpperCase().indexOf("B"));
		System.out.println(txt.charAt(5));
		
		//devuelve true o false. Busca si el parametro está 
		// dentro del texto
		System.out.println(txt.contains("hola b"));
		
		// Compara 2 textos ignorando las matúsculas y minúsculas
		System.out.println(txt.equalsIgnoreCase("HOLA BUENOS DÍAS"));
		System.out.println(txt.equals("HOLA BUENOS DÍAS"));
		
		String[] arrayPalabras=txt.split("a ");
		for(int i=0;i<arrayPalabras.length;i++) {
			System.out.println("'"+arrayPalabras[i]+"'");
		}
		
		//Comprueba si el String empieza o termina por el parámetro indicado
		System.out.println(txt.startsWith(" "));
		System.out.println(txt.endsWith("dí as"));
	}
}
