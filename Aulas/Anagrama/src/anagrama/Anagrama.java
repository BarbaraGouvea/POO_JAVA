package anagrama;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagrama {
	public static boolean saoAnagramas (String a, String b){
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		/*if (a.equals(b)){
			return false
		return True*/
	List<Character>lista1= new ArrayList<Character>();
	List<Character>lista2= new ArrayList<Character>();

	for (char c: a.replace(" ", "").toCharArray())
	{
		lista1.add(c);
	}

	for (char c: b.replace(" ", "").toCharArray())
	{
		lista2.add(c);
	}
	//Collections.sort(lista)não pode usar pra ordenar
	//Collections.sort(lista2)
	return lista1.containsAll(lista2) && lista1.size()==lista2.size();
	//return string.replace(" ", "").equals(a.replace(" ", ""));
	}

	
}
