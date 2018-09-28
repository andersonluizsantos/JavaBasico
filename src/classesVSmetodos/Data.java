package classesVSmetodos;

public class Data {
	int dia;
	int mes;
	int ano;	
		
	// Se n�o fizermos a atribui��o dos valores passados como par�metros para 
	// as vari�veis da inst�ncia o m�todo formatar n�o vai funcionar
	// por isso precisamos atualizar os valores das vari�veis de inst�ncia com os valores
	// passsados como par�metro para o construtor
	public Data(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	
	public Data() {
	}

	
	
	String formatar() {
		
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
}
