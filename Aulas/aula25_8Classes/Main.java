package aula25_8Classes;


public class Main {
	public static void main (String[]args){
		
		Pessoa pessoa=new Pessoa("Babi");
				
		Pessoa Barbara = new Pessoa("BarbaraGouvea");
		
		//Pessoa.olhos=3; Aqui é pela classe
		//Barbara.olhos=3 Aqui é pelo objeto
		
		System.out.println(pessoa.nome);
		System.out.println(Barbara.nome);
		System.out.println(Barbara.cumprimentar());
		System.out.println(pessoa.cumprimentar());
	}

}
