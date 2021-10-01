programa
{
	
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro n = 233

		faca {
			Util.aguarde(300)
			escreva("\n", n)

			se (n >= 300 e n <= 400)
			{
				n = n+3
			}
			senao 
			{
				n = n+5
			}
			
		} 
		enquanto (n <= 456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */