//Imprime numeros impares descendente
//Miguel Esaú Rivera Román 
//13-09-23      Version 1.0-0

import java.util.Scanner;
public class _p49_ImparesDescendente {
public static void main(String[] args) {
int n,c,s,i;
float p;
char resp;
Scanner obj = new Scanner(System.in);
do {
System.out.println("Imprime números impares descendente\n");
System.out.print("Desde donde ? "); n = obj.nextInt();
s=0; i=0;
c=( n%2!=0 ? --n : n);
    while( c>=1 ) {
        System.out.printf("%d ",c);
        s = s + c;
        c = c - 2;
        i++;
    }
    p = s/i;

System.out.printf("\nLa suma es %d",s);
System.out.println("\nEl promedio es de: " +p);
System.out.print("\nDeseas continuar (S/N) ? "); resp =
Character.toUpperCase(obj.next().charAt(0));
} while( resp != 'N' );
System.out.println("\nGracias por utilizar este programa !");
}
}