//Clase encargada de definir los valores del punto
//Miguel Esaú Rivera Román 
//23-10-2023        Versión 1.0.0

public class Punto {
    private int X;
    private int Y;

    public Punto(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public double getDistancia(Punto punto) {
        double distanciaX = X - punto.getX();
        double distanciaY = Y - punto.getY();
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
}
