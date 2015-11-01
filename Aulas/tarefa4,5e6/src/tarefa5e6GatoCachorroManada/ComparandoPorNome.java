package tarefa5e6GatoCachorroManada;

import java.util.Comparator;

import tarefa4e5.Animal;

public class ComparandoPorNome implements Comparator<Animal> {

	@Override
	public int compare(Animal anim, Animal compOutro){
		return anim.getNome().compareTo(compOutro.getNome());
	}

}
