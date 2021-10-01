package Familia36;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		
		int anos, meses, dias, calculoano, calculomeses, calculodias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
		anos = leia.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		meses = leia.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		calculoano = anos*365;
		calculomeses = meses*30;
		calculodias = calculoano+calculomeses+dias;
		
		System.out.println("O valor total da idade em dias é: " +calculodias);
		
	}

}
