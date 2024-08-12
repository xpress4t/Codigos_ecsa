package BibliotecaEjercicio;

import java.time.LocalDate;

public class Revista extends RecursoBiblioteca{
	private int numero;
	private String tema;
	
	public Revista(String id, String titulo, int añoPublicacion, int numero, String tema, Biblioteca biblio) {
		super(id, titulo, añoPublicacion, biblio);
		this.numero = numero;
		this.tema = tema;
	}
	
	public void buscarTema() {}
	public void reservar(Usuario usuario) {
		if(!this.reservado) {
			for(String key: biblioteca.getHistorialReservas().keySet()) {
				if(key.equalsIgnoreCase(this.id)) {
					biblioteca.getHistorialReservas().get(key).add(usuario.getId()+"R");
				}
			}
			this.fechaReserva = LocalDate.now();
			this.fechaDevolucion = this.fechaReserva.plusDays(7);
			this.reservado = true;
			this.usuarioR = usuario.getId();
			System.out.println("Reserva realizada con exito."
					+ "Tiene 7 dias para devolver la revista.");
		}else {
			System.out.println("Lo sentimos, la revista solicitada ya está reservada.");
		}
	}
	public void devolver(Usuario usuario) {
		if(this.reservado && usuario.getId()==this.usuarioR) {
			for(String key: biblioteca.getHistorialReservas().keySet()) {
				if(key.equalsIgnoreCase(this.id)) {
					biblioteca.getHistorialReservas().get(key).add(usuario.getId()+"D");
				}
			}
			this.fechaReserva = null;
			this.fechaDevolucion = null;
			this.reservado = false;
			this.usuarioR = null;
			if(LocalDate.now().isAfter(fechaDevolucion)) {
				System.out.println("Fecha de devolucion excedida, falta registrada.");
			}else {
				System.out.println("Revista entregada con exito.");
			}
		}else {
			System.out.println("Ha ocurrido un error.");
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
}
