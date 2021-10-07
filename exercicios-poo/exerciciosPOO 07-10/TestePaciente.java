package POO;

public class TestePaciente {

	public static void main(String[] args) {
		// nome, altura , peso, idade, temperatura
		
		Paciente paciente1 = new Paciente("Jeffrey","Rodrigues","Innocencio",182,95,28,32);
		paciente1.imprimirInfo();
		paciente1.testeFebre();

	}
}
