package ExercicioHeranca;

public class TesteAnimal {

	public static void main(String[] args) {
		// nome, int idade, som, correr
		
		Cachorro cachorro1 = new Cachorro("Cachorro Bilu",5,"Auauau","Parque");
		cachorro1.imprimirInfo();
		Cavalo cavalo1 = new Cavalo("Cavalo Fujão",8,"IHIHIHIHI","Campo","Cerca");
		cavalo1.imprimirInfo();
		Preguica preguica1 = new Preguica("Preguiça Melissa",15,"UUUUUUUUUUUONNNNN","Árvore");
		preguica1.imprimirInfo();

	}

}
