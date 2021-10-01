programa
{
	
	funcao inicio()
	{
		inteiro numeros[2][3],somanumero=0,linha,coluna
		real medianumero

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("Entre com um número:" )
				leia(numeros[linha][coluna])
				somanumero += numeros[linha][coluna]
			}
		}
		medianumero = somanumero /6
		escreva("\nMédia dos números ",medianumero)

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nOs números são: ","\nO primeiro número é:",numeros[0][0],"\nO segundo número é:",numeros[0][1],"\nO terceiro número é:",numeros[0][2],"\nO quarto número é:",numeros[1][0],"\nO quinto número é:",numeros[1][1],"\nO sexto número é:",numeros[1][2])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */