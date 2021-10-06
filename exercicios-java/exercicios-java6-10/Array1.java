package Familia36;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float media[] = new float [4];
		float somamedia=0, n1, n2, n3, mediageral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0 ; x<4 ; x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3) / 3;
			
			System.out.printf("\nMédia alune %d: %2.2f" ,x+1,media[x]);
			somamedia += media[x];
		}
		mediageral = somamedia / 4;
		System.out.println("\nA média geral é de: " +mediageral);
	}

}
