import random


def generar_carton():
    """
    Genera un cartón de Bingo con números aleatorios.

    Genera un cartón para el juego de Bingo, el cual consiste en una lista de 18 números
    aleatorios distribuidos en 9 rangos de 10 números (1-10, 11-20, ..., 81-90). Cada rango
    contribuye con 2 números al cartón, y el último rango (81-90) incluye el número 90.

    Returns:
        list of int: Lista de 18 números enteros ordenados que representan un cartón de Bingo.
    """
    carton = []
    for rango_inicio in range(1, 82, 10):
        rango_fin = rango_inicio + 9
        if rango_inicio == 81:  # Ajuste para el último rango
            rango_fin = 90
        carton.extend(random.sample(range(rango_inicio, rango_fin + 1), 2))
    carton.sort()
    return carton


def generar_jugadores():
    """
    Genera un diccionario de jugadores con sus cartones de Bingo.

    Cada jugador se asigna una cantidad específica de cartones de Bingo. Por defecto,
    crea tres jugadores: el primero con 3 cartones, el segundo con 2 cartones y el tercero con 1 cartón.

    Returns:
        dict: Diccionario donde cada clave es un string 'Jugador{i}' y el valor es una lista de cartones de Bingo.
    """
    jugadores = {
        'Jugador1': [generar_carton() for _ in range(3)],
        'Jugador2': [generar_carton() for _ in range(2)],
        'Jugador3': [generar_carton()]
    }
    return jugadores


def numero_aleatorio_generator():
    """
    Genera números aleatorios entre 1 y 90 sin repetir.

    Crea una lista de números del 1 al 90, los mezcla aleatoriamente y luego los devuelve
    uno a uno. Este generador es útil para simular la extracción de bolas en un juego de Bingo,
    asegurando que cada número se extraiga exactamente una vez.

    Yields:
        int: El próximo número aleatorio en la secuencia.
    """
    numeros = list(range(1, 91))  # Crea una lista de números del 1 al 90
    random.shuffle(numeros)       # Mezcla la lista de manera aleatoria
    for numero in numeros:
        yield numero              # Devuelve los números uno a uno


def buscar_ganador(jugadores, numeros_salidos):
    """
    Busca un ganador en el juego de Bingo verificando si algún cartón contiene todos los números que han salido.

    Itera sobre cada jugador y sus respectivos cartones para verificar si contienen todos los números
    que han sido anunciados hasta el momento. Retorna el jugador y el cartón ganador si se encuentra uno.

    Args:
        jugadores (dict): Un diccionario con claves de tipo str representando los nombres de los jugadores y
                          valores de tipo list, donde cada lista contiene cartones (listas de números enteros).
        numeros_salidos (set): Un conjunto de números enteros que representan los números que han sido anunciados.

    Returns:
        tuple: Una tupla conteniendo el nombre del jugador y el cartón ganador si se encuentra un ganador,
               (None, None) si no hay ganador.
    """
    for jugador, cartones in jugadores.items():
        for carton in cartones:
            if all(n in numeros_salidos for n in carton):
                return jugador, carton
    return None, None


def posiciones_ganadoras(carton_ganador, numeros_salidos):
    """
    Determina las posiciones de los números de un cartón ganador en la secuencia de números anunciados.

    Calcula las posiciones de cada número del cartón ganador dentro de la lista de números que han salido,
    devolviendo estas posiciones como una lista de enteros.

    Args:
        carton_ganador (list of int): Lista de números enteros que representan un cartón de Bingo ganador.
        numeros_salidos (list of int): Lista de números enteros que han sido anunciados durante el juego.

    Returns:
        list of int: Lista de posiciones de cada número en el cartón ganador respecto a los números anunciados.

    Raises:
        ValueError: Si algún número del cartón ganador no ha sido anunciado aún.
    """
    for n in carton_ganador:
        if n not in numeros_salidos:
            raise ValueError(f"El número {n} del cartón ganador no se encuentra en los números anunciados.")
    return [numeros_salidos.index(n) + 1 for n in carton_ganador]


def main():
    # Iniciar juego
    jugadores = generar_jugadores()
    numeros_salidos = []
    generador_numeros = numero_aleatorio_generator()

    # Bucle del juego
    ganador, carton_ganador = None, None
    while not ganador:
        numero = next(generador_numeros)
        numeros_salidos.append(numero)
        ganador, carton_ganador = buscar_ganador(jugadores, numeros_salidos)

    # Resultados
    posiciones = posiciones_ganadoras(carton_ganador, numeros_salidos)
    formato_posiciones = ','.join(str(pos) for pos in posiciones)

    # Mostrar resultados
    for jugador, cartones in jugadores.items():
        for idx, carton in enumerate(cartones):
            print(f'El jugador: {jugador} tiene los siguientes números: {carton}')
        print('-------------------------')

    # Esto imprimirá los resultados en consola. Para el código final se pueden ajustar detalles según sea necesario.
    print(f'El jugador: {ganador} ha ganado con el cartón {carton_ganador}')
    print(f'Han salido {len(numeros_salidos)} números y han sido {numeros_salidos}')
    print(f'Los números ganadores han salido en las siguientes posiciones: {formato_posiciones}')
    

if __name__ == '__main__':
    main()