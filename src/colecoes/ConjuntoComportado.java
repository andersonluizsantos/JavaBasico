package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new HashSet<>();
		Set<String> aprovados1 = new TreeSet<>();
		Set<String> aprovados2 = new LinkedHashSet<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}

	}

}
