package aula04_8_VetoresListasMapas;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vet_inteiros=new int [6];

		for (int i: vet_inteiros){
			System.out.println(i);
		}
		//String [] nomes= new String [10];
		//String [] nomes= new String [2];
		//nomes[0]="BAbi";
		//nomes[1]="Gouvea";
		String []nomes={"Babi","Gouvea"};

		for (String n:nomes){
                System.out.println(n);
        }
        System.out.println(nomes.length);

		// int inteiros []=new int [6];
		// int [] inteiros []=new int [6] -> É matriz

	}
	
	
}
