package singleton;

import java.util.Iterator;

public class TesteConexao {
	public static void main(String[] args) {
		
		// Como o nosso construtuor é privado não vamos conseguir instanciar a classe ConexaoBancoDeDadosOracle
		ConexaoBancoDeDadosOracle conexao = null;
		for (int i=0; i<5; i++) {
			conexao = ConexaoBancoDeDadosOracle.getConexao();
			System.out.println("Teste de Conexão " + i + "; Instância: " + conexao);
		}
		
		System.out.println("-----------------------------");
		
		
		for (int i=0; i<5; i++) {
			ConexaoSemSingleton conexaoSemSingleton = new ConexaoSemSingleton();
			System.out.println("Teste de Conexão " + i + "; Instância: " + conexaoSemSingleton.getConexao());
		}
	}
}
