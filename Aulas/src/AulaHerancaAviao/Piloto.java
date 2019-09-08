package AulaHerancaAviao;

public class Piloto extends Pessoa{

	String patente;
	int horasVoo;
	String breve;
	
	public Piloto(){ 
		super("Roger");
	}
	
	public void pilotar() { 
		System.out.println("Piloto " + 
				nome + " esta Pilotando o avião.");
		horasVoo += 10;
	}
}