package tiposdemetodos;

public class Calculadora {

	double resultado;

	// Tipo1: Recebe Par�metros de Entrada e Retorna um Resultado
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}

	// Tipo2: N�o Recebe nenhum Par�metros de Entrada e retorna um resultado
	double obterResultado() {
		return resultado;
	}

	// Tipo3: Recebe Par�metros de Entrada e n�o Retorna nada
	void acrescentar(double a) {
		resultado += a;
	}
	
	// Tipo4: N�o recebe nenhum par�metro e n�o retorna nenhum resultado 
	void limpar() {
		resultado = 0;
	}
	
	

}
