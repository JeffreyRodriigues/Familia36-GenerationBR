package Familia36;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[][] = new int [2][3];
		int linha,coluna,contpar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);

		
		
		for(linha=0 ; linha<2 ; linha++) {
			for(coluna=0 ; coluna<3 ; coluna++)
			{
				System.out.println("\nDigite um número: ");
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] % 2 == 0) {
					contpar++;
				}
				else {
					contimpar++;
				}
			}
		}
		System.out.println("\nTemos: "+contpar+" números pares");
		System.out.println("\nTemos: "+contimpar+" números ímpares");
	}
}
