//Impresión y opereraciones aritmeticas de diferentes terminos
//Miguel Esaú Rivera Román
//20-09-23      version 1.0.0

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int n;
        float i,j,r;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            r=0;
            System.out.print("Cuantos terminos ? "); 
            n = obj.nextInt();
            j=1;

            System.out.print(j + " ");

            for(i=2; i<=n; i++) {
          

            System.out.print(" + "+j+"/"+i+"");

            r +=(j/i);


            }
            r+= j;
            System.out.println("\n"+"La suma es de: "+r);
            System.out.print("\nDeseas continuar (S/N) ?");
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");
    }
}