package ExercicioCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n*******BEM VINDO AO ESTOQUE DA LOJA GENERATION*******");
			System.out.println("\n[1] Você deseja adicionar algum produto?");
			System.out.println("\n[2] Você deseja remover algum produto?");
			System.out.println("\n[3] Você deseja atualizar algum produto?");
			System.out.println("\n[4] Veja quais produtos você tem no estoque: ");
			System.out.println("\n[99] Deseja sair do programa?");
			System.out.println("\nDigite uma das opções: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto que você deseja adicionar: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que você deseja remover: ");
				String saida = leia.nextLine();
				if(estoque.contains(saida))
				{
					estoque.remove(saida);
				}
				else
				{
					System.out.println("Não existe este produto no estoque, portanto não é possível remover!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o nome do produto que você quer atualizar: ");
				String analisar = leia.nextLine();
				System.out.println("\nAgora digite o nome do produto que você quer que entre no lugar de " +analisar+ " :");
				String novo = leia.nextLine();
				if(estoque.contains(analisar))
				{
					estoque.remove(analisar);
					estoque.add(novo);
				}
				else
				{
					System.out.println("Não existe este produto no estoque, portanto não é possível alterar!");
				}
			case 4:
				//leia.nextLine();
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nOpção inválida! \nDigite um dos números que se encontram no menu: ");
				
			}

		}
		while(op!=0);
		

}
}
