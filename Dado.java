package jogo;

public class Dado {
	private int numLados= 6;
	private int resultado;
	
	public Dado(int lados, int result) {
		this.numLados = lados;
		this.resultado = result;
	}
	
	public int getnumLados ()
	{	return numLados;
	}
	
	public void setnumLados (int lados)
	{	this.numLados = lados;
	}
	
	public int getResultado ()
	{	return resultado;
	}
	
	public void setResultado (int result)
	{	this.resultado = result;
	}
	
	public int jogarDado(){
		setResultado(1 + (int)(Math.random() * 6));
		return getResultado();
	}
}
