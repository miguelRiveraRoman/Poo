//Miguel Esaú Rivera Román
//Programación Orientada a Objetos 1
//Programa que se encarga de calcular la hipotenusa de un triangulo rectangulo

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.println("dame el primer lado");
        float lado1 = new Scanner(System.in).nextFloat();
        
        System.out.println("dame el segundo lado lado");
        float lado2 = new Scanner(System.in).nextFloat();

        float h = (lado1 *  lado1 + lado2 * lado2);
        double hipotenusa = Math.sqrt(h);

        System.out.println(hipotenusa);
    }
}
