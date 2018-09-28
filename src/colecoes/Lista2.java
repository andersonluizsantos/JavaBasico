package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista2 {
	public static void main(String[] args) {
		List<Endereco> enderecos = new ArrayList<>();
		Endereco endereco = new Endereco("José de Holanda",580, "Apto 2101");
		Endereco endereco2 = new Endereco("Rua xxx",1000, "Apto 01");
		
		enderecos.add(endereco);
		enderecos.add(endereco2);
		
		//Obtendo um determinado endereco
		String logradouro = enderecos.get(0).logradouro;
		
		System.out.println(logradouro);
		System.out.println(enderecos.get(0).toString());
		
	}
}
