programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real carron, custof, valor, pdistribuidor = 0.28, pfabrica = 0.45

		escreva("Qual o preço do veículo? ")
		leia(carron)
		valor = carron + (carron * pdistribuidor) + (carron*pfabrica)

		escreva("O valor do carro novo é: ",mat.arredondar(valor,3))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */