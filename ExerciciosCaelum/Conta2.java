package ExerciciosCaelum;

	class Conta2 {
	
		int numero;
		String dono;
		double saldo;
		double limite;
		double salario;
	
		void saca(double quantidade) {
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			}
		void deposita(double quantidade) {
			this.saldo += quantidade;	
			}

		class Programa{
			public static void main(String[] args) {
				new Conta2();
			}
		}
		public static void main(String[] args) {
			//criando a conta
			Conta2 minhaConta;
			minhaConta = new Conta2();

			//alterando os valores de minhaConta
			minhaConta.dono = "Duke";
			minhaConta.saldo = 1000;

			//saca 200 reais
			minhaConta.saca(200);

			//deposita 500 reais
			minhaConta.deposita(500);
			System.out.println(minhaConta.saldo);
	
			}
	}
