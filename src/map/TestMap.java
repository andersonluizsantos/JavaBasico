package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		// Insere as informa��es no Mapa
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		
		// Verifica se o mapa cont�m a KEY(Chave) Zara
		if (m1.containsKey("Zara")) {
			System.out.println("Existe Zara");
		}
		
		// Verifica se o mapa cont�m o VALOR 14
		if (m1.containsValue("14")) {
			System.out.println("Existe Numero 14");
		}
		
		// Obt�m o VALOR com a CHAVE "ZARA"
		String Numero = m1.get("Zara");
		System.out.println("NUmero ---> " + Numero);
		
		// Verifica se o Mapa est� vazio
		if (!m1.isEmpty()) {
			System.out.println("Lista Vazia?" + m1.isEmpty());
		}
		
		//imprime todos os elementos
		System.out.print("\t" + m1);
		
		// Limpa o Mapa
		m1.clear();
		
	}
}
