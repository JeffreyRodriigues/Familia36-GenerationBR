programa
{
	
	funcao inicio()
	{
		real sal, somasal=0.0, mediasal, medianf, maiorsal=0.0, perc
		inteiro nf, somanf=0, cont100=0, x

		para(x=1;x<=4;x++)
		{
			escreva("\nEntre com o seu salário: ")
			leia(sal)
			escreva("\nEntre com o número de filhes: ")
			leia(nf)

			somasal += sal // somasal = somasal +sal
			somanf += nf

			se(maiorsal < sal)
			{
				maiorsal = sal
			}

			se(sal<=100)
			{
				cont100++
			}
			
		}
		mediasal = somasal / 4
		medianf = somanf / 4
		perc = (cont100 * 100) / 4

		escreva("\nMédia salarial: ",mediasal)
		escreva("\nMédia do númdero de filhes: ",medianf)
		escreva("\nMaior salário: ",maiorsal)
		escreva("\nPercentual de pessoas que recebem até 100 reais: ",perc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 713; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */