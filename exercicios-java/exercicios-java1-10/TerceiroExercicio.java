package Familia36;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		
		int horas, minutos, segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite quantos segundos de dura��o o evento ter�: ");
		segundos = leia.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		System.out.println("O evento tem " +horas +" horas " +minutos +" minutos e " +segundos +" segundos");

	}

}
