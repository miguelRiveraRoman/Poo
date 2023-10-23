//Clase que define el circulo y su radio
//Miguel Esaú Rivera Roman
//23-10-2023        Version 1.0.0

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo (){

    };    
    public Circulo (Punto centro,double radio){
        this.centro = centro;
        this.radio = radio;
    };    
    public Punto getCentro(){
        return centro;
    };
    public void setCentro(Punto centro){
        this.centro = centro;
    };
    public double getRadio(){
        return radio;
    };
    public void setRadio(double radio){
        this.radio = radio;
    };
    public double getArea(){
        double area = 3.14*(radio* radio);
        return area;
    };
    public double getCircunferencia(){
        double circunferencia = 2*(3.14*radio);
        return circunferencia;
    };
    
    @Override
    public String toString() {
        return "Circulo [Centro=" + centro + ", Radio=" + radio+ "]";
    }
}
/*
+ getArea():double
+ getCircunferencia():double
+ toString():String  */