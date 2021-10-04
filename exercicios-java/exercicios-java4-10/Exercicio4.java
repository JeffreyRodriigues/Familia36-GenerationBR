package Familia36;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n,p=0,i=0; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		n = leia.nextDouble();
		
		if(n % 2 == 0 )
		{
			System.out.println("\nO número digitado é par, portanto...");
			
			p = Math.sqrt(n);
			
			System.out.printf("\nA raíz quadradada de " +n + " é: %2.2f" ,p);
		}
		else 
		{
			System.out.println("\nO número digitado é impar, portanto...");
			
			i = Math.pow(n, 2.0);
			
			System.out.printf("\nA potência de " +n + " é: %2.2f" ,i);
		}

	}

}
