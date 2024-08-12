package Red_Social;

import java.time.LocalDateTime;

public class Mensaje {
	private String remitente;
	private String destinatario;
	private LocalDateTime fecha;
	private String contenidoMensaje;
	
	public Mensaje(String remitente, String destinatario, LocalDateTime fecha, String contenidoMensaje) {
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.fecha = fecha;
		this.contenidoMensaje = contenidoMensaje;
	}
	
	public void notificacionDeMensaje() {
		System.out.println("Usted ha recibido un mensaje de: ");
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getContenidoMensaje() {
		return contenidoMensaje;
	}

	public void setContenidoMensaje(String contenidoMensaje) {
		this.contenidoMensaje = contenidoMensaje;
	}
}