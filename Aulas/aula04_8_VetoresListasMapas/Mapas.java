
package aula04_8_VetoresListasMapas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
		public static void main(String[] args) {
			Map<String, String>paises= new HashMap<String, String>();
			paises.put("Brasil", "Portugues");
			paises.put("Argentina", "Espanhol");
			System.out.println(paises.get("Argentina"));
			System.out.println(paises.containsKey("Argentina"));
			paises.remove("Argentina");
			paises.remove("Argentina");//pra ver se dá pau se tentar remover um que ja não tem mais

			for (String chave: paises.keySet())
			{
				System.out.println(chave+":"+paises.get(chave));
			}



			// TODO Auto-generated method stub

		}



}
