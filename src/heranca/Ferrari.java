package heranca;

public class Ferrari extends Carro {
	
	// Alterando a vari�vel da classe pai
	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
	}
	
	// sobrescrever o m�todo da classe pai passando uma velocidade diferente
	public void acelerar() {
		super.acelerarMais(20);
	}

}
