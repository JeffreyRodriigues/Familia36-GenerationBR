programa
{
	
	funcao inicio()
	{
		real pontos[5], maiorp=0.0
		inteiro x
		
		para(x=0;x<5;x++)
		{
			escreva("\nEntre com os pontos: ")
			leia(pontos[x])
		}

		para(x=0;x<5;x++)
		{
			se(maiorp < pontos[x]) 
			{
				maiorp = pontos[x]
			}
		}
		escreva("\nA Maior pontuação é: ",maiorp)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 6, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */