package jogo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in);
		System.out.println("Digite o número de casas do Jogo:");
		int Objetivo = texto.nextInt();
		jogo jogo = new jogo(Objetivo);
		
		Scanner texto2 = new Scanner (System.in);
		System.out.println("Digite o nome do primeiro jogador:");
		String Nome1 = texto2.nextLine();
		Jogador j1 = new Jogador(Nome1, 0);
		
		System.out.println("Digite o nome do segundo jogador:");
		String Nome2 = texto2.nextLine();
		Jogador j2 = new Jogador(Nome2, 0);
		System.out.println("O jogo é entre: "+ j1.getNome()+" vs. "+ j2.getNome()+"\n");
		
		Dado d = new Dado(6, 0);
		
		if(jogo.SortearIniciante() == 1) {
			
		}
		
		System.out.println("vez do jogador:"+j1.getNome());
		j1.andarPosicao(j1.getPosicao(), d);
		System.out.println("o jogador 2 está na posicao " +j1.getPosicao()+"\n");
		
		System.out.println("vez do jogador:"+j2.getNome());
		j2.andarPosicao(j2.getPosicao(), d);
		System.out.println("o jogador 2 está na posicao " +j2.getPosicao());
		
		System.out.println("----------------------------------------------");
		
		System.out.println("vez do jogador:"+j1.getNome());
		j1.andarPosicao(j1.getPosicao(), d);
		System.out.println("o jogador 2 está na posicao " +j1.getPosicao()+"\n");
		
		System.out.println("vez do jogador:"+j2.getNome());
		j2.andarPosicao(j2.getPosicao(), d);
		System.out.println("o jogador 2 está na posicao " +j2.getPosicao());
		
		System.out.println("----------------------------------------------");
	}
}
