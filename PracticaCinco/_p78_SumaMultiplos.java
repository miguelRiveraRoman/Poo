//Suma de un rango de numeros multiplos de 3 o 4                                                                                          
//Miguel Esaú Rivera Román
//25-09-23      Version 1.0.0

import java.util.Scanner;

public class _p78_SumaMultiplos {

    public static int SumaMultiplos(int ini, int fin, int constante) {
        // Validar que el rango de números es válido
        if (ini >= fin) {
            System.out.println("El rango de números no es válido. 'ini' debe ser menor que 'fin.");
            return 0;
        }

        int suma = 0;
        for (int num = ini; num <= fin; num++) {
            if (num % constante == 0) {
                suma += num;
            }
        }
        return suma;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Sumar multiplos de 3");
            System.out.println("2. Sumar multiplos de 4");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingrese el valor inicial del rango: ");
                int ini = scanner.nextInt();
                System.out.print("Ingrese el valor final del rango: ");
                int fin = scanner.nextInt();
                
                int constante = (opcion == 1) ? 3 : 4;
                int suma = SumaMultiplos(ini, fin, constante);
                System.out.println("La suma de los multiplos de " + constante + " entre " + ini + " y " + fin + " es: " + suma);
            } else if (opcion == 3) {
                System.out.println("¡Adios!");
                break;
            } else {
                System.out.println("Opcion no valida. Por favor, seleccione una opción valida.");
            }
        }
    }
}