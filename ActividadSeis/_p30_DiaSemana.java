// Dado un numero entre 1 y 7 imprime el dia de la semana
// Miguel Esaú Rivera Román
// 31-08-23   Version 1.0.0
import java.util.Scanner;
public class _p30_DiaSemana {
public static void main(String[] args) {
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("Dado un numero entre 1 y 7 imprime el dia de la semana\n");
System.out.print("Dame el dia con numero? ");
int dia = new Scanner(System.in).nextInt();
switch (dia) {
case 1 : System.out.println("Lunes");break;
case 2 : System.out.println("Martes");break;
case 3 : System.out.println("Miercoles");break;
case 4 : System.out.println("Jueves");break;
case 5 : System.out.println("Viernes");break;
case 6 : System.out.println("Sabado");break;
case 7 : System.out.println("Domingo");break;
default : System.out.println("Dia invalido, en que dia vives !!!");break;
}
System.out.println("\n\nProceso terminado ...");
}
}