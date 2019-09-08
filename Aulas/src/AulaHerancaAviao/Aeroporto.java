package AulaHerancaAviao;

public class Aeroporto {
	
	String aeroporto = "GRU - AirLINES";
	Aeronave a1 = new Aeronave();
	Aeronave a2 = new Aeronave();	
	Piloto piloto1 = new Piloto();
	Piloto piloto2 = new Piloto();

	Passageiro p1 = new Passageiro("João Silva", 1001);
	Passageiro p2 = new Passageiro("Maria Alves", 1002);
	Passageiro p3 = new Passageiro("Alberto Gonçalves", 1003);
	Passageiro p4 = new Passageiro("Julia Santos", 1004);
	
	
	public Aeroporto() {
		
		a1.embarcar(p1, p2);
		a1.piloto = piloto1;
		a1.decolar();
		
		a2.embarcar(p3, p4);
		a2.piloto = piloto2;
		a2.decolar();
	}
	
	public static void main(String[] args) {
		Aeroporto aeroporto = new Aeroporto();
		System.out.println(aeroporto.aeroporto);
	}
}