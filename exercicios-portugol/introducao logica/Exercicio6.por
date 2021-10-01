programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, d1, resultado

		escreva("\nDigite o primeiro ponto de X1: ")
		leia(x1)
		escreva("\nDigite o segundo ponto de X2: ")
		leia(x2)	
		escreva("\nDigite o primeiro ponto de Y1: ")
		leia(y1)
		escreva("\nDigite o segundo ponto de Y2: ")
		leia(y2)

		d1 = mat.potencia(x2-x1, 2.0) + mat.potencia(y2-y1, 2.0)
		resultado = mat.raiz(d1, 2.0)

		escreva("A distância entre os pontos é de: ", mat.arredondar (resultado,2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */