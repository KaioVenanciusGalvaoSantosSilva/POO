package aula01.No;

public class aula1No {

	public static void main(String[] args) {
	
		No primeiro = new No();
		
		No ultimo = primeiro;
		
		int count = 0;
		
		while (true) {
			
		No outro = new No();
		System.out.println("NO " +count++);
		
		ultimo.proximo = outro;
		
		ultimo = outro;
		//primeiro.proximo = outro;
		}		
	}
}


