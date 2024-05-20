import random


# Definición de las direcciones posibles para mover la serpiente
DIRECTIONS = [(0, 1), (0, -1), (1, 0), (-1, 0)]

# Inicialización de la posición de la serpiente en el tablero
snake = [[0, 0], [0, 1], [0, 2], [0, 3]]


def is_valid_position(direction):
    """Verifica si la nueva posición de la cabeza es válida.
    
    Args:
        direction (tuple): Dirección de movimiento de la cabeza.

    Returns:
        bool: True si la posición es válida, False en caso contrario.
        list: Nueva posición de la cabeza de la serpiente.
    """
    new_head = snake[-1].copy()
    new_head[0] += direction[0]
    new_head[1] += direction[1]
    is_within_bounds = 0 <= new_head[0] < 8 and 0 <= new_head[1] < 8
    is_not_self_colliding = new_head not in snake or new_head == snake[0]
    return is_within_bounds and is_not_self_colliding, new_head


def print_board():
    """Imprime el tablero actual con la serpiente."""
    board = [[' ' for _ in range(8)] for _ in range(8)]
    for segment, symbol in zip(snake, '<==' + '0'*(len(snake)-3)):
        board[segment[0]][segment[1]] = symbol
    for row in board:
        print(row)


def move_snake(direction):
    """Mueve la serpiente en la dirección indicada y actualiza el tablero.

    Args:
        direction (tuple): Dirección de movimiento.
    """
    valid, new_head = is_valid_position(direction)
    if valid:
        snake.append(new_head)
        snake.pop(0)
        print_board()
        print()


def main():
    """Función principal para ejecutar el juego."""
    for _ in range(100):
        move_snake(DIRECTIONS[random.randrange(4)])

        
if __name__ == '__main__':
    main()