package ExercicioHeranca;

public class TesteAnimalPoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CachorroPoli cachorro = new CachorroPoli();
		CavaloPoli cavalo = new CavaloPoli();
		PreguicaPoli preguica = new PreguicaPoli();
		AnimalPoli animal = null;
		
		
		
		int n = (int) (Math.random()*3.0);
		
		System.out.println("\nO animal escolhido foi: " + "\n"+n + "\t");
		
		switch(n)
		{
		case 0: animal = cachorro;
		System.out.println("\nO cachorro");
		break;
		case 1: animal = cavalo;
		System.out.println("\nO cavalo");
		break;
		case 2: animal = preguica;
		System.out.println("\nA preguiça");
		break;
		default: System.out.println("\nErro inesperado...");
		}
		
		if(animal!=null)
		{
			animal.som("");
		}

	}

}
