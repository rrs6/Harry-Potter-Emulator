package casa;

public class RepositorioCasaLista {
	private Casa casa;
	private RepositorioCasaLista proximaCasa;
	
	public RepositorioCasaLista()
	{
		this.casa = null;
		this.proximaCasa = null;
	}
	public void inserirCasa(Casa casa)
	{
		boolean existe = casaExiste(casa);
		if(existe)
		{
			//TRATEMENTO DE EXCEÇÕES!!!
		}
		else
		{
			if(this.casa == null)
			{
				this.casa = casa;
				this.proximaCasa = new RepositorioCasaLista();
			}
			else
			{
				this.proximaCasa.inserirCasa(casa);
			}
		}
	}
	public void removerCasa(Casa casa)
	{
		if(this.casa.getCasa().equals(casa.getCasa()))
		{
			this.casa = this.proximaCasa.casa;
			this.proximaCasa = this.proximaCasa.proximaCasa;
		}
		else
		{
			//TRATAMENTO DE EXCEÇÕES!!!
		}
	}
	public boolean casaExiste(Casa casa)
	{
		if(this.casa.getCasa().equals(casa.getCasa()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
