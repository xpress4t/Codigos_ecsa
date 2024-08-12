package Tienda_de_mascotas;

import java.util.ArrayList;

class Mascota {
	
	private ArrayList<String> lista_de_citas;
	private String id_de_la_mascota;
	private String nombre;
	private String especie;
	
	// Constructor
	
	public Mascota(ArrayList<String> lista_de_citas, String id_de_la_mascota, String nombre, String especie) {
		this.lista_de_citas = lista_de_citas;
		this.id_de_la_mascota = id_de_la_mascota;
		this.nombre = nombre;
		this.especie = especie;
	}
	
	
	// Methods
	
	public void programarCita(String cita) {
		
	}

	public String listarCitas() {
		return String.format(id_de_la_mascota,nombre,especie);
	}
	
	
	// Setters y Getters
	
	public ArrayList<String> getLista_de_citas() {
		return lista_de_citas;
	}
	public void setLista_de_citas(ArrayList<String> lista_de_citas) {
		this.lista_de_citas = lista_de_citas;
	}
	public String getID_de_la_mascota() {
		return id_de_la_mascota;
	}
	public void setID_de_la_mascota(String id_de_la_mascota) {
		this.id_de_la_mascota = id_de_la_mascota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
}
