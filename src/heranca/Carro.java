package heranca;

public class Carro {
	
	protected int VELOCIDADE_MAXIMA = 200;
	private int velocidadeAtual = 0;
	
	// Um método final não pode ser alterado pelas classes filhas
	// Perceba que esse método é protected e portanto foi desenhado para ser implementado pela classe filha 
	protected final void acelerarMais(int velocidade) {
		if (velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += velocidade;
		}
	}
	
	protected final void frearMais(int velocidade) {
		if(velocidadeAtual - velocidade < 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= velocidade;
		}
	}
	
	//Por padrão ele vai acelerar 5 km
	public void acelerar() {
		acelerarMais(5);
	}
	
	public void frear() {
		frearMais(5);
	}
	
	//Vai trazer a velocidade atual
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
}
