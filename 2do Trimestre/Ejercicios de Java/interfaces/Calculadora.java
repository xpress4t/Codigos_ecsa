package interfaces;


/* 
  Crear una interfaz llamada "Calculadora" que define métodos para operaciones matemáticas comunes.
  Funciones (métodos):
    Método "sumar": Realiza una suma entre dos números.
    Método "restar": Realiza una resta entre dos números.
    Método "multiplicar": Realiza una multiplicación entre dos números.
    Método "dividir": Realiza una división entre dos números.
 */
public interface Calculadora {
    /**
     * Realiza una suma entre dos números.
     */
    double sumar(double num1, double num2);

    /**
     * Realiza una resta entre dos números.
     */
    double restar(double num1, double num2);

    /**
     * Realiza una multiplicación entre dos números.
     */
    double multiplicar(double num1, double num2);

    /**
     * Realiza una división entre dos números.
     */
    double dividir(double num1, double num2);
}

