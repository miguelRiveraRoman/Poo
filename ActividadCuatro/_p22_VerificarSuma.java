//Programa que verifica que la suma de dos numeros se igual a un tercero
//Miguel Esaú Rivera Román
//29-08-2023 - Versión 1.0

import java.util.Scanner;

public class _p22_VerificarSuma {
    public static void main(String[] args) {
        float num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("verifica si la suma de dos numeros es igual a un tercer numero ");
        System.out.println(" numero 1: "); num1 = obj.nextFloat();
        System.out.println(" numero 2: "); num2 = obj.nextFloat();
        System.out.println(" numero 3: "); num3 = obj.nextFloat();

        if (num1+num2 == num3) {
            System.out.println("son iguales");
            }
        else   
            System.out.println("son diferentes");
            System.out.println("\nGracias por utilizar este programa");
        

    }   
}