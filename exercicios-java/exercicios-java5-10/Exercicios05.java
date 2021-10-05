package Familia36;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, x=0;
		
		System.out.println("Para parar o programa, digite 0");
		
		do {
			System.out.println("Digite um valor: ");
			numero = leia.nextInt();
			x += numero;
			
		}
		while (numero != 0);
		System.out.println("A soma dos valores digitados é igual a: " +x);
	}

}
