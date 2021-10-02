package Familia36;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		int diaA, mesA, anoA, diaN, mesN, anoN, dias=0;
		String nome;
		
		diaA = 1;
		mesA = 10;
		anoA = 2021;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome ");
		nome = ler.next();
		
		System.out.println("\nInsira a sua data em dia: ");
		diaN = ler.nextInt();
		System.out.println("\nInsira a sua data em mês: ");
		mesN = ler.nextInt();
		System.out.println("\nInsira a sua data em ano: ");
		anoN = ler.nextInt();
		
		while(anoN < anoA || mesN < mesA || diaN < diaA) {
			dias++;
			diaN++;
			if(diaN > 30) {
				diaN = 1;
				mesN++;
				if(mesN > 12) {
					anoN++;
					mesN = 1;
				}
				
			}
		}
		System.out.println("\nOla " + nome + "você viveu " + dias +" dias ");


	}

}
