package barcosHundidos;
public class Barco {
    private int fila;
    private int columna;
    private boolean hundido;

    public Barco(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.hundido = false;
    }

    // Método para verificar si un barco está en una posición dada
    public boolean estaEnPosicion(int fila, int columna) {
        return this.fila == fila && this.columna == columna;
    }

    // Método para marcar un barco como hundido
    public void marcarComoHundido() {
        this.hundido = true;
    }

    // Método para verificar si un barco está hundido
    public boolean estaHundido() {
        return this.hundido;
    }

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public boolean isHundido() {
		return hundido;
	}

	public void setHundido(boolean hundido) {
		this.hundido = hundido;
	}
    
}
