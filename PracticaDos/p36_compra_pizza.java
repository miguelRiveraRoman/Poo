//Muestra el total a pagar de pizza según varías condiciones
//Miguel Esaú Rivera Román
//01-09-2023 - Versión 1.0

import java.util.Scanner;

public class p36_compra_pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precio de las pizzas
        double precioChica = 5.0;
        double precioMediana = 10.0;
        double precioGrande = 20.0;

        // Solicitar al usuario que elija el tamaño de la pizza
        System.out.println("Tamanio de la pizza: ");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        int opcion = scanner.nextInt();

        double precioPizza = 0.0;

        switch (opcion) {
            case 1:
                precioPizza = precioChica;
                break;
            case 2:
                precioPizza = precioMediana;
                break;
            case 3:
                precioPizza = precioGrande;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("Cantidad de pizzas: ");
        int cantidad = scanner.nextInt();

        double totalCompra = precioPizza * cantidad;

        double descuento = 0.0;
        if (totalCompra > 2000) {
            descuento = 0.15 * totalCompra;
        }

        double totalConDescuento = totalCompra - descuento;

        System.out.println("Tamaño de la compra: $" + totalCompra);
        System.out.println("Cantidad comprada: " + cantidad + " pizza(s)");
        System.out.println("Total compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total con descuento: $" + totalConDescuento);

    }
}