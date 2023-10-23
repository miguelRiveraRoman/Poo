//Clase para ubicar las medidas de los puntos
//Miguel Esaú Rivera Roman
//23-10-2023        Version 1.0.0

public class Punto {
    private int X;
    private int Y;

    public Punto (){
    };
    public Punto (int X, int Y){
        this.X = X;
        this.Y = Y;
    };    

    public int getX(){
        return X;
    };
    public void setX(int x){
        this.X = x;
    };

    public int getY(){
        return Y;
    };
    public void setY(int y){
        this.Y = y;
    };

    public double getDistancia(Punto punto){
        double distanciaX = X - punto.getX();
        double distanciaY = Y - punto.getY();
        double distancia = Math.sqrt((distanciaX * distanciaX) + (distanciaY * distanciaY));
        return distancia;
    };

    @Override
    public String toString() {
        return "Circulo [Punto X =" + X + ", Punto Y =" + Y + "]";
    }
}
