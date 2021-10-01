programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][3], somanumeros=0, somadiagonal=0,l,c

		para (l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
			escreva("Entre com o número: ")
			leia(numeros[l][c])
			somanumeros+=numeros[l][c]	
			}
		}
		escreva("\nA soma dos números é: ",somanumeros)

		para (l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				se(l==c)
				{
					somadiagonal+=numeros[l][c]	
				}
			}
		}
		
	escreva("\nO total das diagonais são: ",somadiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */