package tarefa5GatoCachorro;

import tarefa4e5.Animal;

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
