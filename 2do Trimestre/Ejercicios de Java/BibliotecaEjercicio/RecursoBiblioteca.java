package BibliotecaEjercicio;

import java.time.LocalDate;

public class RecursoBiblioteca implements RecursosBibliotecaInterface{
	protected Biblioteca biblioteca;
	protected String id;
	protected String titulo;
	protected int añoPublicacion;
	protected boolean reservado;
	protected LocalDate fechaReserva;
	protected LocalDate fechaDevolucion;
	protected String usuarioR;
	
	public RecursoBiblioteca(String id, String titulo, int añoPublicacion, Biblioteca biblio) {
		this.id = id;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.biblioteca = biblio;
		this.reservado = false;
		this.usuarioR = null;
		biblioteca.añadirRecurso(this);
	}
	
	@Override
	public void reservar(Usuario usuario) {
		for(String key: biblioteca.getHistorialReservas().keySet()) {
			if(key.equalsIgnoreCase(this.id)) {
				biblioteca.getHistorialReservas().get(key).add(usuario.getId()+"R");
			}
		}
	}
	
	@Override
	public void devolver(Usuario usuario) {
		for(String key: biblioteca.getHistorialReservas().keySet()) {
			if(key.equalsIgnoreCase(this.id)) {
				biblioteca.getHistorialReservas().get(key).add(usuario.getId()+"D");
			}
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

}
