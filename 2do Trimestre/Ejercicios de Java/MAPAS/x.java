package MAPAS;

public enum x {
	AGREGAR(1),BUSCAR(2),ELIMINAR(3);
	
	int valor;
	x(int valor){
		this.valor=valor;
	}
	public int getValor() {
		return valor;
	}
}


enum Contacto {
    JUAN("Juan"), MARIA("Maria"), POL("Pol");

    private String nombre;

    Contacto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}