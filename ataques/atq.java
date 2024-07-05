package ataques;

public abstract class atq {
    //Atributos da Classe
    protected String nome;
    protected int forca;

    //Constructor da classe Ataque
    public atq(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }
    
    //Getters and Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

}