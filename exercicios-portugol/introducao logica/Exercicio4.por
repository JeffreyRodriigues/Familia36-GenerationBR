programa
{
	
	funcao inicio()
	{
		inteiro a, b, c, r, s, calculod, calculor, calculos

		escreva("\nEntre com o valor A: ")
		leia(a)
		escreva("\nEntre com o valor B: ")
		leia(b)
		escreva("\nEntre com o valor C: ")
		leia(c)

		calculor = (a + b)*(a + b)
		calculos = (b + c)*(b + c)
		calculod = (calculor + calculos) / 2

		escreva("\nO valor de R é: ",calculor, "\nO valor de S é: ",calculos, "\nPortanto o valor de D é :",calculod)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */