package clases;

/*
 Crear una clase llamada "CuentaBancaria"
	Funciones (métodos):
		Constructor: Un constructor que acepte dos parámetros, el nombre del titular de la cuenta (cadena de caracteres) y el saldo inicial (número decimal), y los utilice para inicializar los atributos de la clase.
		Método "depositar": Un método llamado "depositar" que acepte un monto (número decimal) como parámetro y lo agregue al saldo actual de la cuenta.
		Método "retirar": Un método llamado "retirar" que acepte un monto (número decimal) como parámetro y lo reste al saldo actual de la cuenta, siempre y cuando haya suficiente saldo disponible.
		Métodos getters y setters de todos los atributos
	Atributos:
		Un atributo llamado "titular" de tipo String para almacenar el nombre del titular de la cuenta.
		Un atributo llamado "saldo" de tipo double para almacenar el saldo actual de la cuenta.
 */
public class CuentaBancaria {
	private String titular;
	private double saldo;

	public CuentaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public void depositar(double monto) {
		if (monto > 0) {
			// Es lo mismo que saldo += mono;
			this.saldo += monto;
		} else {
			System.out.println("Error: El monto debe ser mayor que cero.");
		}
	}

	public void retirar(double monto) {
		if (monto > 0 && monto <= saldo) {
			this.saldo -= monto;
		} else {
			System.out.println("Error: Monto no válido o saldo insuficiente.");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public String setTitular() {
		return titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
