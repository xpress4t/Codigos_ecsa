package clases;

/* 
  Crear una clase llamada "Calculadora"
	Funciones (métodos):
		Constructor vacío: Un constructor sin parámetros que inicialice la calculadora con un valor inicial de 0.
		Método "sumar": Un método llamado "sumar" que acepte un número como parámetro y lo sume al valor actual de la calculadora.
		Método "restar": Un método llamado "restar" que acepte un número como parámetro y lo reste al valor actual de la calculadora.
		Método "multiplicar": Un método llamado "multiplicar" que acepte un número como parámetro y lo multiplique por el valor actual de la calculadora.
		Método "dividir": Un método llamado "dividir" que acepte un número como parámetro y lo divida por el valor actual de la calculadora.
		Métodos getters y setters de todos los atributos(¿en este ejercicio habría que dejar cambiar el resultado con su función get?)
	Atributos:
		Un atributo llamado "resultado" de tipo double para almacenar el valor actual de la calculadora.
 */
public class Calculadora {
    private double resultado;

    public Calculadora() {
        this.resultado = 0.0;
    }

    public void sumar(double numero) {
        resultado += numero;
    }

    public void restar(double numero) {
        resultado -= numero;
    }

    public void multiplicar(double numero) {
        resultado *= numero;
    }

    public void dividir(double numero) {
        if (numero != 0) {
            resultado /= numero;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

    public double getResultado() {
        return resultado;
    }
}
