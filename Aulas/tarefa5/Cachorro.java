package tarefa5;
import package tarefa4Animal;
public class Cachorro extends Animal{
	public Cachorro (String raca, int idade, float peso){
		super(raca, idade, peso);
	}
	@Override
	public void fazerBarulho()
	{
		System.out.println("Au, Au");
	}

}
