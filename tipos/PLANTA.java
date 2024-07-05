package tipos;
import java.util.ArrayList;

import ataques.*;

public class PLANTA {
    String tipos;

    private ArrayList<atq> ataques;

    public PLANTA() {
        tipos = "Planta";
        ataques = new ArrayList<>();
        //Adiciona os ataques à ArrayList
        ataques.add(new Ppetaldance());
        ataques.add(new Psolarbeam());
        ataques.add(new Pvinewhip());
    }

    public ArrayList<atq> getataques() {
        return ataques;
    }

    public String gettipos() {
        return tipos;
    }
}