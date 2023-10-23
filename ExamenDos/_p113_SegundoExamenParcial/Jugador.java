public abstract class Jugador{
    protected String Nombre;
    protected char Sexo;
    protected String Descripcion;
    protected double Salario;
    protected double Total;

    public Jugador(){

    }

    public Jugador(String nombre){
        Nombre = nombre;
    }    

    public Jugador(String nombre, char sexo, String descripcion, double salario, double total){
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
        Total = total;
    }
    public String getNombre(){
        return Nombre;
    };
    public String getDescripcion(){
        return Descripcion;
    };    
    public char getSexo(){
        return Sexo;
    };
    public double getSalario(){
        return Salario;
    };
    public double getTotal(){
        return Total;
    };

    public void setNombre(String nombre){
        Nombre = nombre;
    };    
    public void setDescripcion(String descripcion){
        Descripcion = descripcion;
    };     
     public void setSexo(char sexo){
        Sexo = sexo;
    }; 
    public void setSalario(double salario){
        Salario = salario;
    }; 
    public void setTotal(double total){
        Total = total;
    }; 

    public abstract double getBono();

    @Override
    public String toString(){
        return "Banco [Nombre=" + Nombre + ", sexo=" +
        Sexo + ", Descripcion=" + Descripcion +"Salario= "+Salario+"Total = "+ Total+ "]";
    }

}