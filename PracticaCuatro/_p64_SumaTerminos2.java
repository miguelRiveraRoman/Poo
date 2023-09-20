//Imprime una secuencia de terminos, el numero de renglones que el usuario desee y su suma
//Miguel Esaú Rivera Román
//20-09-23          Version 1.0.0

import java.util.Scanner;
public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i,j,n,num;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos renglones ? "); 
            n = obj.nextInt();
            num = 1;
            int suma = 0;

            for(i=1; i<=n; i++) {

                for(j=1; j<=i; j++) {
                    System.out.print(num);

                }
                System.out.print("+");
            }

            System.out.print("\n"+"suma: ");

            for (i=1;i<=n;i++) {
            suma++;
            System.out.print(suma);
            }

            System.out.print("\nDeseas continuar (S/N) ?");
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");
    }
}