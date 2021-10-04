package Familia36;

import java.util.Scanner;

public class Exercicio2l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,o;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nInsira o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nInsira o terceiro número: ");
		c = leia.nextInt();
		
		if(a < b && b < c)
		{
			System.out.println( "\t"+a +"\t" +b +"\t"+c);
		}
		else if(b < a && b < c )
		{
			System.out.println( "\t"+b +"\t"+a +"\t"+c);
		}
		else if(b < c && c < a)
		{
			System.out.println( "\t"+b +"\t"+c +"\t"+a);
		}
		else if(c < b && c < a)
		{
			System.out.println( "\t"+c +"\t"+b +"\t"+a);
		}
		else if(c < a && c < b)
		{
			System.out.println( "\t"+c +"\t"+a +"\t"+b);
		}
		else
		{
			System.out.println("\t"+a +"\t" +c +"\t" +b);
		}

	}

}
