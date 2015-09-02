package tarefa4e5;
	
	public class Cachorro extends Animal{
		
		public Cachorro (String raca, int idade, float peso){
			super(raca, idade, peso);
		}
		
		
		@Override
		public String fazerBarulho()
		{
			
			return "Au";
		}
	}
