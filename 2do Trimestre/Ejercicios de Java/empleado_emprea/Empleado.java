package empleado_emprea;

/*
Crear una clase llamada "Empleado"
		Métodos getters y setters de todos los atributos que lo necesiten
*
*/
public class Empleado {
	
	//ATRIBUTOS PRIVADOS 
	private String nombre; // Para almacenar el nombre del cliente.
	private String apellido; // Para almacenar el apellido del cliente.
	private int edad; // Para almacenar la edad.
	private double salario; // Para señalar el salario actual del empleado
	private String email; // Para almacenar la dirección de correo electrónico del cliente.
	private String telefono; // Para almacenar el número de teléfono del cliente.
	private String direccion; // Para almacenar la dirección postal del cliente.
	
	// CONSTRUCTOR
	public Empleado(String nombre,String apellido,int edad,double salario,String email,String telefono,String direccion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.salario=salario;
		this.email=email;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	
	// Método que permitee al cliente enviar un correo con un mensaje especificado
	public void enviarCorreo(String mensaje) {
		System.out.println("El mensaje enviado al email "+email+"será: "+mensaje);
	}
	
	// Método que permite al cliente realizar una llamada telefónica al número de destino especificado.
	public void realizarLlamada(String numeroDestino) {
		System.out.println("Realizar llamada desde el número "+telefono+" al número: "+numeroDestino);
	}
	// Método que muestre la información completa del cliente, incluyendo todos los atributos
	public void mostrarInformacion() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido");
	}
	
	// Método para el caso de que se quiera aumentar el salario en un porcentaje concreto
	// En caso de que el porcentaje sea negativo mostrar un mensaje de error
	public void aumentarSalario(double porcentaje) {
		
	}
	
	
	// GETS Y SETS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
