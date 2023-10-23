public class Compacto extends Vehiculo {
    private int Pasajeros;
    private int Puertas;

    public Compacto() {
        super();
        this.Pasajeros = 0;
        this.Puertas = 0;
    }

    public Compacto(int pasajeros, int puertas, String serie, String marca, int anio, double precio) {
        super(serie, marca, anio, precio);
        this.Pasajeros = pasajeros;
        this.Puertas = puertas;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.Pasajeros = pasajeros;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int puertas) {
        this.Puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto [" + super.toString() + ", Pasajeros=" + Pasajeros + ", Puertas=" + Puertas + "]";
    }
}