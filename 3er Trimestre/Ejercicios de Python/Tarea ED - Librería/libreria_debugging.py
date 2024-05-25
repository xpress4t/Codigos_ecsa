import json


class Libreria:
    """Clase para gestionar una colección de libros en una librería virtual."""

    def __init__(self):
        """Inicializa la colección de libros como una lista vacía."""
        self.libros = []

    def anadir_libro(self, titulo, autor, genero, anio):
        """
        Añade un libro a la colección.

        Args:
            titulo (str): El título del libro.
            autor (str): El autor del libro.
            genero (str): El género del libro.
            anio (int): El año de publicación del libro.

        Returns:
            str: Mensaje de confirmación.
        """
        self.libros.append({'titulo': titulo, 'autor': autor, 'genero': genero, 'anio': anio})
        return "Libro añadido"

    def buscar_libro(self, titulo):
        """
        Busca libros por título.

        Args:
            titulo (str): El título del libro a buscar.

        Returns:
            list: Lista de libros que coinciden con el título.
        """
        return [libro for libro in self.libros if libro['titulo'].lower() == titulo.lower()]

    def buscar_por_autor(self, autor):
        """
        Busca libros por autor.

        Args:
            autor (str): El autor del libro a buscar.

        Returns:
            list: Lista de libros que coinciden con el autor.
        """
        return [libro for libro in self.libros if autor.lower() in libro['autor'].lower()]

    def eliminar_libro(self, titulo):
        """
        Elimina un libro por título.

        Args:
            titulo (str): El título del libro a eliminar.

        Returns:
            str: Mensaje indicando si el libro fue eliminado o no encontrado.
        """
        original_count = len(self.libros)
        self.libros = [libro for libro in self.libros if libro['titulo'].lower() != titulo.lower()]
        return "Libro eliminado" if len(self.libros) < original_count else "Libro no encontrado"

    def guardar_libros(self, archivo):
        """
        Guarda la colección de libros en un archivo JSON.

        Args:
            archivo (str): El nombre del archivo donde se guardará la colección.

        Returns:
            str: Mensaje de confirmación.
        """
        with open(archivo, 'w') as f:
            json.dump(self.libros, f)
        return "Libros guardados"

    def cargar_libros(self, archivo):
        """
        Carga la colección de libros desde un archivo JSON.

        Args:
            archivo (str): El nombre del archivo desde donde se cargará la colección.

        Returns:
            str: Mensaje indicando si los libros fueron cargados o si el archivo no fue encontrado.
        """
        try:
            with open(archivo, 'r') as f:
                self.libros = json.load(f)
            return "Libros cargados"
        except FileNotFoundError:
            return "Archivo no encontrado"


if __name__ == "__main__":
    mi_libreria = Libreria()
    mi_libreria.anadir_libro("Cien años de soledad", "Gabriel García Márquez", "Novela", 1967)
    mi_libreria.guardar_libros('libreria.json')
    print(mi_libreria.cargar_libros('libreria.json'))
    print(mi_libreria.buscar_por_autor("Gabriel García Márquez"))
