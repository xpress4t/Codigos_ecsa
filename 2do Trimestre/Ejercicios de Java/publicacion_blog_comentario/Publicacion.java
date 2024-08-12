package publicacion_blog_comentario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
  Crear una clase llamada "Publicacion" que representa una publicación en el blog.
  Funciones (métodos):
    Constructor: Un constructor que inicializa la publicación con un título, contenido y autor.
    Método "agregarComentario": Un método que permite agregar un comentario a la publicación.
  Atributos:
    Título de la publicación (String).
    Contenido de la publicación (String).
    Autor de la publicación (String).
    Fecha de publicación (Date).
    Una lista de comentarios (List<Comentario>).
 */

public class Publicacion {
    private String titulo;
    private String contenido;
    private String autor;
    private Date fechaPublicacion;
    private List<Comentario> comentarios;

    public Publicacion(String titulo, String contenido, String autor) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.fechaPublicacion = new Date();
        this.comentarios = new ArrayList<>();
    }

    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
}

