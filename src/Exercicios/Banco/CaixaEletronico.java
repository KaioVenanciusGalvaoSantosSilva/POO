package Banco;
import javax.swing.JOptionPane;

public class CaixaEletronico extends Conta {

	public Conta autentica() {

		/*Conta conta = new Conta();

		String numeroConta = "";
		String senha = "";

		
		 * boolean logado = false;
		 * 
		 * while (logado != true) {
		 * 
		 * numeroConta = JOptionPane.showInputDialog("Digite o Numero da Conta:"); senha
		 * = JOptionPane.showInputDialog("Digite a Senha:");
		 * 
		 * if (numeroConta == (conta.getNumero()) && senha == (conta.getSenha())) {
		 * JOptionPane.showMessageDialog(null, "Logado"); logado = true; Menu();
		 * 
		 * }else { JOptionPane.showMessageDialog(null, "Insira os dados novamente"); } }
		 */
		JOptionPane.showMessageDialog(null, "Logado");
		Menu();

		return null;
	}
}
