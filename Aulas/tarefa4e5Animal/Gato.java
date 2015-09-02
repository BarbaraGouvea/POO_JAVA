package tarefa4e5;

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
