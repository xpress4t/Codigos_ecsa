package ejercicio_Farmacia;

import ejercicio_Farmacia.Medicamento;

public class Paciente {
	// ATRIBUTOS
	private String nombre;
	private String apellidos;
	private int edad;
	private String sexo;
	private String motivoConsulta;
	private String medicamentoRecetado;
			
	// CONSTRUCTOR
	public Paciente(String nombre, String apellidos, int edad, String sexo, String motivoConsulta, String medicamentoRecetado) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.motivoConsulta = motivoConsulta;
		this.medicamentoRecetado = medicamentoRecetado;
	}
			
	// METODOS
	public void EsMayorDeEdad() {
		Medicamento medicamento_2 = new Medicamento("ss",3,"paad");
		medicamento_2.aumentarEdadRecomendada();
		if(this.edad>=18) {
			System.out.println("Es mayor de edad.");
		}else {
			System.out.println("Es menor de edad");
		}
	}
			
	public void ImprimirDatosGenerales() {
		System.out.println("Nombre y Apellidos del paciente: "+this.getNombre()+" "+this.getApellidos());
		System.out.println("Edad: "+this.getEdad());
		System.out.println("Sexo: "+this.getSexo());
		System.out.println("Motivo de la consulta: "+this.getMotivoConsulta());
		System.out.println("Medicamento recetado: "+this.getMedicamentoRecetado());
	}
			
	public void ComprobarDatos() {
		
	}
			
			
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public String getMedicamentoRecetado() {
		return medicamentoRecetado;
	}

	public void setMedicamentoRecetado(String medicamentoRecetado) {
		this.medicamentoRecetado = medicamentoRecetado;
	}
}
