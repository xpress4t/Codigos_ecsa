import unittest

from library_management import LibraryManagement

class TestLibraryManagement(unittest.TestCase): 

    def setUp(self):
        # Crear una instancia de LibraryManagement para usarla en todas las pruebas
        self.library = LibraryManagement()

    def test_add_book(self):
        # Verificar si el método add_book() agrega un libro correctamente
        self.library.add_book("1984", "George Orwell")
        self.assertIn("1984", self.library.books)

    def test_remove_book(self):
        # Verificar si el método remove_book() elimina un libro correctamente
        self.library.add_book("Brave New World", "Aldous Huxley")
        self.library.remove_book("Brave New World")
        self.assertNotIn("Brave New World", self.library.books)

    def test_find_books_by_author(self):
        # Verificar si el método find_books_by_author() devuelve los libros de un autor dado
        self.library.add_book("Fahrenheit 451", "Ray Bradbury")
        self.library.add_book("The Martian Chronicles", "Ray Bradbury")
        books_by_bradbury = self.library.find_books_by_author("Ray Bradbury")
        self.assertEqual(books_by_bradbury, ["Fahrenheit 451", "The Martian Chronicles"])

if __name__ == '__main__':
    unittest.main()