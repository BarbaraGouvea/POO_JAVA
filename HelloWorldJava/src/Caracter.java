
public class Caracter {
	public static void main (String []args){
	//char c='A';
	//int i=c;
		char aMaiusculo='A';
	//System.out.println(i);
	for (int i=aMaiusculo;i<aMaiusculo+26;++i)
		//for (int i= 3000; i<3026;i++)
	{
		System.out.println(i+" - "+ ((char) i));
	}
		
	String nome="Babi";
	System.out.println(nome+" Gouvêa");
	//cuidado String s=1+" "+1; Não vale multiplicar só concatenar msmo.
	String s=1+1+"";
	s=null;
	System.out.println(s);
	
	//int i=null dá erro porque os primitivos em Java não são objetos.É orientada a objeto mas nem tudo e objeto
	// 7 primitivos: byte short int long double char String 
	// compilar: transformar em codigo de maquina. custuma ser mais rapido
	
	}
	

}
// se eu jogar um inteiro no char ele tambem converte.
