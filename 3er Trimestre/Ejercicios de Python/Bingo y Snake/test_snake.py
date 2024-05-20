import unittest
from snake import move_snake, is_valid_position, snake, DIRECTIONS

class TestSnakeGame(unittest.TestCase):
    def test_move_valid(self):
        """Prueba que la serpiente se mueve correctamente cuando el movimiento es válido."""
        initial_length = len(snake)
        move_snake((1, 0))  # Suponiendo que este movimiento es válido en el estado inicial
        self.assertEqual(len(snake), initial_length)  # La longitud debe permanecer igual
        self.assertNotEqual(snake[-1], [0, 3])  # La cabeza de la serpiente debería haberse movido

    def test_move_invalid(self):
        """Prueba que la serpiente no se mueve cuando el movimiento es inválido."""
        initial_position = snake[-1].copy()
        move_snake((0, -1))  # Suponiendo que este movimiento es hacia atrás y no es válido
        self.assertEqual(snake[-1], initial_position)  # La posición de la cabeza no debería cambiar

    def test_is_valid_position(self):
        """Prueba que la validación de posición funciona correctamente."""
        self.assertTrue(is_valid_position((1, 0))[0])  # Mover hacia abajo dentro del tablero es válido
        self.assertFalse(is_valid_position((-1, 0))[0])  # Mover fuera del tablero no es válido


if __name__ == '__main__':
    unittest.main()