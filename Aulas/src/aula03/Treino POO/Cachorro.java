package aula03.Treino;

public class Cachorro {// CLasse Cachorro
//a partir de  objetos comuns, crie 3 classes, abstraindo ao menos 5 caracteristicas e 3 comportamentos para cada uma.
//crie o c�digo em gjava para estas classes
		
	//caracteristicas
		float peso;
		int idade;
		String cor;
		int filhos;
		String Sexo;
	
		//comportamentos
		public String latir(){//Metodo
		
			String som = "Skavuska";
			return som;
		}
		
		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		//comportamentos
		public static Boolean dormir() {
			
			Boolean sono =  true;
			return sono;
		}
		
		//comportamentos
		public int Reproduzir() {
			
			int fazerFilhos = 1000;
			return fazerFilhos;
		}	
}