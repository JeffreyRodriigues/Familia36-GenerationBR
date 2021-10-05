/*Solicitar a idade de várias pessoas e imprimir: 
* Total de pessoas com menos de 21 anos. 
* Total de pessoas com mais de 50 anos. 
O programa termina quando idade for =-99. (WHILE)*/
		
package Familia36;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		int idade, menor=0, maior=0;;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nPara parar o programa, digite -99");
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			if(idade >=0 && idade <=21) {
				menor++;
			}
			else if (idade >= 50 && idade <= 100){
				maior ++;
			}
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
		}
		System.out.println("A quantidade de idade menor que 21 é  " +menor + " e de maior que 50 é " +maior);
	
	}

}
