//Numeros de 1 a n con paso de p
//Miguel Esaú Rivera Román
//19-09-23          Version 1.0.0

import java.util.Scanner;

public class _p52_Numeros1aN {
    public static void main(String[] args) {
        int n,p;
        Scanner obj = new Scanner(System.in);

        System.out.println("Numeros de 1 a n con paso de p");
        
        System.out.print("Hasta donde ? ");
        n = obj.nextInt();

        System.out.print("Paso ? "); 
        p = obj.nextInt();

        for(int i=1; i<=n; i+=p) {
            System.out.printf("%d ",i);
        }
    }
}