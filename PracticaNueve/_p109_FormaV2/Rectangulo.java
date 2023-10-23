public class Rectangulo extends Forma {
    private double Largo;
    private double Ancho;

    public Rectangulo() {
        super();
        this.Largo = 0.0;
        this.Ancho = 0.0;
    }

    public Rectangulo(double largo, double ancho, String color, boolean relleno) {
        super(color, relleno);
        this.Largo = largo;
        this.Ancho = ancho;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        this.Largo = largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        this.Ancho = ancho;
    }

    @Override
    public double getArea() {
        return Largo * Ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * (Largo + Ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + ", Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }
}