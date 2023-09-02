//Muestra el contintente que corresponde al número introducido
//Miguel Esaú Rivera Román
//01-09-2023 - Versión 1.0
import java.util.Scanner;
public class p35_continentes_mundo {
public static void main(String[] args) {
System.out.print("\033[H\033[2J"); System.out.flush();
System.out.println("Muestra el continente en base al numero:\n");
System.out.print("Dame un numero (1..6) ? ");
int n = new Scanner(System.in).nextInt();
if(n==1) System.out.println("Asia");
if(n==2) System.out.println("Africa");
if(n==3) System.out.println("America del Norte");
if(n==4) System.out.println("America del Sur");
if(n==5) System.out.println("Antartida");
if(n==6) System.out.println("Europa");

if((n<1)||(n>6)){System.out.println("El numero no esta dentro del rango");} 

System.out.println("\nProceso terminado ....");
}
}