package Familia36;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		// Leia idade em dias, e mostre em dias,meses e anos 
		
		int ano, mes, dias, contdias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digita a sua idade em dias: ");
		contdias = leia.nextInt();
		
		ano = contdias/365;
		mes = (contdias%365)/30;
		dias = (contdias%365)%30;
		
		System.out.println("Você tem " +ano + " anos " +mes + " meses e " +dias + " dias ");

	}

}
