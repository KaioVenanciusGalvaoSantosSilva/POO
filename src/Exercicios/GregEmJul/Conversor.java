package ConverterGregorianoEmJuliano;

import javax.swing.JOptionPane;

public class Conversor {

	public int dia;
	public int mes;
	public int ano;
	public int data;
	public int base = 15 + 10 + 1582;

	int a;
	int b;
	int c;
	double d;
	double e;
	double dataju;

	public void LerDataGregoriana() {

		// Inserir Dia
		while (dia > 31 || dia <= 0) {

			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia"));

			if (dia > 31 || dia <= 0) {

				JOptionPane.showMessageDialog(null, "Insira um dia válido entre 1 e 31");
			}

		}

		// Inserir Mes
		while (mes > 12 || mes <= 0) {

			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês"));

			if (mes > 12 || mes <= 0) {

				JOptionPane.showMessageDialog(null, "Insira um mês válido entre 1 e 12");
			}
		}

		// Inserir Ano

		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano"));

		// Retorno Calendário Gregoriano
		JOptionPane.showMessageDialog(null, "A data no calendário Gregoriano é: " + dia + "/" + mes + "/" + ano + ".");

	}

	public void ConvertendoEmJuliano() {

		data = dia + mes + ano;

		if (mes < 3) {

			ano = ano - 1;
			mes = mes + 12;
		}

		if (data >= base) {

			a = ano / 100;
			b = a / 4;
			c = 2 - a + b;
			d = 365.25 * (ano + 4716);
			e = 30.6001 * mes + 1;
			dataju = (d + e + dia + 0.5 + c - 1524.5) + 30;

		}
		int inteiro = (int) dataju;

		if (dataju == inteiro) {

			dataju = dataju - 1;
		}

		JOptionPane.showMessageDialog(null, "Resposta = " + (int) dataju);
	}

	public void Imprimir() {

		LerDataGregoriana();
		ConvertendoEmJuliano();

	}
}
