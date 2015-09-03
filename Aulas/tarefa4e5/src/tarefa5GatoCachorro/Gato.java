package tarefa5GatoCachorro;

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
