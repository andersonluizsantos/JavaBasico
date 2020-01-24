package singleton;

public class ConexaoSemSingleton {
	
	private ConexaoSemSingleton instancia;
	
	
	
	public ConexaoSemSingleton getConexao() {
		if (instancia ==null) {
			System.out.println("Instancia criada...");
			instancia = new ConexaoSemSingleton();
		}
		return instancia;
	}	
}
