package Aplicacion_de_reservas_para_cine;

import java.util.ArrayList;
import java.util.List;

public class Película {
	private String titulo;
	private String genero;
	private String duracion;
	private List<String> horariosDisponibles;
	
	public Película(String titulo, String genero, String duracion, List<String> horariosDisponibles) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.horariosDisponibles = new ArrayList<>();
	}
	
	
}
