public class huevadas {
    public static void main(String[] args) {
        try {
            int resultado = dividir(5, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return numerador / denominador;
    }
}