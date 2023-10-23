public class JugadorEntrenador extends Jugador{
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados , int proyectos){
        super(nombre);
        this.Sexo = sexo; 
        this.Descripcion = descripcion; 
        this.Salario = salario; 
        this.Subordinados = subordinados;
        this.Proyectos = proyectos;        
    }

    @Override    
    public double getBono(){
        double bono=(Salario * 0.15) + (Proyectos * 100)+ (Subordinados * 10);
        return bono;
    };

    @Override
    public String toString(){
        return "[Nombre=" + Nombre + ", sexo=" +
        Sexo + ", Descripcion=" + Descripcion +"Salario= "+Salario+"Proyectos = "+ Proyectos+"Subordinados= "+ Subordinados+"]";
    };     

}