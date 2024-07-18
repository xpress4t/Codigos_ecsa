public class aaasasas {
    public static void main(String[] args) {
        String cadena = "()[]{}<>¡!¿?ºª·&^*¨Ç;'.,:_|@\\#~¬€$-+*/%=";

        // Crear un objeto Random
        java.util.Random random = new java.util.Random();

        // Obtener tres elementos aleatorios
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(cadena.length());
            char elemento = cadena.charAt(index);
            System.out.print(elemento);
        }
    }
}
