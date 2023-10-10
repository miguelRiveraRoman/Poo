// Promedia calificaciones
// Miguel Esaú Rivera Román
// 07-10-23         Versión 1.0.0

import java.util.Scanner;

public class _p91_MayoresPromedio {

    public static float captura(float []num){
    float s;
    float suma = 0;
        for (int index = 0; index < num.length; index++) {
            s = num[index];
            suma +=s;
        }
        
        return suma;
    };



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float p;
        System.out.printf("¿Cuantas calificaciones va a evaluar? ");


        n = sc.nextInt();
        float[] num = new float[n];

        for (int i = 0;i<num.length;i++) {
            System.out.print("Coloque la calificacion ");  
 
            float g = sc.nextFloat();
            num[i] = g;;
        }
        p = captura(num) / n;

        System.out.println("\n\nTodos los elementos del arreglo son: ");

        for(float i : num) {
            System.out.printf( "%.2f ", i );
        }

        System.out.println("\nLa suma de los elementos es de: " + captura(num) + "\nY el promedio es de: " + p);


        System.out.println("\nLos calificaciones mayores al promedio son: ");

        for(int i=0; i < num.length; i++) {

            System.out.printf( "%.2f ",(num[i] <= p) ? null : num[i]);

        }                
        System.out.println("\n\nProceso terminado ");

    }
}