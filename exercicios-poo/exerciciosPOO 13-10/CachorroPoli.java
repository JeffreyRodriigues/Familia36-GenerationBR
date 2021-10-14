package ExercicioHeranca;

public class CachorroPoli extends AnimalPoli {
	
	public CachorroPoli()
	{
		super("Cachorro Polimorfico");
	}
	
	@Override
	public void som(String emitirSom)
	{
		System.out.println("\nAuauauauau");
	}

}
