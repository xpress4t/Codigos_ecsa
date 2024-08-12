package emmanuelCordovaMuñoz_AEA1T1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRUEBAS_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> lista_de_numeros = new ArrayList<>();
        Bucle(scan, lista_de_numeros);
    }

    public static void Bucle(Scanner scan, List<Integer> lista_de_numeros) {
        int opcion;
        do {
            Menu();
            opcion = OpcionElegida(scan);
            if (opcion == 1) {
                AgregarNumero(scan, lista_de_numeros);
            } else if (opcion == 2) {
                MostrarLista(scan, lista_de_numeros);
            } else if (opcion == 3) {
                RealizarOperaciones(lista_de_numeros);
            } else if (opcion == 4) {
                System.out.println("\nAdiós");
            }
        } while (opcion != 4);
        scan.close();
    }

    public static int OpcionElegida(Scanner scan) {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            scan.nextLine();
            return 0;
        }
    }

    public static void Menu() {
        System.out.println("\n\t\tCaculadora Básica\n");
        System.out.println("1.- Agregar un número a la lista.");
        System.out.println("2.- Mostrar números de la lista.");
        System.out.println("3.- Calcular operaciones matemáticas de los números de la lista.");
        System.out.println("4.- Salir.");
        System.out.print("\nSeleccione la opción que desea ejecutar: ");
        System.out.print("");
    }

    public static void AgregarNumero(Scanner scan, List<Integer> lista_de_numeros) {
        System.out.print("Ingrese un número entero para agregarlo a la lista de números: ");
        int numero = scan.nextInt();
        lista_de_numeros.add(numero);
        System.out.println("Acaba de ingresar el número " + numero);
    }

    public static void MostrarLista(Scanner scan, List<Integer> lista_de_numeros) {
        if (lista_de_numeros.isEmpty()) {
            System.out.println("No hay ningún número en la lista.");
            AgregarNumero(scan, lista_de_numeros);
        } else {
            System.out.println("\nLa lista de números es:\n");
            for (int i = 0; i < lista_de_numeros.size(); i++) {
                System.out.println("\t(" + (i + 1) + ") --> " + lista_de_numeros.get(i));
            }
        }
    }

    public static void RealizarOperaciones(List<Integer> lista_de_numeros) {
        if (lista_de_numeros.isEmpty()) {
            System.out.println("No hay números en la lista para realizar operaciones.");
            return;
        }

        System.out.println("Seleccione la operación a realizar:");
        for (Operacion operacion : Operacion.values()) {
            System.out.println((operacion.ordinal() + 1) + ". " + operacion);
        }

        Scanner scan = new Scanner(System.in);
        int opcionOperacion = scan.nextInt();
        scan.close();

        switch (Operacion.values()[opcionOperacion - 1]) {
            case SUMA:
                RealizarSuma(lista_de_numeros);
                break;
            case RESTA:
                RealizarResta(lista_de_numeros);
                break;
            case MULTIPLICACION:
                RealizarMultiplicacion(lista_de_numeros);
                break;
            case DIVISION:
                RealizarDivision(lista_de_numeros);
                break;
            case POTENCIA:
                RealizarPotencia(lista_de_numeros);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void RealizarSuma(List<Integer> lista_de_numeros) {
        System.out.println("\nRealizando la suma de los números en la lista.");
        int suma = lista_de_numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println();
    }

    public static void RealizarResta(List<Integer> lista_de_numeros) {
        System.out.println("\nRealizando la resta de los números en la lista.");
        int resta = lista_de_numeros.stream().reduce((a, b) -> a - b).orElse(0);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println();
    }

    public static void RealizarMultiplicacion(List<Integer> lista_de_numeros) {
        System.out.println("\nRealizando la multiplicación de los números en la lista.");
        int multiplicacion = lista_de_numeros.stream().reduce((a, b) -> a * b).orElse(1);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println();
    }

    public static void RealizarDivision(List<Integer> lista_de_numeros) {
        System.out.println("\nRealizando la división de los números en la lista.");
        double division = lista_de_numeros.stream().mapToDouble(Integer::doubleValue).reduce((a, b) -> a / b).orElse(0);
        System.out.println("El resultado de la división es: " + division);
        System.out.println();
    }

    public static void RealizarPotencia(List<Integer> lista_de_numeros) {
        System.out.println("\nRealizando la potencia de los números en la lista.");

        if (lista_de_numeros.isEmpty()) {
            System.out.println("No hay números en la lista para calcular la potencia.");
            return;
        }

        double potencia = 1.0;

        for (int numero : lista_de_numeros) {
            potencia *= Math.pow(numero, 1.0 / lista_de_numeros.size());
        }

        System.out.println("El resultado de la potencia es: " + potencia);
        System.out.println();
    }

}
