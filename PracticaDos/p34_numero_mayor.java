//Dados tres números enteros, verifica cual es el mayor.
//Miguel Esaú Rivera Román
//01-09-23      Version 1.0.0

import java.util.Scanner; 

public class p34_numero_mayor {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        
        System.out.println(" numero 1: "); num1 = obj.nextInt();
        System.out.println(" numero 2: "); num2 = obj.nextInt();
        System.out.println(" numero 3: "); num3 = obj.nextInt();

        if ((num2 < num3) && (num1 < num3)) {
            System.out.println(num3 + " Es mayor que " + num2 + " y " + num1 );   
        }else if ((num3 < num1) && (num2 < num1)) {
                System.out.println(num1 + " Es mayor que " + num2 + " y " + num3 );   
                
            }else{
                    System.out.println(num2 + " Es mayor que " + num1 + " y " + num3 );   

            }
    }
}
