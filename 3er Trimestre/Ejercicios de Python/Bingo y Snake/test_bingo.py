import unittest
from bingo import generar_carton, generar_jugadores, numero_aleatorio_generator, buscar_ganador, posiciones_ganadoras


# Dos líneas en blanco después de las importaciones
class TestBingo(unittest.TestCase):
    # Una línea en blanco entre métodos de una clase
    def test_generar_carton(self):
        """Prueba que generar_carton retorna una lista de 18 números únicos y válidos."""
        carton = generar_carton()
        self.assertEqual(len(carton), 18)
        self.assertEqual(len(set(carton)), 18)
        self.assertTrue(all(1 <= n <= 90 for n in carton))
        self.assertTrue(all(carton[i] <= carton[i+1] for i in range(len(carton)-1)))

    def test_generar_jugadores(self):
        """Prueba que generar_jugadores crea el diccionario de jugadores correctamente."""
        jugadores = generar_jugadores()
        self.assertEqual(len(jugadores), 3)
        self.assertEqual(len(jugadores['Jugador1']), 3)
        self.assertEqual(len(jugadores['Jugador2']), 2)
        self.assertEqual(len(jugadores['Jugador3']), 1)

    def test_numero_aleatorio_generator(self):
        """Prueba que el generador produce todos los números del 1 al 90 sin repetir."""
        generador = numero_aleatorio_generator()
        numeros = list(generador)
        self.assertEqual(len(numeros), 90)
        self.assertEqual(set(numeros), set(range(1, 91)))

    def test_buscar_ganador(self):
        """Prueba que buscar_ganador identifica correctamente un ganador."""
        jugadores = {'Jugador1': [[1, 2, 3]], 'Jugador2': [[4, 5, 6]], 'Jugador3': [[7, 8, 9]]}
        numeros_salidos = [1, 2, 3]
        ganador, carton_ganador = buscar_ganador(jugadores, set(numeros_salidos))
        self.assertEqual(ganador, 'Jugador1')
        self.assertEqual(carton_ganador, [1, 2, 3])

    def test_posiciones_ganadoras(self):
        """Prueba que posiciones_ganadoras retorna las posiciones correctas."""
        carton_ganador = [20, 55, 70]
        numeros_salidos = [5, 20, 25, 30, 55, 60, 65, 70, 75]
        posiciones = posiciones_ganadoras(carton_ganador, numeros_salidos)
        self.assertEqual(posiciones, [2, 5, 8])


# Dos líneas en blanco después de cerrar la clase
if __name__ == '__main__':
    unittest.main()
