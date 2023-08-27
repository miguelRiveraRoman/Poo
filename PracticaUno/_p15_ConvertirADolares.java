//Miguel Esaú Rivera Román
//23-08-2023 - Versión 1.0
//Conversor de pesos mexicanos a dolares

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {

        System.out.println("¿Cuantos pesos desde convertir?");
        float pesos = new Scanner(System.in).nextFloat();

        double dolar = pesos * 0.060; 

        System.out.println(pesos +" pesos equivalen a " + dolar+ " dolares");


    }
}
