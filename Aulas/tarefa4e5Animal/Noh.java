package tarefa4e5;

public class Noh {
	
		public Object valor=null;
		public Noh prox=null;
		
		public Noh (Object valor){
			super();
			this.valor=valor;
		}
			
		
		public static void main (String []args)
		{
			Noh cabeca= new Noh("a");
			cabeca.adicionarFinal("b");
			cabeca.adicionarFinal("c");
			System.out.println(cabeca);		
		}



		private void adicionarFinal(Object nome)
		{//tipo nome
			if(this.prox==null){
				prox=new Noh(nome);
			}
			else {
			 prox.adicionarFinal(nome);
			}
		}
			
		@Override
		public String toString()
		{
			String str="";
			str+=this.valor;
			if (prox!=null)
			{
				str+=prox.toString();
			}
		return str;
		}
	}
	
	
