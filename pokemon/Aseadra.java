package pokemon;
import java.util.ArrayList;
import ataques.atq;
import tipos.*;

public class Aseadra extends pokemons {
    private PLANTA AGUA; // Tipo do pokemon

    //Constructor
    public Aseadra() {
        super("Seadra", 100);
        
        AGUA = new PLANTA(); // Cria uma instância do tipo Agua
    }

    public ArrayList<atq> getataques() {
        return AGUA.getataques(); // Retorna os ataques do tipo Agua
    }
}