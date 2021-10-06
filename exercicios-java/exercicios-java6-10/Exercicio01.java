package Familia36;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetorA [] = {1,0,5,-2,-5,7};
		int soma=0;
		
		
			for(int x=0; x<vetorA.length; x++ ) {
				soma = vetorA[0] + vetorA[1] + vetorA[5];
				vetorA[4] = 100;
			}	
			
			System.out.println("A soma dos vetores é: " +soma);
			System.out.println("\nO valor do vetor[4] é: " +vetorA[4] + "\n");
			
			for(int i=0 ; i<vetorA.length ; i++) {
				System.out.println(""+"Os valores de vetor são: " +vetorA[i]);
			}
		}
	}

