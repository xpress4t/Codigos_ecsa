package codigo;
public class claseMath {
	public static void main(String[] args) {
		//parse es para pasar de texto a numero
		System.out.println("El valor de PI: "+Math.PI);
		System.out.println("El valor de E: "+Math.E);
		System.out.println("El valor absoluto de -15 es: "+Math.abs(-15));
		// el (int) es para que no me dé decimales
		System.out.println("La raíz cuadrada de 25 es: "+(int)Math.sqrt(625));
		System.out.println("Para elevar un número a un exponente: "+(int)Math.pow(25,2));
		System.out.println("Para calcular el seno de un ángulo en rad: "+Math.sin(53));
		System.out.println("Para calcula rel coseno de un ángulo en rad: "+Math.cos(30));
		System.out.println("Para calcular la tangente de un ángulo en rad: "+Math.tan(45));
		System.out.println(Math.random());
		
	}
}