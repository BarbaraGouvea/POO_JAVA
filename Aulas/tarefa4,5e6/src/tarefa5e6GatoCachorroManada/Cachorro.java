package tarefa5e6GatoCachorroManada;

import tarefa4e5.Animal;

public class Cachorro extends Animal{
				
		public Cachorro (String raca,String nome, int idade, float peso){
			super(raca, nome, idade, peso);
		}
		
		
		@Override
		public String fazerBarulho()
		{
			
			return "Au";
		}
	}
