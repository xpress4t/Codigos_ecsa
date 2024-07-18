package publicacion_blog_comentario;


public class Main {
    public static void main(String[] args) {
        // Crear un blog
        Blog miBlog = new Blog("Mi Blog de Prueba");

        // Crear algunas publicaciones
        Publicacion publicacion1 = new Publicacion("Título 1", "Contenido de la publicación 1", "Autor1");
        Publicacion publicacion2 = new Publicacion("Título 2", "Contenido de la publicación 2", "Autor2");

        // Agregar las publicaciones al blog
        miBlog.agregarPublicacion(publicacion1);
        miBlog.agregarPublicacion(publicacion2);

        // Crear algunos comentarios
        Comentario comentario1 = new Comentario("Comentario 1 para la publicación 1", "Usuario1");
        Comentario comentario2 = new Comentario("Comentario 2 para la publicación 1", "Usuario2");
        Comentario comentario3 = new Comentario("Comentario 1 para la publicación 2", "Usuario3");

        // Agregar comentarios a las publicaciones
        publicacion1.agregarComentario(comentario1);
        publicacion1.agregarComentario(comentario2);
        publicacion2.agregarComentario(comentario3);

        // Mostrar información de las publicaciones y comentarios
        System.out.println("Publicaciones en el blog '" + miBlog.getNombre() + "':");
        for (Publicacion publicacion : miBlog.buscarPublicacionesPorAutor("Autor1")) {
            System.out.println("- Título: " + publicacion.getTitulo());
            System.out.println("  Autor: " + publicacion.getAutor());
            System.out.println("  Fecha de Publicación: " + publicacion.getFechaPublicacion());
            System.out.println("  Contenido: " + publicacion.getContenido());

            System.out.println("  Comentarios:");
            for (Comentario comentario : miBlog.obtenerComentariosDePublicacion(publicacion)) {
                System.out.println("  - Autor del Comentario: " + comentario.getAutor());
                System.out.println("    Fecha del Comentario: " + comentario.getFechaComentario());
                System.out.println("    Contenido del Comentario: " + comentario.getContenido());
            }
        }
    }
}
