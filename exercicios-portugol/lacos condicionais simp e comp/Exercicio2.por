programa
{
	
	funcao inicio()
	{
		inteiro soma=0, cont

		para(cont = 0; cont <= 500; cont++)
		{
			se (cont % 2 != 0 e cont % 3==0)
			{
				soma = soma + cont

				escreva("\nOs multiplos são: ",cont)
			}			
		}
			escreva("\nA soma dos números é igual a: ",soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */