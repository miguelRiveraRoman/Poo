//Promedia las calificaciones de un alumno monstrando su desempeño y promedio
//Miguel Esaú Rivera Román
//01-09-2023 - Versión 1.0

import java.util.Scanner;

public class p37_calculo_notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las 5 calificaciones
        System.out.println("Ingresa las 5 calificaciones:");
        double sumaCalificaciones = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion;
        }

        // Calcular el promedio
        double promedio = sumaCalificaciones / 5;

        // Evaluar el promedio y mostrar un mensaje
        System.out.println("Promedio: " + promedio);
        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado.");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo.");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, pues mejorar.");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente, sigue así.");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("Perfecto, tu esfuerzo valió la pena.");
        } else {
            System.out.println("Promedio no válido.");
        }

    }
}