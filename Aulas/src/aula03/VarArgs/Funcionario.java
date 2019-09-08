package aula03b;

public class Funcionario {
	
	double salario;
	int vr;
	int vt;
	
	public void adicionarBeneficios(float vt, float vr) {
		
		salario += vt;
		salario += vr;
		
	}
	
	public void adicionarBeneficiosVarArgs(float ... beneficios) {
	
		//var -args
	for (float b : beneficios ) {
		
		salario += b;
		
	}
	}
}