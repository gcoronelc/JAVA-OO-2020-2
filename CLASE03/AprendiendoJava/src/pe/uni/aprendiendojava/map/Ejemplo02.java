package pe.uni.aprendiendojava.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo02 {

	public static void main(String[] args) {
		
		Map<String,Integer> precios;
		
		precios = new HashMap<>();
		
		precios.put("P001", 30);
		precios.put("P018", 80);
		precios.put("P015", 90);
		precios.put("P040", 34);
		precios.put("P020", 49);
		precios.put("P080", 17);
		precios.put("P030", 25);
		
		// No hay claves duplicadas
		precios.put("P020", 51);
		
		Set<String> keys = precios.keySet();
		for (String key : keys) {
			System.out.println(key + " - " + precios.get(key));
		}
		
	}
	
	
}
