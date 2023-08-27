//Miguel Esaú Rivera Román
//23-08-2023 - Versión 1.0
//calcula el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo,

import java.util.Scanner;

public class _p11_CalcularAngulo {

    public static void main(String[] args) {

        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Se va a calcular el tercer angulo");
        System.out.println("Angulo 1"); 
        angulo1 = obj.nextFloat();

        System.out.println("Angulo 2");
        angulo2 = obj.nextFloat();

        angulo3 = 180-(angulo1+angulo2);

        System.out.printf("La medida del tercer angulo es " + angulo3);
    }
}
