package ExercicioHeranca;

public class Preguica extends Animal {
	
	public String escalar;
	
	public Preguica(String nome, int idade, String som, String escalar)
	{
		super(nome,idade,som);
		this.escalar = escalar;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n---------" +getNome()+"-------"+"\nIdade: " +getIdade()+" anos"+"\nA pregui�a faz... " +getSom()
		+"\nA Pregui�a est� escalando: " +escalar);
	}

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	
	
	
}
