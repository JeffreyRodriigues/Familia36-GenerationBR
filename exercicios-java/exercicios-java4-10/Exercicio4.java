package Familia36;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n,p=0,i=0; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero: ");
		n = leia.nextDouble();
		
		if(n % 2 == 0 )
		{
			System.out.println("\nO n�mero digitado � par, portanto...");
			
			p = Math.sqrt(n);
			
			System.out.printf("\nA ra�z quadradada de " +n + " �: %2.2f" ,p);
		}
		else 
		{
			System.out.println("\nO n�mero digitado � impar, portanto...");
			
			i = Math.pow(n, 2.0);
			
			System.out.printf("\nA pot�ncia de " +n + " �: %2.2f" ,i);
		}

	}

}
