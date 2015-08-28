package aula25_8Classes;


public class Pessoa {
	static final int OLHOS=2;	
	public String nome;
	
	public String cumprimentar(){
		return "Olá, meu nome é " +this.nome+ "Tenho olhos = "+ this.OLHOS;
	
		//return "Olá, meu nome é " +nome ou this.nome
	//cumprimentarOutraPessoa -> CameeoCase primeira minuscula e as outrasem maiuscula.
	}
	public Pessoa(String nome){
		System.out.println("Método Construtor");
		this.nome=nome;
	}

}

