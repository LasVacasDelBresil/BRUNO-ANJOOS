import java.util.Scanner;
import java.util.Random;
import pokemon.*;

public class Luta {

    public static void AnunciarLuta(Trnd trnd1, Trnd trnd2) {
        try {
            Thread.sleep(1000);
            System.out.println("FINALMENTE!");
            Thread.sleep(2000);
            System.out.println("HOJE O GRANDE DUELO ENTRE " + trnd1.getNome() + " E " + trnd2.getNome() + " IRA ABALAR O MUNDO POKEMON!");
            Thread.sleep(3000);
            System.out.println("CONTAGEM REGRESSIVA:");
            Thread.sleep(1500);
            System.out.println("3...");
            Thread.sleep(1500);
            System.out.println("2...");
            Thread.sleep(1500);
            System.out.println("1...");
            Thread.sleep(1500);
            System.out.println("LUTEM!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void lutar(Trnd atq, Trnd def, int indexpokemonatq, int indexpokemondef) {
        Scanner scanner = new Scanner(System.in); // Instancia o scanner
        int escolhaatq = 0;

        // Ataque do jogador
        while (true) {
            System.out.println("Treinador " + atq.getNome() + ", você está batalhando com " + atq.getpokemon(indexpokemonatq).getNome());
            System.out.println("Qual ataque o pokémon " + atq.getpokemon(indexpokemonatq).getNome() + " realizará?");
            System.out.println("1. " + atq.getpokemon(indexpokemonatq).getataques().get(0).getNome());
            System.out.println("2. " + atq.getpokemon(indexpokemonatq).getataques().get(1).getNome());
            System.out.println("3. " + atq.getpokemon(indexpokemonatq).getataques().get(2).getNome());

            escolhaatq = scanner.nextInt() - 1;
            scanner.nextLine(); // Limpa o buffer do scanner

            if (escolhaatq < 0 || escolhaatq > 2) {
                System.out.println("O valor escolhido é inválido!");
            } else {
                AplicarDano(atq.getpokemon(indexpokemonatq), def.getpokemon(indexpokemondef), escolhaatq, def);
                System.out.println("O pokémon " + atq.getpokemon(indexpokemonatq).getNome() + " de "
                        + atq.getNome() + " causou " + atq.getpokemon(indexpokemonatq).getataques().get(escolhaatq).getForca() + " de dano ao "
                        + def.getpokemon(indexpokemondef).getNome() + " de " + def.getNome()
                        + " que está agora com " + def.getpokemon(indexpokemondef).getLife()
                        + " de vida devido ao ataque "
                        + atq.getpokemon(indexpokemonatq).getataques().get(escolhaatq).getNome());
                System.out.println(""); // Linha vazia
                break;
            }
        }
    }

    public static void AplicarDano(pokemons pokemon1, pokemons pokemon2, int indiceAtaque, Trnd defensor) {
        int forcaatq = pokemon1.getataques().get(indiceAtaque).getForca();
        int lifedef = pokemon2.getLife() - forcaatq;

        if (lifedef <= 0) {
            lifedef = 0;
            System.out.println("O pokémon " + pokemon2.getNome() + " de " + defensor.getNome() + " foi derrotado!");
            System.out.println(""); // Linha em branco
        }

        pokemon2.setVida(lifedef);
    }

    public static Trnd queminicia(Trnd trnd1, Trnd trnd2) {
        Random gerador = new Random();
        int g = gerador.nextInt(2);
        if (g == 0) {
            return trnd1;
        } else {
            return trnd2;
        }
    }
}
