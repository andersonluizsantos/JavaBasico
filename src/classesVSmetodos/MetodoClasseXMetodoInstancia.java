package classesVSmetodos;

public class MetodoClasseXMetodoInstancia {
	
	int a = 2;
	static int b = 3; 

	// Como o m�todo main � um m�todo de classe, uma vez que ele tem o modificador static
	// para acessar a vari�vel (a) � necess�rio criar uma inst�ncia da classe MetodoClasseXMetodoInstancia
	// por outro lado para acessar a vari�vel b, que � uma vari�vel de classe a cria��o da inst�ncia 
	// n�o � necess�rio
	public static void main(String[] args) {
		MetodoClasseXMetodoInstancia d = new MetodoClasseXMetodoInstancia();
		System.out.println(d.a);
		
		System.out.println(b);
	}
	
	// J� para acessar vari�veis de classe (b) em m�todos de inst�ncia n�o � necess�rio 
	// criar uma inst�ncia da classe uma vez que a classe � criada antes antes dos m�todos
	void metodoInstancia() {
		System.out.println(a);
		System.out.println(b);
	}
	
	// Assim como no m�todo main, qualquer outro m�todo static ter� que criar uma inst�ncia da classe
	// par acessar a vari�vel de inst�ncia. 
	// J� o acesso a vari�veis de classe o acesso � feito normalmente em m�todos tamb�m de classe
	static void metodoClasse() {
		MetodoClasseXMetodoInstancia d = new MetodoClasseXMetodoInstancia();
		System.out.println(d.a);
		System.out.println(b);
	}

}
