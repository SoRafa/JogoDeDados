package jogo;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in);
		System.out.println("Digite o número de casas do Jogo:");
		int Objetivo = texto.nextInt();
		Jogo jogo = new Jogo(Objetivo);
		Dado d = new Dado(6, 0);
		Scanner texto2 = new Scanner (System.in);
		
		System.out.println("Digite o nome do primeiro jogador:");
		String Nome1 = texto2.nextLine();
		Jogador j1 = new Jogador(Nome1, 0);
		
		
		System.out.println("Digite o nome do segundo jogador:");
		String Nome2 = texto2.nextLine();
		Jogador j2 = new Jogador(Nome2, 0);
		System.out.println("O jogo é entre: "+ j1.getNome()+" vs. "+ j2.getNome()+"\n");
		
		if(jogo.SortearIniciante() == 1) {
			jogo.iniciar(Objetivo, j1, j2, d);
		}else {
			jogo.iniciar(Objetivo, j2, j1, d);  }
	}
}
