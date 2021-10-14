package ExercicioHeranca;

public class Cachorro extends Animal{
	
	private String correr;
	
	public Cachorro(String nome, int idade, String som, String correr)
	{
		super(nome,idade,som);
		this.correr = correr;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n---------" +getNome()+"-------"+"\nBilu tem: " +getIdade()+" anos"+"\nO cachorro faz... " +getSom()
		+"\nO cachorro está correndo no " +correr);
	}
	
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	

}
