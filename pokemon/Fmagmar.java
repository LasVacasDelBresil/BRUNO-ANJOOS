package pokemon;
import java.util.ArrayList;
import ataques.atq;
import tipos.*;

public class Fmagmar extends pokemons {
    private FOGO FOGO; // Tipo do pokemon

    //Constructor
    public Fmagmar() {
        super("Magmar", 100);
        
        FOGO = new FOGO(); // Cria uma instância do tipo FOGO
    }

    public ArrayList<atq> getataques() {
        return FOGO.getataques(); // Retorna os ataques do tipo FOGO
    }
}