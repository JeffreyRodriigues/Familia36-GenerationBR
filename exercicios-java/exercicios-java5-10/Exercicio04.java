package Familia36;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int cont=0, idade, sexo, temperamento;
		int tcalmos=0, mnervosas=0, hagressivos=0, ocalmos=0, nacima40=0, cmenor18=0;
		
			while(cont <= 2) {
			System.out.println("\nInforme a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Esolha umas das opções: ");
			System.out.println("\t1 Feminino"+"\t2 Masculino" + "\t3 Outros");
			sexo = leia.nextInt();
			
			System.out.println("Qual o temperamento da pessoa? ");
			System.out.println("\t1 Calme"+"\t2 Nervose" + "\t3 Agressive");
			temperamento = leia.nextInt();
			
			if(temperamento == 1) {
				tcalmos++; //pessoas calmas
			}
			if(sexo == 1 && temperamento == 2) {
				mnervosas++; //mulheres nervosas
			}
			if(sexo == 2 && temperamento == 3) {
				hagressivos++; //homem agressivo
			}
			if (sexo == 3 && temperamento == 3) {
				ocalmos++; //outros calmos
			}
			if (temperamento == 2 && idade >= 40) {
				nacima40++; //nervosos acima de 40
			}
			if(temperamento == 1 && idade <= 18) {
				cmenor18++; //calmos abaixo de 18
			}
			cont++;
		}
		System.out.println("O número de pessoas calmas é de: " +tcalmos);
		System.out.println("O número de mulheres nervosas é de: " +mnervosas);
		System.out.println("O número de homens agressivos é de: " +hagressivos);
		System.out.println("O número de outro calmos é de: " +ocalmos);
		System.out.println("O número de pessoas nervosas com +40 anos é de: " +nacima40);
		System.out.println("O númro de pessoas calmas com -18 anos é de: " +cmenor18);
	}

}
