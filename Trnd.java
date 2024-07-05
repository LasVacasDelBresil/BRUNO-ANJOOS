import java.util.ArrayList;
import java.util.Scanner;
import pokemon.*;

public class Trnd {
    private String nome;
    private ArrayList<pokemons> pokemon; // Lista de Pokémon do treinador

    public Trnd(String nome) {
        this.nome = nome;
        this.pokemon = new ArrayList<pokemons>();
    }

    // Método para adicionar um Pokémon à lista
    public void adicionarpokemon(pokemons pokemon) {
        this.pokemon.add(pokemon);
    }

    public void Escolherpokemon() {
        System.out.println("Treinador " + this.getNome() + ", selecione 03 pokémons:");
        Scanner scanner = new Scanner(System.in); // Instancia o scanner
        ArrayList<Integer> pokemonsEscolhidos = new ArrayList<>(); // Lista para verificar pokémons já escolhidos

        while (this.getpokemon().size() < 3) {
            System.out.println("1 - Tipo Água - Gigantamax Blastoise");
            System.out.println("2 - Tipo Água - Seadra");
            System.out.println("3 - Tipo Fogo - Charmeleon");
            System.out.println("4 - Tipo Fogo - Magmar");
            System.out.println("5 - Tipo Normal - Rattata");
            System.out.println("6 - Tipo Normal - Tauros");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            if (opcao >= 1 && opcao <= 6) {
                if (!pokemonsEscolhidos.contains(opcao)) {
                    switch (opcao) {
                        case 1:
                            Agigantamaxblastoise gigantamaxblastoise = new Agigantamaxblastoise();
                            this.adicionarpokemon(gigantamaxblastoise);
                            break;
                        case 2:
                            Aseadra seadra = new Aseadra();
                            this.adicionarpokemon(seadra);
                            break;
                        case 3:
                            Fcharmeleon charmeleon = new Fcharmeleon();
                            this.adicionarpokemon(charmeleon);
                            break;
                        case 4:
                            Fmagmar magmar = new Fmagmar();
                            this.adicionarpokemon(magmar);
                            break;
                        case 5:
                            Nrattata rattata = new Nrattata();
                            this.adicionarpokemon(rattata);
                            break;
                        case 6:
                            Ntauros tauros = new Ntauros();
                            this.adicionarpokemon(tauros);
                            break;
                    }
                    pokemonsEscolhidos.add(opcao);
                    System.out.println("Pokémon adicionado à sua equipe!");
                } else {
                    System.out.println("Você já escolheu este Pokémon. Escolha outro!");
                }
            } else {
                System.out.println("Opção incorreta, tente novamente.");
            }
        }
        System.out.println(this.getNome() + ", seu time está formado. Vamos lá!");
        System.out.println(""); // Linha em branco
    }

    public ArrayList<pokemons> getpokemon() {
        return pokemon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public pokemons getpokemon(int i) {
        return this.pokemon.get(i);
    }
}
