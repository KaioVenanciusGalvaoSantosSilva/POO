package AulaHerancaAviao;



public class Passageiro extends Pessoa{

	String passaporte;
	int ticket;
	String destino;
	
	public Passageiro(String n, int t) { 
		super(n);
		ticket = t;
	}
	public void embarcar() { 
		System.out.println("Passageiro " +
				nome + " embarcando com o ticket " + ticket);
		viajar();
	}
}