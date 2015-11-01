package tarefa4e5;

	public class Animal implements Comparable<Animal>{
			public String raca;
			public String nome;
			public int idade;
			public float peso;
		
		public Animal (String raca,String nome, int idade, float peso){
			this.raca=raca;
			this.nome=nome;
			this.idade=idade;
			this.peso=peso;
			
			
		}
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}
		
		@Override
		public String toString(){
			return "Nome: "+nome+ ", Raça: "+raca+", Idade: "+idade+", Peso: "+peso;
		}
		
		public String fazerBarulho(){
			return "O barulho feito pelo animal é: ";
			
			
		}
		@Override
		public int compareTo(Animal comparando){
			if(this.peso<comparando.getPeso())return -1;
			if (this.peso> comparando.getPeso())return 1;
			return 0;
		}
		
}
