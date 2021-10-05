package ExerciciosCaelum;

	class Conta {
		int numero;
		String dono;
		double saldo;
		double limite;
		double salario;
	
	class Programa{
		public static void main(String[] args) {
			new Conta();
		}
	}
		
	public static void main(String[] args) {	
		Conta minhaConta;
		minhaConta = new Conta();
			
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
			
		System.out.println("Saldo atual: " + minhaConta.saldo);
		}
	}


