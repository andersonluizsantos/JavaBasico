package tiposdemetodos;

public class Calculadora {

	double resultado;

	// Tipo1: Recebe Parâmetros de Entrada e Retorna um Resultado
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}

	// Tipo2: Não Recebe nenhum Parâmetros de Entrada e retorna um resultado
	double obterResultado() {
		return resultado;
	}

	// Tipo3: Recebe Parâmetros de Entrada e não Retorna nada
	void acrescentar(double a) {
		resultado += a;
	}
	
	// Tipo4: Não recebe nenhum parâmetro e não retorna nenhum resultado 
	void limpar() {
		resultado = 0;
	}
	
	

}
