package classesVSmetodos;

public class Data {
	int dia;
	int mes;
	int ano;	
		
	// Se não fizermos a atribuição dos valores passados como parâmetros para 
	// as variáveis da instância o método formatar não vai funcionar
	// por isso precisamos atualizar os valores das variáveis de instância com os valores
	// passsados como parâmetro para o construtor
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
