//Miguel Esaú Rivera Román
//23-08-2023 - Versión 1.0
//Programa que convierte grados fahrenheit a grados celsius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.println("Introduzca los grados fahrenheit");
        int fahrenheit = new Scanner(System.in).nextInt();
        

        int celsius = ((fahrenheit-32) * 5/9);

        System.out.println(fahrenheit +" grados fahrenheit " +  " equivalen a " +celsius + " grados celsius");

    }
}
