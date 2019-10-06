package Banco;
import java.util.Date;

public class Pagamento extends Transacao{
	
	private String boleto;

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return super.getValor();
	}
	@Override
	public Date getData() {
		// TODO Auto-generated method stub
		return super.getData();
	}
	public String getBoleto() {
		return boleto;
	}
	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}
	
	
	
}
