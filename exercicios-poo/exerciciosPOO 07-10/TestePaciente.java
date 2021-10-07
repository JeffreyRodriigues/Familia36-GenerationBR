package POO;

public class TestePaciente {

	public static void main(String[] args) {
		// nome, altura , peso, idade, temperatura
		
		Paciente paciente1 = new Paciente("Jeffrey","Rodrigues","Innocencio",182,95,28,38);
		Paciente paciente2 = new Paciente("João","Fernandes","Silva",182,95,28,35);
		Paciente paciente3 = new Paciente("Fred","Campos","Jordão",182,95,28,36);
		Paciente paciente4 = new Paciente("Foguinho","Silva","Sauro",182,95,28,42);
		
		paciente1.imprimirInfo();
		paciente1.testeFebre();
		paciente2.imprimirInfo();
		paciente2.testeFebre();
		paciente3.imprimirInfo();
		paciente3.testeFebre();
		paciente4.imprimirInfo();
		paciente4.testeFebre();

	}
}
