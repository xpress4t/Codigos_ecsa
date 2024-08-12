package ejercicio_Farmacia;

import java.util.Scanner;

import ejercicio_Farmacia.Medicamento;
import ejercicio_Farmacia.Paciente;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Paciente paciente_1 = new Paciente("Tobías","Claren Green",23,"Masculino","Examen médico general","Paracetamol");
		Medicamento medicamento_1 = new Medicamento("sexo",69,"sexo");
		
		medicamento_1.aumentarEdadRecomendada();
		paciente_1.EsMayorDeEdad();
		paciente_1.ImprimirDatosGenerales();
	}

}
