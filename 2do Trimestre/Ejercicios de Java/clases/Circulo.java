package clases;

/* 
 Crear una clase llamada "Círculo"
	Funciones (métodos):
		Constructor: Un constructor que acepte un parámetro, el radio (número decimal), y lo utilice para inicializar el atributo de la clase.
		Método "calcularÁrea": Un método llamado "calcularÁrea" que no tome ningún parámetro y devuelva el área del círculo (π * radio * radio).
		Método "calcularPerímetro": Un método llamado "calcularPerímetro" que no tome ningún parámetro y devuelva el perímetro del círculo (2 * π * radio).
		Métodos getters y setters de todos los atributos
	Atributos:
		Un atributo llamado "radio" de tipo double para almacenar el radio del círculo. 
  
  */
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularÁrea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerímetro() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio=radio;
    }
}
