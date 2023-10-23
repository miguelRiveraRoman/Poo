public class Camioneta extends Vehiculo {
    private double Capacidad;
    private int Ejes;

    public Camioneta() {
        super();
        this.Capacidad = 0.0;
        this.Ejes = 0;
    }

    public Camioneta(double capacidad, int ejes, String serie, String marca, int anio, double precio) {
        super(serie, marca, anio, precio);
        this.Capacidad = capacidad;
        this.Ejes = ejes;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.Capacidad = capacidad;
    }

    public int getEjes() {
        return Ejes;
    }

    public void setEjes(int ejes) {
        this.Ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camioneta [" + super.toString() + ", Capacidad=" + Capacidad + ", Ejes=" + Ejes + "]";
    }
}