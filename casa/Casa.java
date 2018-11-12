package casa;

public class Casa {
	private String nome;
	int[] ptsCaracteristicas;
	int pontos;
	Bruxo fundador;
	Professor diretor;
	
	public Casa(String nome, Bruxo fundador , Professor diretor)
	{
		this.nome = nome;
		this.pontos = 0;
		this.ptsCaracteristicas = new int[4];
		this.fundador = fundador;
		this.diretor = diretor;
	}
	public String getCasa()
	{
		return this.nome;
	}
	public void atribuirCaracteristica(int coragem, int criatividade, int inteligentes, int ambiciosos)
	{
		this.ptsCaracteristicas[0] = coragem;
		this.ptsCaracteristicas[1] = criatividade;
		this.ptsCaracteristicas[2] = inteligentes;
		this.ptsCaracteristicas[3] = ambiciosos;
	}
}
