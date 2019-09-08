package aula03.Treino;

public class Principal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		
		cachorro.filhos = cachorro.Reproduzir();//atribuindo valor a filhos de acordo com o Metodo reproduzir
		System.out.println(cachorro.filhos);//imprimindo
		
		//Criando gets e sets
		cachorro.setIdade(15);
		System.out.println(cachorro.getIdade());
	}
}