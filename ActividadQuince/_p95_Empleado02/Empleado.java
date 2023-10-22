//Clase del programa _p95_Empleado02 que se encarga de implementar la encapsulación para los datos
//Miguel Esaú Rivera Román
// 21-10-2023       Versión 1.0.0


public class Empleado {

    private String Nombre;
    private int Edad;

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String toString() {
        return String.format("Nombre: %s, Edad: %d",Nombre,Edad);
    }
}