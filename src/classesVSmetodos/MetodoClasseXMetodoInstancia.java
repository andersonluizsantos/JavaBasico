package classesVSmetodos;

public class MetodoClasseXMetodoInstancia {
	
	int a = 2;
	static int b = 3; 

	// Como o método main é um método de classe, uma vez que ele tem o modificador static
	// para acessar a variável (a) é necessário criar uma instância da classe MetodoClasseXMetodoInstancia
	// por outro lado para acessar a variável b, que é uma variável de classe a criação da instância 
	// não é necessário
	public static void main(String[] args) {
		MetodoClasseXMetodoInstancia d = new MetodoClasseXMetodoInstancia();
		System.out.println(d.a);
		
		System.out.println(b);
	}
	
	// Já para acessar variáveis de classe (b) em métodos de instância não é necessário 
	// criar uma instância da classe uma vez que a classe é criada antes antes dos métodos
	void metodoInstancia() {
		System.out.println(a);
		System.out.println(b);
	}
	
	// Assim como no método main, qualquer outro método static terá que criar uma instância da classe
	// par acessar a variável de instância. 
	// Já o acesso a variáveis de classe o acesso é feito normalmente em métodos também de classe
	static void metodoClasse() {
		MetodoClasseXMetodoInstancia d = new MetodoClasseXMetodoInstancia();
		System.out.println(d.a);
		System.out.println(b);
	}

}
