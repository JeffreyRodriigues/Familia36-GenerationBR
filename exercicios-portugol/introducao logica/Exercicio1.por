programa
{
	
	funcao inicio()
	{
		inteiro idade, ano, meses, dias, calculoano, calculomeses

		escreva ("\nEntre com a sua idade: ")
		leia(ano)
		escreva ("\nEntre com  meses:")
		leia(meses)
		escreva ("\nEntre com os dias:")
		leia(dias)

		
		calculoano = ano*365
		calculomeses = meses*30
		escreva("\nO valor total em dias é: ", calculoano+calculomeses+dias)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */