//Programa que imprime numero impares de forma ascendente
//Miguel Esaú Rivera Román
//13-09-23      Versión 1.0.0

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int n,c,s,i;
        float p;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
        System.out.println("Imprime números pares ascendente\n");
        System.out.print("Hasta donde ? "); 
        n = obj.nextInt();
        s=0;
        c=1;
        i = 0;
        while( c<=n ) {
        System.out.printf("%d ",c);
        s = s + c;
        c = c+2;
        i++;
      
        }
        p = s/i;

        System.out.printf("\nLa suma es %d",s);
        System.out.println("\nEl promedio es de: " +p);
        System.out.print("\nDeseas continuar (S/N) ? ");

        resp =  Character.toUpperCase(obj.next().charAt(0));
        }
         while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
        }
}
