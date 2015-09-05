package tarefa5e6GatoCachorroManada;

import tarefa4e5.Animal;

public class ManadaSustenido extends Manada {
	String teste="";

	@Override
	public String estourar() {
		for (Animal ani:ListAnimal){
			teste+=ani.fazerBarulho()+ "# "; 	
		}
		return teste;
	
	}

}
