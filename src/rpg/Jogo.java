package rpg;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Random random = new Random();

			System.out.print("Digite o nome do jogador: ");
			String nomeJogador = scanner.nextLine();

			System.out.print("Digite o nome do oponente: ");
			String nomeOponente = scanner.nextLine();

			//vidajogador
			//vida oponente
			int vidaJogador = 100;
			int vidaOponente = 100;

			System.out.println("Bem-vindos ao jogo da sorte! " + nomeJogador + " enfrentará " + nomeOponente + "!");
			System.out.println(
					"Lembrando que o somente o jogador escolhe o número e o oponente gera randomicamente! Boa sorte");

			while (vidaJogador > 0 && vidaOponente > 0) {
				System.out.println("\nEscolha um número de 1 a 10: ");
				int escolhaJogador = scanner.nextInt();

				int escolhaOponente = random.nextInt(10) + 1;

				System.out.println(nomeJogador + " escolheu: " + escolhaJogador);
				System.out.println("O " + nomeOponente + " escolheu: " + escolhaOponente);

				if (escolhaJogador > escolhaOponente) {
					int dano = random.nextInt(10) + 1;
					vidaOponente -= dano;
					System.out.println(nomeJogador + " acertou! Causou " + dano + " de dano ao " + nomeOponente);
				} else if (escolhaJogador < escolhaOponente) {
					int dano = random.nextInt(10) + 1;
					vidaJogador -= dano;
					System.out.println("O " + nomeOponente + " acertou! Você sofreu " + dano + " de dano.");
				} else {
					System.out.println("Empate! Ninguém sofreu dano.");
				}

				System.out.println("Sua vida: " + vidaJogador);
				System.out.println("Vida do oponente: " + vidaOponente);

			}

			if (vidaJogador > 0) {
				System.out.println("Parabéns! Você venceu o oponente.");
			} else {
				System.out.println("Você foi derrotado. Melhor sorte na próxima vez!");
			}
		}


	}

}
