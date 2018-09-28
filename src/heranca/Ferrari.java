package heranca;

public class Ferrari extends Carro {
	
	// Alterando a variável da classe pai
	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
	}
	
	// sobrescrever o método da classe pai passando uma velocidade diferente
	public void acelerar() {
		super.acelerarMais(20);
	}

}
