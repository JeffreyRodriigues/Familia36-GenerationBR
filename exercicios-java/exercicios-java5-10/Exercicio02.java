package Familia36;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o impares
		
		Scanner leia = new Scanner(System.in);	
		int numero,par=0,impar=0;
		
		for(int x = 1 ; x<=10; x++) {
		System.out.println("Digite o " + x + "� n�mero");
		numero = leia.nextInt();	

		if(numero % 2 == 0) {
			par++;
		}
		else {
			impar++;
		}

		}
		System.out.println("Foram digitados " + par + " n�meros pares, e " + impar + " n�meros impares! ");
	}		
}

