import pygame
import random

# Inicialización de Pygame
pygame.init()

# Dimensiones de la pantalla
SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600

# Colores
WHITE = (255, 255, 255)
GREEN = (0, 255, 0)
RED = (255, 0, 0)

# Tamaño del bloque y velocidad
BLOCK_SIZE = 20
SPEED = 15

# Crear la pantalla
screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
pygame.display.set_caption('Snake Game')

clock = pygame.time.Clock()

# Función para dibujar la serpiente
def draw_snake(snake_list):
    for x in snake_list:
        pygame.draw.rect(screen, GREEN, [x[0], x[1], BLOCK_SIZE, BLOCK_SIZE])

# Función principal del juego
def game():
    game_over = False
    game_close = False

    # Posición inicial de la serpiente
    x = SCREEN_WIDTH // 2
    y = SCREEN_HEIGHT // 2

    # Velocidad inicial
    x_speed = 0
    y_speed = 0

    # Lista para almacenar el cuerpo de la serpiente
    snake_list = []
    snake_length = 1

    # Posición inicial de la comida
    food_x = round(random.randrange(0, SCREEN_WIDTH - BLOCK_SIZE) / BLOCK_SIZE) * BLOCK_SIZE
    food_y = round(random.randrange(0, SCREEN_HEIGHT - BLOCK_SIZE) / BLOCK_SIZE) * BLOCK_SIZE

    while not game_over:

        while game_close:
            screen.fill(WHITE)
            font_style = pygame.font.SysFont(None, 50)
            message = font_style.render("You Lost! Press Q-Quit or C-Play Again", True, RED)
            screen.blit(message, [SCREEN_WIDTH / 6, SCREEN_HEIGHT / 3])
            pygame.display.update()

            for event in pygame.event.get():
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_q:
                        game_over = True
                        game_close = False
                    if event.key == pygame.K_c:
                        game()

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                game_over = True
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_LEFT:
                    x_speed = -BLOCK_SIZE
                    y_speed = 0
                elif event.key == pygame.K_RIGHT:
                    x_speed = BLOCK_SIZE
                    y_speed = 0
                elif event.key == pygame.K_UP:
                    y_speed = -BLOCK_SIZE
                    x_speed = 0
                elif event.key == pygame.K_DOWN:
                    y_speed = BLOCK_SIZE
                    x_speed = 0

        if x >= SCREEN_WIDTH or x < 0 or y >= SCREEN_HEIGHT or y < 0:
            game_close = True
        x += x_speed
        y += y_speed
        screen.fill(WHITE)
        pygame.draw.rect(screen, RED, [food_x, food_y, BLOCK_SIZE, BLOCK_SIZE])
        snake_head = []
        snake_head.append(x)
        snake_head.append(y)
        snake_list.append(snake_head)
        if len(snake_list) > snake_length:
            del snake_list[0]

        for each_segment in snake_list[:-1]:
            if each_segment == snake_head:
                game_close = True

        draw_snake(snake_list)

        pygame.display.update()

        if x == food_x and y == food_y:
            food_x = round(random.randrange(0, SCREEN_WIDTH - BLOCK_SIZE) / BLOCK_SIZE) * BLOCK_SIZE
            food_y = round(random.randrange(0, SCREEN_HEIGHT - BLOCK_SIZE) / BLOCK_SIZE) * BLOCK_SIZE
            snake_length += 1

        clock.tick(SPEED)

    pygame.quit()
    quit()

game()
