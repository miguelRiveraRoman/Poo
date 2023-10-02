
import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
        int totalHombres = 0, totalMujeres = 0;
        int totalEdades = 0, totalParticipantes = 0, totalDinero = 0;

        int totalParticipantesInscritos = obtenerTotalParticipantes(scanner);

        for (int i = 0; i < totalParticipantesInscritos; i++) {
            System.out.println("Participante " + (i + 1) + ":");
            String nombre = obtenerNombre(scanner);
            int edad = obtenerEdad(scanner);
            char sexo = obtenerSexo(scanner);
            char tipo = obtenerTipo(scanner);

            if (esMayorDeEdad(edad)) {
                totalParticipantes++;
                totalEdades += edad;

                if (sexo == 'H') {
                    totalHombres++;
                } else if (sexo == 'M') {
                    totalMujeres++;
                }

                if (tipo == 'A') {
                    totalAlumnos++;
                    totalDinero += 50;
                } else if (tipo == 'D') {
                    totalDocentes++;
                    totalDinero += 80;
                } else if (tipo == 'T') {
                    totalTrabajadores++;
                    totalDinero += 60;
                }
            }
        }

        double promedioEdad = calcularPromedioEdad(totalEdades, totalParticipantes);


        System.out.println("\nResultados:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de edad de todos los participantes: " + promedioEdad);
        System.out.println("Total dinero recaudado de Alumnos: " + (totalAlumnos * 50));
        System.out.println("Total dinero recaudado de Docentes: " + (totalDocentes * 80));
        System.out.println("Total dinero recaudado de Trabajadores: " + (totalTrabajadores * 60));
        System.out.println("Total dinero en general: " + totalDinero);


        imprimirMensajeGanancias(totalDinero);
    }

    public static int obtenerTotalParticipantes(Scanner scanner) {
        System.out.print("¿Cuántos participantes hay? ");
        return scanner.nextInt();
    }

    public static String obtenerNombre(Scanner scanner) {
        System.out.print("Ingresa el nombre: ");
        return scanner.next();
    }

    public static int obtenerEdad(Scanner scanner) {
        System.out.print("Ingresa la edad: ");
        return scanner.nextInt();
    }

    public static char obtenerSexo(Scanner scanner) {
        System.out.print("Ingresa el sexo (H/M): ");
        return Character.toUpperCase(scanner.next().charAt(0));
    }

    public static char obtenerTipo(Scanner scanner) {
        System.out.print("Ingresa el tipo de participante (A/D/T): ");
        return Character.toUpperCase(scanner.next().charAt(0));
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static double calcularPromedioEdad(int totalEdades, int totalParticipantes) {
        return totalParticipantes > 0 ? (double) totalEdades / totalParticipantes : 0;
    }

    public static void imprimirMensajeGanancias(int totalDinero) {
        System.out.println("Mensaje Final:");
        if (totalDinero < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDinero >= 100 && totalDinero < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
    }    
}
