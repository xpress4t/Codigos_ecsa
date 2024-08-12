package Jugador;

public class Habilidad {
	private String nombre;
	private String descripcion;
	private int costeMana;
	private int puntos;// Se usará para curar/hacer daño/ reducir daño
	private TipoHabilidad tipoHabilidad;

	
	public Habilidad(String nombre, String descripcion, int costeMana, int puntos,TipoHabilidad tipoHabilidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costeMana = costeMana;
		this.puntos = puntos;
		this.tipoHabilidad=tipoHabilidad;
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

	public int getCosteMana() {
		return costeMana;
	}

	public void setCosteMana(int costeMana) {
		this.costeMana = costeMana;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public TipoHabilidad getTipoHabilidad() {
		return tipoHabilidad;
	}

	

}
