public class Circulo extends Forma {
    private double Radio;

    public Circulo() {
        super();
        this.Radio = 0.0;
    }

    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        this.Radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Radio * Radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        return "Circulo [" + super.toString() + ", Radio=" + Radio + "]";
    }
}