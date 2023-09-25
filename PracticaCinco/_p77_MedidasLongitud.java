//Programa que transforma medidas de longitus
//Miguel Esaú Rivera Román
//25-09-23          Version 1.0.0

import java.util.Scanner;;

public class _p77_MedidasLongitud {

    public static double centimetro;
    public static double pie;

    public static double centimetros(double pulgadas){
        centimetro = pulgadas * 2.54;

        return centimetro;
    }
    public static double pies(double metros){
        pie = metros * 3.281;

        return pie;        
    }

    public static void main(String[] args) {
        double metros;
        double pulgadas;
        int opcion;
        Scanner obj = new Scanner(System.in);

        System.out.println("Escoge que funcion deseas usar" + "\n"+"[1] Convierte pulgadas a centimetros"+"\n"+"[2] Convierte metros a pies");

        opcion = obj.nextInt();

        if ((opcion <1)||(opcion>2)) {
            System.out.println("Opcion no valida carnal");
        }
 
        if (opcion == 1){
            System.out.println("Seleccione cuantas pulgadas desea convertir");            

            pulgadas = obj.nextDouble();
            System.out.println(pulgadas + " pulgadas equivalen a " + centimetros(pulgadas)+" centimetros");            
        }
        if (opcion == 2){
            System.out.println("Seleccione cuantos metros desea convertir");            

            metros = obj.nextDouble();
            System.out.println(metros + " metros equivalen a " + pies(metros)+ " pies");            
        }        

    }
}
