package tarefa4e5;

import java.util.ArrayList;
import java.util.List;

public abstract class Manada {
	
	protected List<Animal>ListAnimal= new ArrayList<Animal>();

		public abstract String estourar();
		
		
		public void adicioarAnimal(Animal a){
			ListAnimal.add(a);
			
		}

	

}
