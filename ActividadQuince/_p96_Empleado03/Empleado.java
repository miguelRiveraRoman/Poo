//Clase del programa _p96_Empleado03 que se encarga de implementar constructores
//Miguel Esaú Rivera Román
// 21-10-2023       Versión 1.0.0

public class Empleado {

    private String Nombre;
    private int Edad;

    public Empleado() {};

    public Empleado(String nombre,int edad) {
        this.Nombre = nombre;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }

    public String toString() {
        return String.format("Nombre: %s, Edad: %d",Nombre,Edad);
    }
}