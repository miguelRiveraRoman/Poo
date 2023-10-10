import java.util.Random;

public class _p93_ParesImpares {

    public static void main(String[] args) {
        int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX];
        int countPares = 0;
        int countImpares = 0;


        Random rand = new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = rand.nextInt(21); 
        }

        System.out.println("Elementos del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nElementos pares del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                countPares++;
            }
        }

        System.out.println("\nElementos impares del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                countImpares++;
            }
        }

        System.out.println("\nCuenta de números pares: " + countPares);
        System.out.println("Cuenta de números impares: " + countImpares);
    }
}