// Genera números aleatorios
// Miguel Esaú Rivera Román
// 01-10-23         Versión 1.0.0

import java.util.Random;

public class _p88_Aleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();

        int aleatorio1 = Math.abs(rnd.nextInt());
        int aleatorio2 = Math.abs(rnd.nextInt(30));
        int aleatorio3 = Math.abs(rnd.nextInt(100-50))+50;

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.printf("\nNumero aleatorio entero positivo : %d", aleatorio1);
        System.out.printf("\nNumero aleatorio 0 ..30 : %d", aleatorio2);
        System.out.printf("\nNumero aleatorio en el rango de 50 a 99 : %d", aleatorio3);
    }
}