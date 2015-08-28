package aula04_8_VetoresListasMapas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nomes = new ArrayList<String>();//decorar


		nomes.add("Babi");
		nomes.add("Gouvea");
		nomes.add(0, "Barbara");


		String [] aux= {"Leo", "Diana"};
		List<String> nomes2 = Arrays.asList(aux);//decorar

		System.out.println(nomes.size());
		System.out.println(nomes);
		nomes.remove("Babi");
		nomes.addAll(nomes2);//concatena lista
		System.out.println(nomes);
		System.out.println(nomes2);


		for (String n:nomes)
		{
			System.out.println(n);

		}
	}
	// se tiver dois iguais remove só o primeiro


}
