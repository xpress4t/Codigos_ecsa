package Tienda_de_mascotas;

class CitaVeterinario {
	
	private String id_de_la_cita;
	private Date fecha_y_hora;
	private String mascota;
	private String motivo_de_la_cita;
	
	// Constructor
	
	public CitaVeterinario(String id_de_la_cita, Date fecha_y_hora, String mascota, String motivo_de_la_cita) {
		this.id_de_la_cita = id_de_la_cita;
		this.fecha_y_hora = fecha_y_hora;
		this.mascota = mascota;
		this.motivo_de_la_cita = motivo_de_la_cita;
	}
	
	// Methods
	
	public void reprogramarCita(String nuevaFechaHora) {
		
	}
	
	public String cancelarCita() {
		return String.format(id_de_la_cita,fecha_y_hora,mascota,motivo_de_la_cita);
	}
	
	
	// Getters y Setters

	public String getID_de_la_cita() {
		return id_de_la_cita;
	}

	public void setID_de_la_cita(String id_de_la_cita) {
		this.id_de_la_cita = id_de_la_cita;
	}

	public String getFecha_y_hora() {
		return fecha_y_hora;
	}

	public void setFecha_y_hora(Date fecha_y_hora) {
		this.fecha_y_hora = fecha_y_hora;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	public String getMotivo_de_la_cita() {
		return motivo_de_la_cita;
	}

	public void setMotivo_de_la_cita(String motivo_de_la_cita) {
		this.motivo_de_la_cita = motivo_de_la_cita;
	}
}
