package Familia36;

import java.util.Scanner;

public class Exercicio2l {

	public static void main(String[] args) {
		/*
		 Menor		Meio		Maior 
		 A			B			C
		 A			C			B
		 B			A			C
		 B			C			A
		 C			A			B
		 C			B			A
		 */
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nInsira o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nInsira o terceiro número: ");
		c = leia.nextInt();
		
		if(a <= b && b <= c)
		{
			System.out.println( "\t"+a +"\t" +b +"\t"+c);
		}
		else if(a <= c && c <= b )
		{
			System.out.println( "\t"+a +"\t"+c +"\t"+b);
		}
		else if(b <= a && a <= c)
		{
			System.out.println( "\t"+b +"\t"+a +"\t"+c);
		}
		else if(b <= c && c <= a)
		{
			System.out.println( "\t"+b +"\t"+c +"\t"+a);
		}
		else if(c <= a && a <= b)
		{
			System.out.println( "\t"+c +"\t"+a +"\t"+b);
		}
		else
		{
			System.out.println("\t"+c +"\t" +b +"\t" +a);
		}

	}

}
