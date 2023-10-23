
public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos , int  goles){
        super(nombre);
        this.Sexo = sexo; 
        this.Descripcion = descripcion; 
        this.Salario = salario; 
        this.Partidos = partidos;
        this.Goles = goles;        
    }

    @Override    
    public double getBono(){
        double bono=(Salario * 0.10) + (Partidos * 50) + (Goles * 5);
        return bono;
    };

    @Override
    public String toString(){
        return "[Nombre=" + Nombre + ", sexo=" +
        Sexo + ", Descripcion=" + Descripcion +"Salario= "+Salario+"Partidos = "+ Partidos+"Goles= "+ Goles+"]";
    };    
}
