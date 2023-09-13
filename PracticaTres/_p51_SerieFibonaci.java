//Serie de fibonaci
//Miguel Esaú Rivera Román
//13-09-2023

import java.util.Scanner;

public class _p51_SerieFibonaci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat = 'S'; // Inicializamos repeat con un valor para que el bucle se ejecute al menos una vez

        while (Character.toUpperCase(repeat) == 'S') {
            System.out.print("Ingrese el valor máximo para la serie de Fibonacci: ");
            int max = scanner.nextInt();
            if (max < 0) {
                System.out.println("El valor máximo debe ser un número positivo.");
                continue;
            }

            // Imprimir la serie de Fibonacci
            int a = 0, b = 1;
            int c = 0;
            System.out.print("Serie de Fibonacci hasta " + max + ": ");
            while (c <= max) {
                System.out.print(c + " ");
                a = b;
                b = c;
                c = a + b;
            }

            System.out.println(); // Salto de línea

            // Preguntar al usuario si desea repetir el proceso
            System.out.print("¿Desea repetir el proceso? (S/N): ");
            repeat = scanner.next().charAt(0);
        }

        scanner.close();
        System.out.println("Gracias por utilizar el programa");
    }
}