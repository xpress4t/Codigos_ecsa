package implementaciones;

import interfaces.Calculadora;

public class CalculadoraCientifica implements Calculadora {
    @Override
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // NaN representa "No es un número"
        }
    }

    // Funciones adicionales de una calculadora científica
    public double raizCuadrada(double numero) {
        if (numero >= 0) {
            return Math.sqrt(numero);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
