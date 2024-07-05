package pokemon;
import java.util.ArrayList;
import ataques.atq;
import tipos.*;

public class Ntauros extends pokemons {
    private NORMAL NORMAL; // Tipo do pokemon

    //Constructor
    public Ntauros() {
        super("Tauros", 100);
        
        NORMAL = new NORMAL(); // Cria uma instância do tipo NORMAL
    }

    public ArrayList<atq> getataques() {
        return NORMAL.getataques(); // Retorna os ataques do tipo NORMAL
    }
}