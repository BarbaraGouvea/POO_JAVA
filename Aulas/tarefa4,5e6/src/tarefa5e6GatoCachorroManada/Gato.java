package tarefa5e6GatoCachorroManada;

import tarefa4e5.Animal;

public class Gato extends Animal{
	
	public Gato (String raca, int idade, float peso){
		super(raca, idade, peso);
	}
	
	
	@Override
	public String fazerBarulho()
	{
		
		return "Miau";
	}
}
