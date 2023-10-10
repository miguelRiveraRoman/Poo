// Inicializa de forma manual arreglo de números flotantes y lo imprime
// Miguel Esaú Rivera Román
// 07-10-23         Versión 1.0.0

public class _p90_Temperaturas {
    public static void main(String[] args) {
        float[] temperaturas = new float[9];
        
        temperaturas[0] = 2.34f;
        temperaturas[1] = 44.56f;
        temperaturas[2] = 7.89f;
        temperaturas[3] = 0.5f;
        temperaturas[4] = 2.5f;
        temperaturas[5] = 4.67f;
        temperaturas[6] = 40.3f;
        temperaturas[7] = 22.35f;
        temperaturas[8] = 56.22f;

        System.out.printf("Primer elemento del arreglo %.2f\n", temperaturas[0] );
        System.out.printf("Tercer elemento del arreglo %.2f\n", temperaturas[2] );
        
        System.out.println("\n\nTodos los elementos del arreglo son:");

        for(float i : temperaturas) {
            System.out.printf( "%.2f ", i );
        }

        System.out.println("\nTodos los elementos del arreglo son:");

        for(int i=0; i < temperaturas.length; i++) {

            System.out.printf( "%.2f ",(temperaturas[i] >= 10) ? 0 : temperaturas[i]);
        }        

        System.out.println("\n\nProceso terminado ");
    }
}