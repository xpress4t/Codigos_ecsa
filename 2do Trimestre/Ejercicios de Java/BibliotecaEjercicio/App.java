package BibliotecaEjercicio;

public class App {
	public static void main(String[] args) {
		Biblioteca biblio = new Biblioteca();
		RecursoBiblioteca lib1 = new Libro("01l", "Poemas", 2000, biblio,"Chavez","milkyEditorial");
		RecursoBiblioteca lib2 = new Libro("02l", "Cuentos", 2002, biblio,"Chavez","milkyEditorial");
		RecursoBiblioteca lib3 = new Libro("03l", "El libro troll", 2010, biblio,"Rubius","milkyEditorial");
		RecursoBiblioteca rev1 = new Revista("01r","farandula",2020,1,"Cristian Dominguez", biblio);
		Usuario user1 = new Usuario("01u",biblio);
		Usuario user2 = new Usuario("02u", biblio);
		lib1.reservar(user1);
		lib1.reservar(user2);
		rev1.reservar(user2);
		lib1.devolver(user2);
		lib1.devolver(user1);
		biblio.verHistorial();
		biblio.buscarPorTema("Cristian dominguez");
		biblio.buscarPorAutor("chavez");
	}
}
