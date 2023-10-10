// Promedia calificaciones
// Miguel Esaú Rivera Román
// 09-10-23         Versión 1.0.0

import java.util.Scanner;

public class _p92_MayorMenor {

    public static float capturaNuMa(float []num){
    float numeroMayor = 0;
        for (int index = 0; index < num.length; index++) {
            if (numeroMayor < num[index]) {
                numeroMayor = num[index];
            }
        }
        
        return numeroMayor;
    };
    public static float capturaNuMe(float []num) {
        float numeroMenor = num[0]; // Inicializar con el primer elemento
    
        for (int index = 1; index < num.length; index++) {
            if (numeroMenor > num[index]) {
                numeroMenor = num[index];
            }
        }
    
        return numeroMenor;
    };


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("¿Cuantas calificaciones va a evaluar? ");


        n = sc.nextInt();
        float[] num = new float[n];

        for (int i = 0;i<num.length;i++) {
            System.out.print("Coloque la calificacion ");  
 
            float g = sc.nextFloat();
            num[i] = g;;
        }

        System.out.println("\n\nTodos los elementos del arreglo son:");

        for(float i : num) {
            System.out.printf( "%.2f ", i );
        }

        System.out.println("\nEl elemento mayor es: " + capturaNuMa(num)+"\nEl elemento menor es: " +capturaNuMe(num));
                
        System.out.println("\n\nProceso terminado ");

    }
}