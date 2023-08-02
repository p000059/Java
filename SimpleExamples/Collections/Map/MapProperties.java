package Collections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public class MapProperties {

	public static void main(String[] args) {
		
		Map<Integer, Object> ht = new HashMap<>();
		
		Map<Object,Object> sourceMap = new Properties(); 
		
		sourceMap.put(1, "Meta");
		sourceMap.put(2, "Palestra");
		sourceMap.put(3, "Venda");
		sourceMap.put(4, "Arranjo");
		sourceMap.put(5, "Contribuicao");
		sourceMap.put(6, "Espera");
		sourceMap.put(7, "Medida");
		

			
			System.out.print("\n Value: " + sourceMap);
		
			
		
//		sourceMap.containsValue("Caso");
	}
}
