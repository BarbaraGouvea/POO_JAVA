package aula25_8Classes;


public class Pessoa {
	static final int OLHOS=2;	
	public String nome;
	
	public String cumprimentar(){
		return "Ol�, meu nome � " +this.nome+ "Tenho olhos = "+ this.OLHOS;
	
		//return "Ol�, meu nome � " +nome ou this.nome
	//cumprimentarOutraPessoa -> CameeoCase primeira minuscula e as outrasem maiuscula.
	}
	public Pessoa(String nome){
		System.out.println("M�todo Construtor");
		this.nome=nome;
	}

}

