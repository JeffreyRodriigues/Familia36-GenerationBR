package ExercicioHeranca;

public class Cavalo extends Animal {
	
	private String correr;
	private String pular;
	
	public Cavalo(String nome, int idade, String som, String correr, String pular)
	{
		super(nome,idade,som);
		this.correr = correr;
		this.pular = pular;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n---------" +getNome()+"-------"+"\nIdade: " +getIdade()+" anos"+"\nO cavalo faz... " +getSom()
		+"\nO cavalo está correndo no " +correr+ "\nO Cavalo está pulando o " +pular);
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getPular() {
		return pular;
	}

	public void setPular(String pular) {
		this.pular = pular;
	}
	
	

}
