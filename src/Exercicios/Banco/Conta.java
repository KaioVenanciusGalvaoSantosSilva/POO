package Banco;
import java.util.Date;

import javax.swing.JOptionPane;

public class Conta extends Transacao {

	private double saldo;
	private String numero = "1";
	private String senha= "1";
	Transacao historico = new Transacao();// Fiquei na duvida => historico:Trancacao[]

	public boolean efetuarSaque() {

		// valor a ser sacado

		saldo = setValor(getValor() - 100);

		return true;
	}

	public boolean efetuarDeposito() {
		// valor a ser depositado
		saldo = setValor(getValor() + 100);

		return true;
	}

	public boolean efetuarPagamento() {
		Pagamento pagamento = new Pagamento();

		pagamento.getBoleto();

		// Definindo valor
		setValor(100);
		saldo = saldo - getValor();
		return true;
	}

	@SuppressWarnings("deprecation")

	public Transacao[] extrato() {
		// Duvida de como coletar os valores de inicio e de fim das tarefas realizadas.
		Date inicio = new Date();
		inicio.setDate((int) getData().getTime());

		Date fim = new Date();
		fim.setDate((int) getData().getTime());

		System.out.println(inicio);
		System.err.println(fim);

		return null;
	}

	public void Menu() {

		int opc = 0;

		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - efetuar Saque \n 2 - efetuar Deposito \n "
					+ " 3 - efetuar Pagamento \n  4 - Extrato " + "\n 9 - Voltar"));
			switch (opc) {

			case 1:
				efetuarSaque();
				break;
				
			case 2:
				efetuarDeposito();
				break;
				
			case 3:
				efetuarPagamento();
				break;
				
			case 4:
				extrato();
				break;
				
			case 9:
				// fim
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
		
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
		
	}

}
