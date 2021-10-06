package Familia36;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float A[][] = new float[2][2];
		float B[][] = new float[2][2];
		float AB[][] = new float[2][2];
		float soma, sub; 
		int linhaA, colunaA, linhaB, colunaB;
		
		for(linhaA=0 ; linhaA<2 ; linhaA++) {
			for(colunaA=0 ; colunaA<2 ; colunaA++) {
				
				System.out.println("\nDigite os valores do Vetor A: ");
				A[linhaA][colunaA] = leia.nextInt();
			}
		}
				for(linhaB=0 ; linhaB<2 ; linhaB++) {
					for(colunaB=0 ; colunaB<2 ; colunaB++) {
						
						System.out.println("\nDigite os valores do Vetor B: ");
						B[linhaB][colunaB] = leia.nextInt();
						
					}
				}
			}
	}


