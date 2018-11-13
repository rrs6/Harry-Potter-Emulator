package casa;

public class Casa {
	private String nome;
	int[] ptsCaracteristicas;
	int pontos;
	Bruxo fundador;
	Professor diretor;
	
	public Casa(String nome, Bruxo fundador , Professor diretor, int[] caracteristicas)
	{
		this.nome = nome;
		this.pontos = 0;
		this.ptsCaracteristicas = caracteristicas;
		this.fundador = fundador;
		this.diretor = diretor;
	}
	public String getCasa()
	{
		return this.nome;
	}
	public int[] getCaracteristicaCasa()
	{
		return this.ptsCaracteristicas;
	}
}
