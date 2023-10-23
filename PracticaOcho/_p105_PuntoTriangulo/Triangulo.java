//Clase encargada de definir el triangulo y sus tipos
//Miguel Esaú Rivera Román 
//23-10-2023        Versión 1.0.0

public class Triangulo {
    private Punto V1;
    private Punto V2;
    private Punto V3;

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.V1 = v1;
        this.V2 = v2;
        this.V3 = v3;
    }

    public Punto getV1() {
        return V1;
    }

    public void setV1(Punto v1) {
        this.V1 = v1;
    }

    public Punto getV2() {
        return V2;
    }

    public void setV2(Punto v2) {
        this.V2 = v2;
    }

    public Punto getV3() {
        return V3;
    }

    public void setV3(Punto v3) {
        this.V3 = v3;
    }

    public double getPerimetro() {
        double distancia1 = V1.getDistancia(V2);
        double distancia2 = V2.getDistancia(V3);
        double distancia3 = V3.getDistancia(V1);
        return distancia1 + distancia2 + distancia3;
    }

    public String getTipo() {
        double distancia1 = V1.getDistancia(V2);
        double distancia2 = V2.getDistancia(V3);
        double distancia3 = V3.getDistancia(V1);

        if (distancia1 == distancia2 && distancia2 == distancia3) {
            return "Equilatero";
        } else if (distancia1 == distancia2 || distancia2 == distancia3 || distancia3 == distancia1) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {

        return "Triangulo [V1=" + V1 + ", V2=" + V2 + ", V3=" + V3 + "]\n"
                + "Perimetro: " + (getPerimetro()) + "\n"
                + "Tipo: " + getTipo();
    }
}