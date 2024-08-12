package MAPAS;

import java.util.HashMap;
import java.util.Map;

public class Registro_de_calificaciones {
    public static void main(String[] args) {
        // HashMap bidimensional para almacenar calificaciones de estudiantes
    	
        Map<String, Map<String, Integer>> registroCalificaciones = new HashMap<>();

        // Agregar calificaciones
        
        agregarCalificacion(registroCalificaciones, "Alice", "Matemáticas", 90);
        agregarCalificacion(registroCalificaciones, "Bob", "Inglés", 85);
        agregarCalificacion(registroCalificaciones, "Alice", "Historia", 95);
        agregarCalificacion(registroCalificaciones, "Bob", "Matemáticas", 88);

        // Imprimir calificaciones
        imprimirCalificaciones(registroCalificaciones, "Alice");
        imprimirCalificaciones(registroCalificaciones, "Bob");
    }

    // Método para agregar calificación al registro
    
    private static void agregarCalificacion(Map<String, Map<String, Integer>> registro, String estudiante, String asignatura, int calificacion) {
        registro.putIfAbsent(estudiante, new HashMap<>());
        registro.get(estudiante).put(asignatura, calificacion);
    }

    // Método para imprimir las calificaciones de un estudiante
    
    private static void imprimirCalificaciones(Map<String, Map<String, Integer>> registro, String estudiante) {
        if (registro.containsKey(estudiante)) {
            System.out.println("Calificaciones de " + estudiante + ": " + registro.get(estudiante));
        } else {
            System.out.println("No hay calificaciones registradas para " + estudiante);
        }
    }
}
