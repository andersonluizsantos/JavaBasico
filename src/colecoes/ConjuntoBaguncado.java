package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		//Polimorfismo
		Set conjunto = new HashSet();
		//Adicionando elementos heterog�neos
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		//Adicionando Novos Elementos
		System.out.println("Add...");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		System.out.println("Size... " + conjunto.size());
		//Removendo Elementos		
		System.out.println("Remove... ");
		System.out.println(conjunto.remove("a"));
		System.out.println(conjunto.remove('a'));
		System.out.println("Size... " + conjunto.size());
		//Algumas Fun��es
		System.out.println("Contains... ");
		System.out.println(conjunto.contains('a'));
		System.out.println(conjunto.contains(1));
		// Criando um Novo Set e testando novas fun��es
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		//conjunto.addAll(nums);
		conjunto.retainAll(nums);
		System.out.println("Size...");
		System.out.println(conjunto.size());
		conjunto.clear();
		System.out.println(conjunto.isEmpty());
	}
}
