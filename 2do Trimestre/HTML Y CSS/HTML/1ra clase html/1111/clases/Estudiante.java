package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
  Crear una clase llamada "Estudiante" que representa a un estudiante universitario.
  Funciones (métodos):
    Constructor: Un constructor que acepta el nombre y la edad del estudiante y lo inicializa.
    Método "agregarCurso": Un método que permite al estudiante agregar un curso a su lista de cursos inscritos.
    Método "agregarCalificacion": Un método que permite al estudiante agregar una calificación para un curso.
    Método "promedioCalificaciones": Un método que calcula y devuelve el promedio de calificaciones del estudiante.
  Atributos:
    Nombre del estudiante (String).
    Edad del estudiante (int).
    Una lista de cursos inscritos (List<String>).
    Un mapa que almacena las calificaciones de los cursos (Map<String, List<Double>>).
 */

public class Estudiante {
    private String nombre;
    private int edad;
    private List<String> cursosInscritos;
    private Map<String, List<Double>> calificaciones;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursosInscritos = new ArrayList<>();
        this.calificaciones = new HashMap<>();
    }

    public void agregarCurso(String curso) {
        cursosInscritos.add(curso);
        calificaciones.put(curso, new ArrayList<>());
    }

    public void agregarCalificacion(String curso, double calificacion) {
        if (calificaciones.containsKey(curso)) {
            calificaciones.get(curso).add(calificacion);
        } else {
            System.out.println("El estudiante no está inscrito en el curso: " + curso);
        }
    }

    public double promedioCalificaciones() {
        double totalCalificaciones = 0;
        int totalCursos = 0;

        for (List<Double> calificacionesCurso : calificaciones.values()) {
            for (Double calificacion : calificacionesCurso) {
                totalCalificaciones += calificacion;
                totalCursos++;
            }
        }

        if (totalCursos > 0) {
            return totalCalificaciones / totalCursos;
        } else {
            return 0.0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
