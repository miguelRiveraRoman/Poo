import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner (System.in);

        System.out.println("\n Calculando el area de u  circulo");
        System.out.println("\n Dame el radio");

        radio = lradio.nextFloat();
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El circulo de radio " + radio + " tiene un area de " + area);

    }
}
