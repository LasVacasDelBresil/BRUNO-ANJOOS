import java.util.Scanner;
import pokemon.*;

public class Ginasio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trnd trnd1 = new Trnd(null);
        Trnd trnd2 = new Trnd(null);

        System.out.print("INSIRA O NOME DO PRIMEIRO TREINADOR: ");
        trnd1.setNome(scanner.nextLine());
        System.out.println("Primeiro treinador: " + trnd1.getNome());
        System.out.println("");

        System.out.print("INSIRA O NOME DO SEGUNDO TREINADOR: ");
        trnd2.setNome(scanner.nextLine());
        System.out.println("Segundo treinador: " + trnd2.getNome());
        System.out.println("");

        // Escolha dos pokemons do primeiro treinador
        trnd1.Escolherpokemon();

        // Escolha dos pokemons do segundo treinador
        trnd2.Escolherpokemon();

        Luta.AnunciarLuta(trnd1, trnd2);

        // Define o primeiro e o segundo a atacar
        Trnd primeiro = Luta.queminicia(trnd1, trnd2);
        Trnd segundo = (primeiro == trnd1) ? trnd2 : trnd1;

        boolean atq1 = true;
        boolean atq2 = true;
        while (true) {
            int indexpokemon1 = -1;
            int indexpokemon2 = -1;

            // Verifica qual pokémon do primeiro jogador tem vida
            for (int i = 0; i < 3; i++) {
                if (primeiro.getpokemon(i).getLife() > 0) {
                    indexpokemon1 = i;
                    break;
                }
            }

            if (indexpokemon1 == -1) {
                // Todos os pokémons do primeiro treinador foram derrotados
                System.out.println("Todos os pokémons do Treinador " + primeiro.getNome() + " foram derrotados!");
                System.out.println("O treinador " + segundo.getNome() + " é o grande campeão!");
                break;
            }

            if (atq1) {
                // Verifica qual pokémon do segundo jogador tem vida
                for (int i = 0; i < 3; i++) {
                    if (segundo.getpokemon(i).getLife() > 0) {
                        indexpokemon2 = i;
                        break;
                    }
                }

                Luta.lutar(primeiro, segundo, indexpokemon1, indexpokemon2);
                atq2 = true;
                atq1 = false;
            }

            // Verifica qual pokémon do segundo jogador tem vida
            for (int i = 0; i < 3; i++) {
                if (segundo.getpokemon(i).getLife() > 0) {
                    indexpokemon2 = i;
                    break;
                }
            }

            if (indexpokemon2 == -1) {
                // Todos os pokémons do segundo treinador foram derrotados
                System.out.println("Todos os pokémons do Treinador " + segundo.getNome() + " foram derrotados!");
                System.out.println("O treinador " + primeiro.getNome() + " é o grande campeão!");
                break;
            }

            if (atq2) {
                Luta.lutar(segundo, primeiro, indexpokemon2, indexpokemon1);
                atq1 = true;
                atq2 = false;
            }
        }
    }
}
