package tiposdemetodos;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.somar(5, 6));
		
		calculadora.acrescentar(10);
		
		System.out.println(calculadora.obterResultado());
		
		calculadora.limpar();
		
		System.out.println(calculadora.obterResultado());
		
	}
}
