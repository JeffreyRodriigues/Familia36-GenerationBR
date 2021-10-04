package Familia36;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,o;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		if(a >= b) // A>B>C
		{
			o = a; 
			a = b; 
			b = o; 
		}
		if(b >= c) //B>C>A
		{
			o = b; 
			b = c; 
			c = o; 
		}
		if (a >= b) 
		{
			o = a;
			a = b;
			b = o;
		}
		System.out.println("\nSegue valores em ordem crescente: " + "\n" +a +"\t" +b +"\t" +c);

	}

}
