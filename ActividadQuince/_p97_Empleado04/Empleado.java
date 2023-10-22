//Clase del programa _p97_Empleado04 que se encarga de extender la clase anterior
//Miguel Esaú Rivera Román
// 21-10-2023       Versión 1.0.0

public class Empleado {
    private String nombre;
    private int edad;
    private char sexo;
    private boolean casado;

    public Empleado() {};

    public Empleado(String nombre,int edad,char sexo,boolean casado) {
        this.nombre = nombre; this.edad = edad;
        this.sexo = sexo; this.casado = casado;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public char getSexo() { return sexo; }
    public boolean getCasado() { return casado; }
    public String toString() {
        return String.format("Nombre: "+nombre, "Edad: "+edad,"sexo: "+(sexo == 'M' ? "Mujer" : "Hombre"), "casado: "+(casado ?
        "Casado" : "No Casado"));
    }
}

