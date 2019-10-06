package Banco;
import java.util.Date;

public class Transacao {

	//public static void main(String[] args) {
	//}

	private double valor = 0;
	 Date data = new Date();
	 //System.out.println("Data Agora: "+data);
	 
	public double getValor() {
		return valor;
	}
	public double setValor(double valor) {
		return this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date l) {
		this.data = l;
	}
	 
}
