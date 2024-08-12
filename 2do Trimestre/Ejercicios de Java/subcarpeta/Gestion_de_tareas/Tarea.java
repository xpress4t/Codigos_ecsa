package Gestion_de_tareas;

public class Tarea {
	private String nombre;
	private String descripcion;
	private String estado;
	
	public Tarea(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = "PENDIENTE";
	}
	
	public void acualizarEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}

/*
*
*Un equipo de desarrollo de software necesita un sistema de gestión de tareas para organizar su trabajo.
*Cada tarea tiene detalles como nombre, descripción y estado (pendiente, en progreso o completada).
*El sistema debe permitir a los miembros del equipo crear nuevas tareas, actualizar su estado y 
*asignar tareas a otros miembros del equipo. Todo esto hacerlo en java con clases. 
*/