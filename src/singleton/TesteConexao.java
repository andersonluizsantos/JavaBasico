package singleton;

import java.util.Iterator;

public class TesteConexao {
	public static void main(String[] args) {
		
		// Como o nosso construtuor � privado n�o vamos conseguir instanciar a classe ConexaoBancoDeDadosOracle
		ConexaoBancoDeDadosOracle conexao = null;
		for (int i=0; i<5; i++) {
			conexao = ConexaoBancoDeDadosOracle.getConexao();
			System.out.println("Teste de Conex�o " + i + "; Inst�ncia: " + conexao);
		}
		
		System.out.println("-----------------------------");
		
		
		for (int i=0; i<5; i++) {
			ConexaoSemSingleton conexaoSemSingleton = new ConexaoSemSingleton();
			System.out.println("Teste de Conex�o " + i + "; Inst�ncia: " + conexaoSemSingleton.getConexao());
		}
	}
}
