package jogo;

public class Jogador {
	public String nome;
	private int casaAtual = 0;
	
	public Jogador(String nome, int posicao) {
		this.nome = nome;
		this.casaAtual = posicao;
	}
	
	public int andarPosicao(int posicao, Dado d ) {
		setPosicao(posicao + d.jogarDado());
		return posicao = posicao + d.jogarDado();
	}
	
	public void setNome (String nome)
	{	this.nome = nome;
	}
	
	public String getNome ()
	{	return nome;
	}

	public void setPosicao (int posicao)
	{	this.casaAtual = posicao;
	}
	
	public int getPosicao ()
	{	return casaAtual;
	}

}