//Modela un rectángulo con un largo y ancho (como float)
//Miguel Esaú Rivera Román 
//21-10-23      Versión 1.0.0

public class Rectangulo {
   private float Largo;
   private float Ancho;

    public Rectangulo (){};

    public Rectangulo (float Largo, float Ancho){
        this.Largo = Largo;
        this.Ancho = Ancho;
    };

    public float getLargo(){
        return Largo;
    };
    public void setLargo(float largo){
        Largo = largo;
    };

    public float getAncho(){
        return Ancho;
    };
    public void setAncho(float ancho){
        Ancho = ancho;
    };

    public float getArea(){
        float Area = Largo * Ancho;
        return Area;

    };

    public float getPerimetro(){
        float perimetro = (Ancho * 2) + (Largo * 2);
        return perimetro;
    };

    public String toString(){
        return String.format("Largo: %f, Ancho: %f",Largo,Ancho);
    };

}
