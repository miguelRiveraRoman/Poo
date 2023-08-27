//Miguel Esaú Rivera Román
//23-08-2023 - Versión 1.0
//Conversor de horas a dias, minutps y segundos

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        float dias, segundos, minutos;

        System.out.println("Dame las horas, bebe");
        float horas = new Scanner(System.in).nextFloat();

        dias = horas/24;
        minutos = horas*60;
        segundos = minutos * 60;

        System.out.println(horas +" horas quivalen a \n "+ dias +" dias \n "+ segundos + " segundos \n " + minutos + " minutos");

    }
}
