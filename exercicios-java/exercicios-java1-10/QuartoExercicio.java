package Familia36;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		
		int a,b,c;
		double r,s,d;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a =  leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		b =  leia.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c =  leia.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.println("\nO Valor de R é : " +r +"\nO Valor de S é: " +s +"\nPortanto o valor de D é: " +d);
		
	}

}
