//Imprime tabla de conversión de grados Centigrados a Farenheit
//Miguel Esaú Rivera Román 
//13-09-23      Version 1.0-0

import java.util.Scanner;
public class _p50_ConversionTemperaturas {
public static void main(String[] args) {
int ini, fin, c;
double f;
char resp;
Scanner obj = new Scanner(System.in);
do {
System.out.println("Imprime una tabla de conversion de grados centigrados a farenheit\n");
do {
System.out.print("Inicio : "); 
ini = obj.nextInt();
System.out.print("Fin : "); 
fin = obj.nextInt();
} while( fin < ini );
c=ini;
System.out.println("Centigrado\tFarenheit");
while( c<=fin ) {
f = (c*1.8)+32; 
System.out.printf("%d\t%.2f\n",c,f);
c++;
f = (c*1.8)+32; 
}
System.out.print("\nDeseas continuar (S/N) ? ");resp = Character.toUpperCase(obj.next().charAt(0));
} while( resp != 'N');
System.out.println("\nGracias por utilizar este programa !");
}
}
