public abstract class Forma {
    private String Color;
    private boolean Relleno;

    public Forma() {
        this.Color = "";
        this.Relleno = false;
    }

    public Forma(String color, boolean relleno) {
        this.Color = color;
        this.Relleno = relleno;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public boolean isRelleno() {
        return Relleno;
    }

    public void setRelleno(boolean relleno) {
        this.Relleno = relleno;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", Relleno=" + Relleno + "]";
    }
}