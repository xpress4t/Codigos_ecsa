package codigo;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        // Crear un HashMap
        HashMap<String, Integer> diccionario = new HashMap<>();

        // Agregar elementos
        diccionario.put("Manzana", 10);
        diccionario.put("Banana", 5);
        diccionario.put("Uva", 8);

        // Acceder a un elemento por clave
        System.out.println("Cantidad de manzanas: " + diccionario.get("Manzana"));

        // Iterar sobre los elementos
        for (Map.Entry<String, Integer> entry : diccionario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
