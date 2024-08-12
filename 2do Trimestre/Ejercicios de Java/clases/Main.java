package clases;

public class Main {

	public static void main(String[] args) {
		Persona persona_1 = new Persona("XXXXX",19,true);
		persona_1.saludar();
		persona_1.cumplirAnios();
		
		Estudiante estudiante_1 = new Estudiante("XXXXXX",22);
		estudiante_1.agregarCalificacion("w", 3);
		
	}
}
