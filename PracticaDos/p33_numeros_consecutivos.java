//Verifica si 3 números son consecutivos o no
//Miguel Esaú Rivera Román
//01-09-23      Version 1.0.0


import java.util.Scanner; 

public class p33_numeros_consecutivos {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        
        System.out.println(" numero 1: "); num1 = obj.nextInt();
        System.out.println(" numero 2: "); num2 = obj.nextInt();
        System.out.println(" numero 3: "); num3 = obj.nextInt();

        if (sonConsecutivos(num1, num2, num3)) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Error: Los números no son consecutivos.");
        }
    }

    public static boolean sonConsecutivos(int num1, int num2, int num3) {
        // Verificamos si los números son consecutivos comparando sus diferencias.
        // Si las diferencias son 1 en cada caso, son consecutivos.
        return (num2 - num1 == 1 && num3 - num2 == 1);
    }    

}
