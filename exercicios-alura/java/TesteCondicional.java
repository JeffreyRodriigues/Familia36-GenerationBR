
public class TesteCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar, " + "pois est� acompanhade");			
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
}
}


