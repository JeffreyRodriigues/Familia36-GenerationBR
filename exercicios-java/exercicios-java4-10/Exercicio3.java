package Familia36;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		
		if(idade >=18 && idade <=25) 
		{
			System.out.println("\nVocê é da categoria adulta!");
		}
		else if (idade >=15 && idade <=17)
		{
			System.out.println("\nVocê é da categoria juvenil!");
		}
		else if (idade >=10 && idade <=14)
		{
			System.out.println("\nVocê é da categoria infantil!");
		}
		else if (idade > 25 || idade < 10)
		{
			System.out.println("\nO candidato não se encontra em nenhuma categoria! ");
		}

	}

}
