
public class TesteCondicional2 {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vinde");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
}
