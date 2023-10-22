//Modela un artículo en una factura, con un id, descripción, cantidad y precio
//Miguel Esaú Rivera Román
//21-10-2023        Versión 1.0.0

public class Articulo {
    private String Id;
    private String Desc;
    private int Cant;
    private double PrecioUnit; 

    public Articulo(String Id, String Desc, int Cant, double PrecioUnit){
        this.Id = Id;
        this.Desc = Desc;
        this.Cant = Cant;
        this.PrecioUnit = PrecioUnit;
    };

    public String getId(){
        return Id;
    };
    public String getDesc(){
        return Desc;
    };
    public int getCant(){
        return Cant;
    };
    public void setCant(int cant){
        Cant = cant;
    };    
    public double getPrecioUnit(){
        return PrecioUnit;
    };
    public void setPrecioUnit(double preciounit){
        PrecioUnit = preciounit;

    };        
    public double getTotal(){
        double total = (PrecioUnit * Cant);
        return total;
    };
    public String toString(){
        return String.format("Articulo [Id=%s, Desc=%s, Cant=%d, PrecioUnit=%f]",Id,Desc,Cant,PrecioUnit);
    };    
}
