import java.util.Scanner;

public class p38_aceptar_estudiante_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre, sexo, edad y calificaciones
        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Sexo (h/m): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese las tres calificaciones:");
        double calificacion1 = scanner.nextDouble();
        double calificacion2 = scanner.nextDouble();
        double calificacion3 = scanner.nextDouble();

        // Evaluar si el estudiante es aceptado
        if (sexo == 'm' && edad > 21 && calificacion1 >= 8 && calificacion1 <= 9.5
                && calificacion2 >= 8 && calificacion2 <= 9.5
                && calificacion3 >= 8 && calificacion3 <= 9.5) {
            System.out.println("¡Felicidades, " + nombre + "! Eres aceptada en la Universidad Kitty Kat SA.");
        } else {
            System.out.println("Lo sentimos, " + nombre + ". No cumples con los requisitos de admision.");
        }
    }
}    