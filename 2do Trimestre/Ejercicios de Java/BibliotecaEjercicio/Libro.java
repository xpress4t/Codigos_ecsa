package BibliotecaEjercicio;

import java.time.LocalDate;

public class Libro extends RecursoBiblioteca{
	private String autor;
	private String editorial;
	
	
	public Libro(String id, String titulo, int añoPublicacion,Biblioteca biblio, String autor, String editorial){
		super(id,titulo,añoPublicacion,biblio);
		this.autor = autor;
		this.editorial = editorial;
	}
	
	public void buscarAutor() {}
	public void reservar(Usuario usuario) {
		if(!this.reservado) {
			for(String key: biblioteca.getHistorialReservas().keySet()) {
				if(key.equalsIgnoreCase(this.id)) {
					biblioteca.getHistorialReservas().get(key).add(usuario.getId()+"R");
				}
			}
			this.fechaReserva = LocalDate.now();
			this.fechaDevolucion = LocalDate.now().plusDays(30);
			this.reservado = true;
			this.usuarioR = usuario.getId();
			System.out.println("Reserva realizada con exito."
					+ "Tiene 30 dias para devolver el libro.");
		}else {
			System.out.println("Lo sentimos, el libro solicitado ya está reservado.");
		}
		
	}
	public void devolver(Usuario usuario) {
		if(this.reservado && usuario.getId()==this.usuarioR) {
			for(String key: biblioteca.getHistorialReservas().keySet()) {
				if(key.equalsIgnoreCase(this.id)) {
					biblioteca.getHistorialReservas().get(key).add(usuario.getId()+"D");
				}
			}
			if(LocalDate.now().isAfter(fechaDevolucion)) {
				System.out.println("Fecha de devolucion excedida, falta registrada.");
			}else {
				System.out.println("Libro entregado con exito.");
			}
			this.fechaReserva = null;
			this.fechaDevolucion = null;
			this.reservado = false;
			this.usuarioR = null;
		}else {
			System.out.println("Ha ocurrido un error.");
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}	
	
}
