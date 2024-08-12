package emmanuelCordovaMuñoz_AEA1T1;

public enum DiasSemana {
	/*
	 * Es como una instancia de la clase String
	 * Cada uno tiene su valor propio
	 */
	LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);
	// LUNES (1) se puede asociar a cualquier tipo de dato o sea que puede ser LUNES("1"), 
	// o sea un String un float, double, etc.
	
	int valor;
	DiasSemana(int valor){
		this.valor=valor;
	}
	public int getValor() {
		return valor;
	}
}