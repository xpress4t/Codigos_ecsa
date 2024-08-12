package Gestion_de_tareas;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeDesarrollo {
	private List<Tarea> tareas;
	private List<Usuario> miembros;
	private List<String> estado;
	
	public EquipoDeDesarrollo() {
		this.tareas = new ArrayList<>();
		this.miembros = new ArrayList<>();
		this.estado = new ArrayList<>();
		
		estado.add("Pendiente");
		estado.add("En progreso");
		estado.add("Completada");
	}
	
	
	
	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public List<Usuario> getMiembros() {
		return miembros;
	}

	public void setMiembros(List<Usuario> miembros) {
		this.miembros = miembros;
	}

	public List<String> getEstado() {
		return estado;
	}

	public void setEstado(List<String> estado) {
		this.estado = estado;
	}
	
}
