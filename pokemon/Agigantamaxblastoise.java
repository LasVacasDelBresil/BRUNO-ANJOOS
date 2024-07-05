package pokemon;
import java.util.ArrayList;
import ataques.atq;
import tipos.*;

public class Agigantamaxblastoise extends pokemons {
    private PLANTA AGUA; // Tipo do pokemon

    //Constructor
    public Agigantamaxblastoise() {
        super("Gigantamax Blastoise", 100);
        
        AGUA = new PLANTA(); // Cria uma instância do tipo Agua
    }

    public ArrayList<atq> getataques() {
        return AGUA.getataques(); // Retorna os ataques do tipo Agua
    }
}