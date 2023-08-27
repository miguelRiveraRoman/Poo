//Trabajando con Constantes
//Miguel Esaú Rivera Román
//24-08-2023 - Versión 1.0

public class _p18_TrabajandoConstantes {
    static final double DESCUENTO = 0.10;
    static final int VELOCIDADLUZ = 30000;
    static final float TASA = 0.5f;
    static final byte SEPARADOR = 113;
     public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Las constantes son:\n");
        System.out.printf("Descuento x2: %.2f\n", 2*DESCUENTO);
        System.out.printf("Velocidad /2: %d\n",VELOCIDADLUZ/2);
        System.out.printf("Tasa: %.2f\n", TASA);
        System.out.printf("Separador: %d\n", SEPARADOR);

     }
}