package tarefa5e6GatoCachorroManada;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import tarefa4e5.Animal;

public class Main{
	
	public static void main (String []args){
		
	Cachorro dog = new Cachorro ("Pincher","Maylon", 9,15 );
	Cachorro dog2 = new Cachorro ("Dalmata","Pluto", 3,25 );
	Cachorro dog1 = new Cachorro ("Labrador","Rex", 5,30 );
	
	Gato cat = new Gato ("Siames","Nina", 2, 5 );
	Gato cat2 = new Gato ("Sem raça", "Junior",5, 10 );
	Gato cat1 = new Gato ("Persa","Juju", 5,20 );
	
	Animal vetAnimais[]= {dog, dog1,dog2, cat, cat1, cat2};
	
	/*for (int i=0; i<vetAnimais.length; i++){
		System.out.println("Raça: "+vetAnimais[i].raca+" Idade: "+vetAnimais[i].idade+ " Peso: "+vetAnimais[i].peso+"\n" );
		//System.out.println("\n");
	}
	System.out.println(dog.fazerBarulho());
	System.out.println(dog1.fazerBarulho());
	
	System.out.println(cat.fazerBarulho());
	System.out.println(cat1.fazerBarulho());*/
	
	
	ManadaVirgula mvirgula = new ManadaVirgula();
	ManadaSustenido msustenido = new ManadaSustenido();
	
	mvirgula.adicioarAnimal(cat);
	mvirgula.adicioarAnimal(cat1);
	mvirgula.adicioarAnimal(cat2);
	mvirgula.adicioarAnimal(dog);
	mvirgula.adicioarAnimal(dog1);
	mvirgula.adicioarAnimal(dog2);
	
	msustenido.adicioarAnimal(cat);
	msustenido.adicioarAnimal(cat1);
	msustenido.adicioarAnimal(cat2);
	msustenido.adicioarAnimal(dog);
	msustenido.adicioarAnimal(dog1);
	msustenido.adicioarAnimal(dog2);
		
	
	System.out.println(msustenido.estourar());
	System.out.println(mvirgula.estourar());
	
	System.out.println("\n***********************************");
	
	
	System.out.println("ORDENAÇÃO POR PESO");
	
	System.out.println("***********************************\n");
	
	Collections.sort(msustenido.ListAnimal);
	for  (Animal ani:msustenido.ListAnimal)
	{
		System.out.println(ani+"\n");
		
	}
	
	
	System.out.println("\n***********************************");
	
	
	System.out.println("ORDENAÇÃO POR NOME");
	
	System.out.println("***********************************\n");
	
	ComparandoPorNome teste = new ComparandoPorNome();
	Collections.sort(msustenido.ListAnimal, teste);
	for (Animal an:msustenido.ListAnimal){
		System.out.println(an+"\n");
	}
	
	
	
	
	
	 
	
	}
}
	

