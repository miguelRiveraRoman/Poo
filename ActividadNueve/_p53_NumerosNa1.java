// Numeros de n a 1 con paso de p
//Miguel Esaú Rivera Román
//19-09-23          Version 1.0.0

import java.util.Scanner;

public class _p53_NumerosNa1 {
    public static void main(String[] args) {
        int n,p;
        Scanner obj = new Scanner(System.in);

        System.out.println("Numeros de n a 1 con paso de p:");

        System.out.print("Desde donde ? "); 
        n = obj.nextInt();

        System.out.print("Paso ? "); 
        p = obj.nextInt();
        
        for(int i=n; i>=1; i-=p) {
            System.out.printf("%d ",i);
        }
    }
}