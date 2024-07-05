package pokemon;


import java.util.ArrayList;

import ataques.atq;

public abstract class pokemons {
    @SuppressWarnings("unused")
    private String nome;

    private int life;

    public pokemons(String nome, int life) {
        this.nome = nome;
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setVida(int life) {
        this.life = life;
    }

    public String getNome() {
        return nome;
    }

     public abstract ArrayList<atq> getataques();

}