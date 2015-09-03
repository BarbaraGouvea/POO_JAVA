package tarefa5GatoCachorro;

import tarefa4e5.Animal;

public class Main{
	
	public static void main (String []args){
		
	Cachorro dog = new Cachorro ("Pincher", 9,15 );
	Cachorro dog1 = new Cachorro ("Labrador", 5,20 );
	
	Gato cat = new Gato ("Siames", 2, 5 );
	Gato cat1 = new Gato ("Persa", 5,20 );
	
	Animal vetAnimais[]= {dog, dog1, cat, cat1};
	
	for (int i=0; i<vetAnimais.length; i++){
		System.out.println("Raça: "+vetAnimais[i].raca+" Idade: "+vetAnimais[i].idade+ " Peso: "+vetAnimais[i].peso );
		System.out.println("\n");
	}
	System.out.println(dog.fazerBarulho());
	System.out.println(dog1.fazerBarulho());
	
	System.out.println(cat.fazerBarulho());
	System.out.println(cat1.fazerBarulho());
	

	
	
	
	
	
	 
	
	}
}
	

