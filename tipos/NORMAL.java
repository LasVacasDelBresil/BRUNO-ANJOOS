package tipos;
import java.util.ArrayList;

import ataques.*;

public class NORMAL {
    String tipos;

    private ArrayList<atq> ataques;

    public NORMAL() {
        tipos = "Normal";
        ataques = new ArrayList<>();
        //Adiciona os ataques à ArrayList
        ataques.add(new Ndizzypunch());
        ataques.add(new Ndoubleedge());
        ataques.add(new Nexplosion());
    }

    public ArrayList<atq> getataques() {
        return ataques;
    }

    public String gettipos() {
        return tipos;
    }
}