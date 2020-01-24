package stringtestes;

public class TesteStrings {

	public static void main(String[] args) {
		String teste = null;
		String teste2 = "";
		String teste3 = "teste3";
		
		if (teste == null) {
			System.out.println("teste == null");
		}
		
		// Para o caso da String teste = null, se eu fizer teste.<qualquer_coisa> executará em NUllPointerException
		
		//Exemplo1		
		/*if (teste.trim().equals("") ) {
			System.out.println("teste == null");
		}*/
		
		//Exemplo2
		/*if (teste.isEmpty()) {
			System.out.println("''.equalsIgnoreCase(teste)");
		}*/
		
		
		// para solucionar o problema de NullPointerExceptin podemos usar o exemplo abaixo
		if ("".equalsIgnoreCase(teste)) {
			System.out.println("''.equalsIgnoreCase(teste)");
		}		
			
		if (teste2 == "") {
			System.out.println("Teste teste2 == '' ");
		}
		
		if ("".equalsIgnoreCase(teste2)) {
			System.out.println("''.equalsIgnoreCase(teste2)");
		}
		
		if (teste3 == "") {
			System.out.println("teste3 == ''");
		}
		
		if ("".equalsIgnoreCase(teste3)) {
			System.out.println("Teste de ESPAÇO EM BRANCO");
		}		
		
	}

}
