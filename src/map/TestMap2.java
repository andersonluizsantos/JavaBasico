package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		Map<String, String> m2 = new HashMap<String, String>();
		//Insere as informações no Mapa1
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		
		//Imprime o Mapa1
		System.out.println("Mapa 1 ---> " + m1);		
		
		//Insere todos os valores de um mapa1 em outro mapa2
		m2.putAll(m1);
		
		//Imprime o Mapa2
		System.out.println("Mapa2 ---> " + m2);
		
		//Remove um item do Mapa1
		m1.remove("Zara");
		
		//Imprime o Mapa1 sem o item excluído
		System.out.println("Mapa1 Após a exclusão ---> " + m1);
		
		//Insere novamente o item excluído no mapa1
		m1.put("Zara", "8");
		
		//Mostra o tamanho do mapa1
		System.out.println("Tamanho do Mapa ---> " + m1.size());
		
	}	
}
