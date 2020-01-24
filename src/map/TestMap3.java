package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap3 {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		Map<String, String> m2 = new HashMap<String, String>();
		
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
				
		System.out.println("Mapa M1 ----> " + m1);
		
		// Comparando dois mapas
		if (m1.equals(m2)) {
			System.out.println("Os Mapas são iguais");
		}		
		
		// Substituindo valores no Mapa
		m1.replace("Zara", "12");
		
		System.out.println("Mapa M1 ----> " + m1);
				
		if (m1.replace("Zara", "12", "8")) {
			System.out.println("valor Substituído");
		}
		
		System.out.println("Mapa M1 ----> " + m1);
	}
	

}
