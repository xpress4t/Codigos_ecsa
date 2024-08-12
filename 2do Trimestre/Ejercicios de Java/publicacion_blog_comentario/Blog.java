package publicacion_blog_comentario;

import java.util.ArrayList;
import java.util.List;

/* 
  Crear una clase llamada "Blog" que representa un blog en línea.
  Funciones (métodos):
    Constructor: Un constructor que inicializa el blog con un nombre.
    Método "agregarPublicacion": Un método que permite agregar una publicación al blog.
    Método "agregarComentario": Un método que permite a los usuarios agregar comentarios a una publicación.
    Método "buscarPublicacionesPorAutor": Un método que busca publicaciones por el nombre del autor y
     	devuelve una lista de publicaciones.
    Método "obtenerComentariosDePublicacion": Un método que devuelve una lista de comentarios de una
     	publicación específica.
  Atributos:
    Nombre del blog (String).
    Una lista de publicaciones (List<Publicacion>).
 */

public class Blog {
    private String nombre;
    private List<Publicacion> publicaciones;

    public Blog(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void agregarComentario(Publicacion publicacion, Comentario comentario) {
        if (publicaciones.contains(publicacion)) {
            publicacion.agregarComentario(comentario);
        } else {
            System.out.println("La publicación no está en el blog.");
        }
    }

    public List<Publicacion> buscarPublicacionesPorAutor(String autor) {
        List<Publicacion> publicacionesPorAutor = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getAutor().equalsIgnoreCase(autor)) {
                publicacionesPorAutor.add(publicacion);
            }
        }
        return publicacionesPorAutor;
    }

    public List<Comentario> obtenerComentariosDePublicacion(Publicacion publicacion) {
        if (publicaciones.contains(publicacion)) {
            return publicacion.getComentarios();
        } else {
            System.out.println("La publicación no está en el blog.");
            return new ArrayList<>();
        }
    }

    public String getNombre() {
        return nombre;
    }
}

