package libro_biblioteca;

import java.util.ArrayList;
import java.util.List;

/*
 Crear una clase llamada "Biblioteca"
	Funciones (métodos):
		Constructor: Un constructor que acepte un parámetro, el nombre de la biblioteca (cadena de caracteres), y lo utilice para inicializar el atributo de la clase.
		Método "agregarLibro": Un método llamado "agregarLibro" que acepte un objeto de tipo "Libro" como parámetro y
		 	lo agregue a una lista de libros disponibles en la biblioteca.
		Método "prestarLibro": Un método llamado "prestarLibro" que acepte el título de un libro (cadena de caracteres)
		 	como parámetro y verifique si el libro está en la lista de libros disponibles. 
		 	Si está disponible, se marca como prestado y se elimina de la lista de libros disponibles.
		Método "devolverLibro": Un método llamado "devolverLibro" que acepte el título de un libro (cadena de caracteres) 
			como parámetro y verifique si el libro está marcado como prestado. Si es así, se marca como disponible y
			se agrega a la lista de libros disponibles.
		Método "listarLibrosDisponibles": Un método llamado "listarLibrosDisponibles" que no tome ningún parámetro y
			muestre en la consola la lista de libros disponibles en la biblioteca.
		Método "listarLibrosPrestados": Un método llamado "listarLibrosPrestados" que no tome ningún parámetro y 
			 muestre en la consola la lista de libros prestados en la biblioteca.
		Métodos getters y setters de todos los atributos que lo necesiten
	Atributos:
		Un atributo llamado "nombreBiblioteca" de tipo String para almacenar el nombre de la biblioteca.
		Una lista de libros disponibles.
		Una lista de libros prestados.
		
*/
public class Biblioteca {
    private String nombreBiblioteca;
    private List<Libro> librosDisponibles;
    private List<Libro> librosPrestados;

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.librosDisponibles = new ArrayList<>();
        this.librosPrestados = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equals(titulo)) {
                librosDisponibles.remove(libro);
                librosPrestados.add(libro);
                return;
            }
        }
        System.out.println("Error: El libro no está disponible en la biblioteca.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : librosPrestados) {
            if (libro.getTitulo().equals(titulo)) {
                librosPrestados.remove(libro);
                librosDisponibles.add(libro);
                return;
            }
        }
        System.out.println("Error: El libro no se encuentra en la lista de libros prestados.");
    }

    public void listarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : librosDisponibles) {
            System.out.println("- " + libro.getTitulo());
        }
    }

    public void listarLibrosPrestados() {
        System.out.println("Libros prestados:");
        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro.getTitulo());
        }
    }

    public String obtenerNombreBiblioteca() {
        return nombreBiblioteca;
    }
}

