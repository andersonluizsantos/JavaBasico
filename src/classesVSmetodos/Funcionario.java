package classesVSmetodos;

public class Funcionario {
	String nome;
	double salario;
	String funcao;

	public Funcionario() {
	}

	public Funcionario(String nome, double salario, String funcao) {
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", funcao=" + funcao + "]";
	}
	
	

}
