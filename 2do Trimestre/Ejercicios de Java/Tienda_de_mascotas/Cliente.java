package Tienda_de_mascotas;

import java.util.ArrayList;

class Cliente {
	
	private ArrayList<String> lista_de_mascotas;
	private String id_del_cliente;
	private String nombre;
	
	
	// Constructor 
	
	public Cliente(ArrayList<String> lista_de_mascotas, String id_del_cliente, String nombre) {
		this.lista_de_mascotas = new ArrayList<>();
		this.id_del_cliente = id_del_cliente;
		this.nombre = nombre;
	}
	
	// Methods
	public void añadirMascota(Mascota mascota) {
		this.lista_de_mascotas.add(id_del_cliente);
	}
	
	public String listarMascotas() {
		return String.format(id_del_cliente,nombre);
	}
	
	
	// Getters and setters
	public ArrayList<String> getLista_de_mascotas() {
		return lista_de_mascotas;
	}

	public void setLista_de_mascotas(ArrayList<String> lista_de_mascotas) {
		this.lista_de_mascotas = lista_de_mascotas;
	}

	public String getID_del_cliente() {
		return id_del_cliente;
	}

	public void setID_del_cliente(String id_del_cliente) {
		this.id_del_cliente = id_del_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
