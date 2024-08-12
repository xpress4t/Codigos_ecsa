package MAPAS;

import java.util.HashMap;

public class Contador_de_palabras_codigo_gpt {
    public static void main(String[] args) {
        String texto = "1. Las minorías no tienen sitio cuando la mayoría tiene donde apoyarse. 2. Un príncipe nunca carece de razones legítimas para romper sus promesas. 3. Hay tres clases de cerebros: el primero discierne por sí, el segundo entiende lo que los otros disciernen y el tercero no entiende ni discierne lo que los otros disciernen. El primero es excelente, el segundo bueno y el tercero inútil. 4. De los seres humanos en general, se puede decir que son hipócritas y codiciosos. 5. La política no tiene relación con la moral. 6. La experiencia siempre ha demostrado que jamás suceden bien las cosas cuando dependen de muchos.";

        HashMap<String, Integer> frecuenciaPalabras = contarFrecuenciaPalabras(texto);

        // Imprimir la frecuencia de cada palabra
        for (HashMap.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static HashMap<String, Integer> contarFrecuenciaPalabras(String texto) {
        // Eliminar signos de puntuación y convertir todo a minúsculas
        texto = texto.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Dividir el texto en palabras
        String[] palabras = texto.split("\\s+");

        // Contar la frecuencia de cada palabra
        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();
        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }
        return frecuenciaPalabras;
    }
}
