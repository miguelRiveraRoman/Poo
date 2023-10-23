import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo() {
        this.Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this.Nombre = nombre;
        this.Liga = liga;
        this.Jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador Jugador : Jugadores) {
            total += Jugador.getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador Jugador : Jugadores) {
            if (Jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }   
    public void reporte() {

        
        System.out.println("Reporte del equipo: " + Nombre);
        System.out.println("Liga: " + Liga);
        System.out.println("Total de jugadores: " + Jugadores.size());
        System.out.println("Total de hombres: " + getTotalH());
        System.out.println("Total de mujeres: " + getTotalM());
        System.out.println("Total del bono: " + getTotalBono());
        System.out.println("Total de los totales: " + getTotal());
    }         
    @Override
    public String toString() {
        return "Equipo: " + Nombre + ", Liga: " + Liga;
    }    
}
