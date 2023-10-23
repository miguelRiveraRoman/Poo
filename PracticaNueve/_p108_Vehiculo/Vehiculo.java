public class Vehiculo {
    private String Serie;
    private String Marca;
    private int anio;
    private double Precio;

    public Vehiculo() {
        this.Serie = "";
        this.Marca = "";
        this.anio = 0;
        this.Precio = 0.0;
    }

    public Vehiculo(String serie, String marca, int anio, double precio) {
        this.Serie = serie;
        this.Marca = marca;
        this.anio = anio;
        this.Precio = precio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        this.Serie = serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public int getanio() {
        return anio;
    }

    public void setanio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + Serie + ", Marca=" + Marca + ", anio=" + anio + ", Precio=" + Precio + "]";
    }
}