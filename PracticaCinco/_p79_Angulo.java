//Muestra el tipo de angulo según sus grados                                                                                       
//Miguel Esaú Rivera Román
//25-09-23      Version 1.0.0

import java.util.Scanner;

public class _p79_Angulo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un ángulo entre 0 y 360 grados: ");
        double angulo = scanner.nextDouble();

        if (esAnguloValido(angulo)) {
            String tipoAngulo = clasificarAngulo(angulo);
            System.out.println("El ángulo " + angulo + " grados es un ángulo " + tipoAngulo + ".");
        } else {
            System.out.println("El ángulo ingresado no es válido. Debe estar entre 0 y 360 grados.");
        }
    }

    // Función para validar si el ángulo está en el rango [0, 360]
    public static boolean esAnguloValido(double angulo) {
        return angulo >= 0 && angulo <= 360;
    }

    // Función para clasificar el tipo de ángulo
    public static String clasificarAngulo(double angulo) {
        if (angulo < 90) {
            return "agudo";
        } else if (angulo == 90) {
            return "recto";
        } else if (angulo < 180) {
            return "obtuso";
        } else if (angulo == 180) {
            return "llano";
        } else {
            return "cóncavo";
        }
    }
}