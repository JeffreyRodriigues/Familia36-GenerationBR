
public class TestaEscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >=2) 
		{
			acompanhado = true;
		} 
		else
		{
			acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vinde");
		} else {
			System.out.println("Infelizmente voc? n?o pode entrar");
		}

	}

}
