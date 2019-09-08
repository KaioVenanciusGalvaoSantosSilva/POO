package AulaConstrutor;

public class Aluno {

	String ra;
	String nome;

	public Aluno(String ra, String nome) {

		this.nome = nome;
		this.ra = ra;
		System.out.println("Aluno criado com sucesso.");
	}

	public Aluno(String nome) {
		this("123", nome);// evocando outro construtor

	}

	public Aluno() {
		this("123", "Nome não definido");// evocando outro construtor

	}
}