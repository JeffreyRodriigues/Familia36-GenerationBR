package POO;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) //captura de uma possível exceção
		{
			//tratamento da exceção
			System.out.println("\nA frase inicial está nula, para solucionar tal problema, foi lhe atríbuido um valor default...");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: " +frase);
		System.out.println("\nFrase nova: " +novaFrase);
	}

}
