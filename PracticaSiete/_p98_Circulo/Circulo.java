//Modela un círculo con un radio (como double)
//Miguel Esaú Rivera Román
//21-10-2023        Versión 1.0.0

public class Circulo {
    private double Radio;

    public Circulo(){};

    public Circulo(double radio){
        this.Radio = radio;
    };

    public double getRadio(){
        return Radio;
    };
    public void setRadio(double radio){
        Radio = radio;
    };    
    public double getArea(){
        double Area = 3.14 * (Radio * Radio);
        return Area;
    };
    public double getCircunferencia(){
        double Circunferencia = 2*(3.14* Radio);
        return Circunferencia;
    };      

    public String toString() {
        return String.format(" Radio: "+Radio);
    }
}
