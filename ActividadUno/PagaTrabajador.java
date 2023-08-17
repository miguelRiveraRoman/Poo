import java.util.Scanner;

public class PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagaBruta, pagaNeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("Nombre del trabajador "); nombre = obj.nextLine();
        System.out.println("Horas trabajadas "); horas = obj.nextInt();
        System.out.println("Paga * Hora "); paga = obj.nextFloat();

        tasa = 0.03;

        pagaBruta = horas * paga;
        impuesto = pagaBruta * tasa;
        pagaNeta = pagaBruta - impuesto;

        System.out.println("\n Resumen de Pagos \n"); 
        System.out.println(String.format("El trabajador %s, trabajo %d horas a una paga de %.2f pesos la hora con una tasa de %.2f pesos la hora" ,nombre,horas,paga,tasa)); 
        System.out.println(String.format("Paga Bruta = %.2f", pagaBruta)); 
        System.out.println(String.format("Impuestos = %.2f", impuesto)); 
        System.out.println(String.format("Paga Neta = %.2f", pagaNeta)); 

    }
}
