package libro_biblioteca;

/*
Crear una clase llamada "Libro"
	Funciones (métodos):
		Constructor: Un constructor que acepte tres parámetros, el título (cadena de caracteres), 
		el autor (cadena de caracteres) y el año de publicación (entero), 
		y los utilice para inicializar los atributos de la clase.
		
		Métodos getters y setters de todos los atributos
	Atributos:
		Un atributo llamado "título" de tipo String para almacenar el título del libro.
		Un atributo llamado "autor" de tipo String para almacenar el autor del libro.
		Un atributo llamado "añoPublicación" de tipo entero para almacenar el año de publicación del libro.
*/
public class Libro {
	private String título;
	private String autor;
	private int añoPublicación;

	public Libro(String título, String autor, int añoPublicación) {
		this.título = título;
		this.autor = autor;
		this.añoPublicación = añoPublicación;
	}
	
	public void setTitulo(String título) {
		this.título=título;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setAñoPublicación(int añoPublicación) {
		this.añoPublicación = añoPublicación;
	}

	public String getTitulo() {
		return título;
	}

	public String getAutor() {
		return autor;
	}

	public int getAñoPublicación() {
		return añoPublicación;
	}

}
