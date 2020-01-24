package singleton;

public class ConexaoBancoDeDadosOracle {
	
	private static ConexaoBancoDeDadosOracle instancia = null;
	
	private ConexaoBancoDeDadosOracle() {
		
	}
	
	public static ConexaoBancoDeDadosOracle getConexao() {
		if (instancia ==null) {
			System.out.println("Instancia criada...");
			instancia = new ConexaoBancoDeDadosOracle();
		}
		return instancia;
	}	
}


