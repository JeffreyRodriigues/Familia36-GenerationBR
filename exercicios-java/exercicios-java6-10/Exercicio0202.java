package Familia36;

import java.util.Scanner;

public class Exercicio0202 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				int numeros[] = new int [6];
				int v,contpar=0, contimpar=0;
				
				Scanner leia = new Scanner(System.in);
				
				for(v=0 ; v<6 ; v++){
					System.out.println("\nDigite um número: ");
					numeros[v] = leia.nextInt();
				
				if(numeros[v] % 2 == 0) {
					contpar++;
				}
				else {
					contimpar++;
				}	
				}

				System.out.println("\nA quantidade de números impares digitos é de: " +contimpar);
	}
}
