package Familia36;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		c = leia.nextInt();
		
		if(a > b)
		{
			if(a > c)
				maior = a;
			else
				maior = c;

		}
		else {
			if(b > c)
				maior = b;
			else
				maior = c;
		}
		
		System.out.println("O maior valor digitado é: " +maior);
	}

}
