//Imprime el día de la semana en base a un numero
//Miguel Esaú Rivera Román
//21-09-23          Versión 1.0.0

import java.util.Scanner;

public class _p76_DiaSemana {
    public static int Dia (int n) {
        switch (n) {
            case 1:
                System.out.print("Domingo es el nombre del dia ");
                break;
            case 2:
                System.out.print("Lunes es el nombre del dia ");
                break;
            case 3:
                System.out.print("Martes es el nombre del dia ");
                break;
            case 4:
                System.out.print("Miercoles es el nombre del dia ");
                break;
            case 5:
                System.out.print("Jueves es el nombre del dia ");
                break;

            case 6:
                System.out.print("Viernes es el nombre del dia ");
                break;
            case 7:
                System.out.print("Sabado es el nombre del dia ");
                break;

            default:
                return n;
        } 
        return n;
    }
    
    
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;

        System.out.println("Dame el numero del dia de la semana");
        n = obj.nextInt();

        if (n<8 && n>=1) {
            System.out.println(Dia(n));   
        } else{
            System.out.println("No se puede carnal");
        }
       

    }
}
