import numpy as np
import matplotlib.pyplot as plt

# Definir las ecuaciones del sistema de Lotka-Volterra
def lotka_volterra(x, y, a, b, c, d):
    dx = a * x - b * x * y
    dy = -c * y + d * x * y
    return dx, dy

# Definir parámetros y condiciones iniciales
a, b, c, d = 1.0, 0.1, 1.5, 0.75  # parámetros
x0, y0 = 10, 5  # condiciones iniciales

# Definir el rango de tiempo y el paso de tiempo
t = np.linspace(0, 15, 1000)
dt = t[1] - t[0]

# Solución numérica del sistema
x = np.zeros_like(t)
y = np.zeros_like(t)
x[0], y[0] = x0, y0
for i in range(1, len(t)):
    dx, dy = lotka_volterra(x[i-1], y[i-1], a, b, c, d)
    x[i] = x[i-1] + dx * dt
    y[i] = y[i-1] + dy * dt

# Graficar las trayectorias
plt.plot(x, y, label='Trayectoria 1')

# Cambiar condiciones iniciales para graficar otra trayectoria
x0, y0 = 12, 4
x = np.zeros_like(t)
y = np.zeros_like(t)
x[0], y[0] = x0, y0
for i in range(1, len(t)):
    dx, dy = lotka_volterra(x[i-1], y[i-1], a, b, c, d)
    x[i] = x[i-1] + dx * dt
    y[i] = y[i-1] + dy * dt

plt.plot(x, y, label='Trayectoria 2')

# Agregar etiquetas y leyenda
plt.xlabel('Población de presas')
plt.ylabel('Población de depredadores')
plt.legend()
plt.title('Modelo de Lotka-Volterra')

# Mostrar el gráfico
plt.grid(True)
plt.show()