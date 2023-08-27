//Miguel Esaú Rivera Román
//23-08-2023 - Versión 1.0
//Se va a calcular el volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.println("Introduzca el radio del cilindro");
        float radio = new Scanner(System.in).nextFloat();

        System.out.println("Introduzca la altura del cilindro");
        float altura = new Scanner(System.in).nextFloat();

        double volumen = Math.PI*(radio * radio) * altura;
        
        System.out.println(volumen);


    }    
}
