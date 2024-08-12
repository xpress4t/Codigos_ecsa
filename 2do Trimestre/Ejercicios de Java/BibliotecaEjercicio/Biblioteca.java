package BibliotecaEjercicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Biblioteca implements BiblioetcaInterface{
	private List<RecursoBiblioteca> listaRecursos;
	private List<Usuario> listaUsuarios;
	private HashMap<String,List<String>> historialReservas;
	
	public Biblioteca() {
		this.listaRecursos = new ArrayList<RecursoBiblioteca>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.historialReservas = new HashMap<String,List<String>>();
	}
	
	@Override
	public void añadirRecurso(RecursoBiblioteca recurso) {
		listaRecursos.add(recurso);
		historialReservas.put(recurso.getId(), new ArrayList<String>());
	}
	@Override
	public void añadirUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
	public void verHistorial() {
		System.out.println(historialReservas);
	}
	
	public void buscarPorTema(String tema) {
		List<Revista> liaux = new ArrayList<Revista>();
		for(RecursoBiblioteca rec: listaRecursos) {
			if(rec instanceof BibliotecaEjercicio.Revista) {
				liaux.add((Revista)rec);
			}
		}
		for(Revista rev: liaux) {
			if(rev.getTema().equalsIgnoreCase(tema)) {
				System.out.println(rev.titulo);
			}
		}
	}
	
	public void buscarPorAutor(String autor) {
		List<Libro> liaux = new ArrayList<Libro>();
		for(RecursoBiblioteca rec: listaRecursos) {
			if(rec instanceof BibliotecaEjercicio.Libro) {
				liaux.add((Libro)rec);
			}
		}
		for(Libro lib: liaux) {
			if(lib.getAutor().equalsIgnoreCase(autor)) {
				System.out.println(lib.titulo);
			}
		}
	}
	
	public List<RecursoBiblioteca> getListaRecursos() {
		return listaRecursos;
	}

	public void setListaRecursos(List<RecursoBiblioteca> listaRecursos) {
		this.listaRecursos = listaRecursos;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public HashMap<String, List<String>> getHistorialReservas() {
		return historialReservas;
	}

	public void setHistorialReservas(HashMap<String, List<String>> historialReservas) {
		this.historialReservas = historialReservas;
	}
	
	
}
