package tarefa5e6GatoCachorroManada;

import tarefa4e5.Animal;

public class Gato extends Animal{
	
	public Gato (String raca,String nome, int idade, float peso){
		super(raca, nome,idade, peso);
	}
	
	
	@Override
	public String fazerBarulho()
	{
		
		return "Miau";
	}
}
