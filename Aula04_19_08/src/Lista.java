import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nomes = new ArrayList<String>();//decorar
		
		System.out.println(nomes.size());
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
	//

}
