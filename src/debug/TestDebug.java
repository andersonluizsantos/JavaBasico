package debug;

public class TestDebug {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int total = 0;
		String testeString = null;
		
		if (testeString.equalsIgnoreCase("Concluido")) {
			
		}
		while (num2 < 10) {
			total = num1 + num2;
			num1++;
			num2++;
		}
		execturarProcedure(total);
	}

	private static void execturarProcedure(int total) {
		// TODO Executar Chamada da Procedure
		total = total + 1;
		atualizarBD(total);
	}

	private static void atualizarBD(int total) {
		// FIXME Criar Tabela do Banco de Dados
		total = total + 1;

	}

}
