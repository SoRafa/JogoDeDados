package jogo;

public class jogo {
	protected int objetivo;

	public jogo(int Final) {
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
	
	public void iniciar(int Final) {
		
	}
	
	public void MostrarVencedor() {

	}
}