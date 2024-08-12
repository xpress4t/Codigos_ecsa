package clases;
/*
 Crear una clase llamada "Rectángulo"
	Funciones (métodos):
		Constructor: Un constructor que acepte dos parámetros, la longitud (número decimal) y el ancho (número decimal), y los utilice para inicializar los atributos de la clase.
		Método "calcularÁrea": Un método llamado "calcularÁrea" que no tome ningún parámetro y devuelva el área del rectángulo (longitud * ancho).
		Método "calcularPerímetro": Un método llamado "calcularPerímetro" que no tome ningún parámetro y devuelva el perímetro del rectángulo (2 * longitud + 2 * ancho).
		Métodos getters y setters de todos los atributos		
	Atributos:
		Un atributo llamado "longitud" de tipo double para almacenar la longitud del rectángulo.
		Un atributo llamado "ancho" de tipo double para almacenar el ancho del rectángulo.

 */

public class Rectangulo {
	private double longitud;
	private double ancho;

	public Rectangulo(double longitud, double ancho) {
		this.longitud = longitud;
		this.ancho = ancho;
	}

	public double calcularÁrea() {
		return longitud * ancho;
	}

	public double calcularPerímetro() {
		return 2 * (longitud + ancho);
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLongitud() {
		return longitud;
	}

	public double getAncho() {
		return ancho;
	}
}
