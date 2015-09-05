package tarefa5e6GatoCachorroManada;
import tarefa4e5.Animal;

import java.util.ArrayList;
import java.util.List;

import tarefa4e5.Animal;

public abstract class Manada {
	
	protected List<Animal>ListAnimal= new ArrayList<Animal>();

		public abstract String estourar();
		
		
		public void adicioarAnimal(Animal a){
			ListAnimal.add(a);
			
		}

	

}
