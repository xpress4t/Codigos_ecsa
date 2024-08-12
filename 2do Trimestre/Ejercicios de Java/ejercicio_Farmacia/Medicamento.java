package ejercicio_Farmacia;

public class Medicamento {
	// ATRIBUTOS
	private String nombre;
	private int edad;
	private String descripcion;
	
	// CONSTRUCTOR
	public Medicamento(String nombre,int edad,String descripcion){
		this.nombre=nombre;
		this.edad=edad;
		this.descripcion=descripcion;
	}
	
	// GETTERS Y SETTERS 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// METODO
	public int aumentarEdadRecomendada() {
		switch(this.edad) {
			case 3:
				this.edad=7;
				break;
			case 7:
				this.edad=12;
				break;
			case 12:
				this.edad=16;
				break;
			case 16:
				this.edad=18;
				break;
			case 18:
				System.out.println("¡ERROR!");
				break;
			default:
				System.out.println("¡ERROR!");
		}
		return this.edad;
	}
}
