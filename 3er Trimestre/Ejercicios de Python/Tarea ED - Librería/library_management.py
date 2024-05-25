class LibraryManagement:
    
    def __init__(self):
        # Diccionario donde se almacenan los libros con el título como clave y el autor como valor
        self.books = {}
        
    # Este método agrega un libro si es que no está presente.
    def add_book(self, title, author):
        if title in self.books:
            print(f"El libro '{title}' ya se encuentra en la biblioteca.")
        else:
            self.books[title] = author
            print(f"\nEl libro '{title}' de {author} se acaba de agregar a la biblioteca.")

    # Este método elimina un libro de la biblioteca si existe.
    def remove_book(self, title):
        if title in self.books:
            del self.books[title]
            print(f"El libro '{title}' acaba de ser eliminado de la biblioteca.")
        else:
            print(f"El libro '{title}' no se encuentra en la biblioteca.")

    # Este método busca libros de un autor dado y devuelve una lista de títulos de libros
    def find_books_by_author(self, author):
        books_by_author = []
        for title, auth in self.books.items():
            if auth == author:
                books_by_author.append(title)
        return books_by_author

    def test_add_existing_book(self):
        # Probar agregar un libro que ya está en la biblioteca
        self.library.add_book("1984", "George Orwell")
        # Intentar agregar el mismo libro otra vez
        self.library.add_book("1984", "George Orwell")  
        # La longitud del diccionario debe ser 1
        self.assertEqual(len(self.library.books), 1)  
        
    def test_remove_nonexistent_book(self):
        # Probar eliminar un libro que no está en la biblioteca
        self.library.remove_book("Este libro no existe")
        # La biblioteca no debe cambiar
        self.assertEqual(len(self.library.books), 0)  

    def test_find_books_by_nonexistent_author(self):
        # Probar buscar libros de un autor que no tiene libros en la biblioteca
        books_by_nonexistent_author = self.library.find_books_by_author("Este autor no existe")
        self.assertEqual(books_by_nonexistent_author, [])

    def test_add_book_with_empty_title(self):
        # Probar agregar un libro con un título vacío
        self.library.add_book("", "Author")
        # El libro con título vacío no debe ser agregado
        self.assertNotIn("", self.library.books)  

    def test_add_book_with_empty_author(self):
        # Probar agregar un libro con un autor vacío
        self.library.add_book("Book Title", "")
        # El libro con autor vacío no debe ser agregado
        self.assertNotIn("Book Title", self.library.books)  
