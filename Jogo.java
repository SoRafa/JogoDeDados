package jogo;

public class Jogo {
	protected int objetivo;

	public Jogo(int Final) {
		this.objetivo = Final;
	}

	public void setObjetivo (int Final)
	{	this.objetivo = Final;
	}
	
	public int getObjetivo ()
	{	return objetivo;
	}
	
	public int SortearIniciante() {
		int result = 1 + (int)(Math.random() * 2);
		return result;
	}
	
	public void iniciar(int Final, Jogador j1, Jogador j2, Dado d) {
		while(Final >= (j1.getPosicao()) && (Final >= j2.getPosicao())) {
			System.out.println("vez do jogador:"+j1.getNome());
			j1.andarPosicao(j1.getPosicao(), d);
			System.out.println("o jogador 1 está na posicao " +j1.getPosicao()+"\n");
			
			System.out.println("vez do jogador:"+j2.getNome());
			j2.andarPosicao(j2.getPosicao(), d);
			System.out.println("o jogador 2 está na posicao " +j2.getPosicao()+"\n\n");
			MostrarVencedor(Final, j1, j2);
		}
	}
	
	public void MostrarVencedor(int Final, Jogador j1, Jogador j2) {
		if ((Final <= j1.getPosicao())) {
			System.out.println("O jogador "+j1.getNome()+" é vencedor");
		}else if ((Final <= j2.getPosicao())) {
			System.out.println("O jogador "+j2.getNome()+" é vencedor");
		}else if(Final <= (j1.getPosicao()) || (Final <= j2.getPosicao())) {
			System.out.println("Os jogadores empataram");
		}
	}
}