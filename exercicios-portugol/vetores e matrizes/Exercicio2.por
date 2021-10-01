programa
{
	
	funcao inicio()
	{
		inteiro dado[10],somalanc=0,maior=0,x,maiorc=0
		real medialanc

		para(x=0;x<10;x++)
		{
			escreva("\nEntre com o lançamento: ")
			leia(dado[x])
			enquanto(dado[x]<1 ou dado[x]>6)
			{
				escreva("\nEntre com um novo lançamento: ")
				leia(dado[x])
			}

			somalanc += dado[x]
			
			se(maior<dado[x])
			{
				maior = dado[x]
			}
		}

		escreva("\nO maior valor foi: ",maior)
		
		para(x=0;x<10;x++)
		{
			se(dado[x] == maior)
			{
				maiorc++
			}
		}

		medialanc = somalanc/10
		escreva("\nMédia de lançamentos: ",medialanc)
		escreva("\nO valor maior apareceu: ",maiorc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */