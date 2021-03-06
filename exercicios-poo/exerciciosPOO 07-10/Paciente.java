package POO;

	public class Paciente {
	
		private String nome;
		private String sobreNome;
		private String ultimoNome;
		private float temperatura;
		private float altura;
		private float peso;
		private int idade;
		
		public Paciente (String nome, String sobreNome, String ultimoNome, float altura, float peso, int idade, float temperatura)
		{
			this.nome=nome;
			this.sobreNome=sobreNome;
			this.ultimoNome=ultimoNome;
			this.altura=altura;
			this.peso=peso;
			this.idade=idade;
			this.temperatura=temperatura;
		}
		
		public String getNomeCompleto()
		{
			String nomeCompleto = nome+ " " +sobreNome+ " " +ultimoNome;
			return nomeCompleto;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\nNome do paciente: " +this.getNomeCompleto() + "\nAltura do paciente: "+altura+ "\nPeso: "+peso+ " KG" + "\nIdade: "+idade+ "\nTemperatura: " +temperatura+" ?C");
		}
		
		public void testeFebre() { 
			if(temperatura>40) {
				System.out.println("O paciente est? HIPERTERMIA, e precisa de medica??o URGENTE!");
			}
			else if(temperatura>37.5 && temperatura<=40) {
				System.out.println("O paciente est? com febre, e precisa de medica??o!");
			}
			else if(temperatura<=35.9)
			{
				System.out.println("O paciente est? com HIPOTERMIA, e precisa de cuidados urgente!");
			}
			else {
				System.out.println("O paciente est? liberado!");
			}

		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getTemperatura() {
			return temperatura;
		}

		public void setTemperatura(float temperatura) {
		
			this.temperatura = temperatura;
		}
		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

	}
	
	

