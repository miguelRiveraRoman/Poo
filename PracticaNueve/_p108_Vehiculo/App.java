public class App {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];

        vehiculos[0] = new Compacto(4, 2, "CP0100010122", "Ford", 2023, 125345.22);
        vehiculos[1] = new Compacto(6, 4, "CP1000145555", "Nissan", 2010, 54500.33);
        vehiculos[2] = new Camioneta(450.0, 4, "CA104014544", "Dina", 2008, 234567.15);
        vehiculos[3] = new Camioneta(1200.0, 6, "CA774814599", "Hongyan", 2023, 934577.98);

        System.out.println("Datos de los Vehiculos de la flota");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }

        System.out.println("Calculando el total de precio de todos los vehiculos ...");
        double totalPrecio = 0.0;
        for (Vehiculo vehiculo : vehiculos) {
            totalPrecio += vehiculo.getPrecio();
        }
        System.out.println(totalPrecio);
    }
}