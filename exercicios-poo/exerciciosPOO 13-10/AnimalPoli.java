package ExercicioHeranca;

public abstract class AnimalPoli {
	
	private String tipo;
	
	abstract public void som(String emitirSom);
	
	public AnimalPoli(String tipo)
	{
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
