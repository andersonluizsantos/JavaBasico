package programacaodefensiva;

import varargs.Pessoa;

public class Exemplo1 {
	public static void main(String[] args) {
		String nomeCompleto = null;
		System.out.print(nomeCompleto);
		
		//Tentar acessar um método de uma instância cuja referência seja null.
		Pessoa p = null;
		double peso = p.getPeso();
		
		
	}
}
