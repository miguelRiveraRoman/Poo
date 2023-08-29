import java.util.Scanner;

public class _p23_Convertirtemperatura {
    public static void main(String[] args) {

        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Convierte de centrigrados a farenheit y viceversa");
        System.out.println("(F) Farenheit a Centrigrados ");
        System.out.println("(C) Crntigrados a Farenheit ");
        System.out.println("Elige una opción");

        op = Character.toUpperCase(obj.next().charAt(0));

        if ( op == 'F') {
            System.out.println("Dame la temperatura en Farenheit ");
            temp = obj.nextFloat();
            res = (temp - 32) * 5/9;
            System.out.printf("\n %f grados farenheit equivale a %f grados centrigrados ", temp,res);

        }
        else if ( op == 'C'){
            System.out.println("Dame la temperatura en Farenheit ");
            temp = obj.nextFloat();
            res = (temp * 9/5) + 32;
            System.out.printf("\n %f grados farenheit equivale a %f grados centrigrados ", temp,res);

        }
        else
            System.out.printf("Opcion invalida");

        System.out.printf("Gracias por utilizar este programa");

    }    
}
