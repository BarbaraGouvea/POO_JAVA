package tarefa5e6GatoCachorroManada;

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
