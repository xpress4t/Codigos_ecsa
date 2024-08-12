package BibliotecaEjercicio;

public class Usuario {
	private String id;
	private Biblioteca biblioteca;

	public Usuario(String id, Biblioteca biblioteca) {
		this.id = id;
		this.biblioteca = biblioteca;
		biblioteca.añadirUsuario(this);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
