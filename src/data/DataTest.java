package data;

public class DataTest {
	public static void main(String[] args) {
		// Estamos chamando o contrutor padr�o que n�o precisa ser declarado
		// O primeiro Data � o tipo
		// Atrav�s da Palavra reservada new criamos um novo objeto do tipo data
		Data nascimento = new Data();
		nascimento.dia = 19;
		nascimento.mes = 11;
		nascimento.ano = 1987;
		
		System.out.println(nascimento.dia +"/"+nascimento.mes +"/"+nascimento.ano);
		System.out.printf("%d/%d/%d/", nascimento.dia, nascimento.mes, nascimento.ano);
		
		System.out.println(nascimento.formatar());	
		
	}
}
