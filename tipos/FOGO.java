package tipos;
import java.util.ArrayList;

import ataques.*;

public class FOGO {
    String tipos;

    private ArrayList<atq> ataques;

    public FOGO() {
        tipos = "Fogo";
        ataques = new ArrayList<>();
        //Adiciona os ataques à ArrayList
        ataques.add(new Fblazekick());
        ataques.add(new Fheatwave());
        ataques.add(new Fsacredfire());
    }

    public ArrayList<atq> getataques() {
        return ataques;
    }

    public String gettipos() {
        return tipos;
    }
}