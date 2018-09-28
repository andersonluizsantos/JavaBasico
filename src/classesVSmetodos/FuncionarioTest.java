package classesVSmetodos;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		func1.nome = "Cecilia";
		func1.salario = 2000.00;
		func1.funcao = "Estudante";
		
		Funcionario func2 = new Funcionario("Anderson", 3000.00, "Analista de Sistemas");
		
		System.out.println(func1);
		System.out.println(func2);
		
	}
}
