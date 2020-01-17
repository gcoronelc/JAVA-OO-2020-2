package pe.uni.aprendiendojava.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo01 {
	
	public static void main(String[] args) {
		
		Set<String> profesores;
		
		profesores = new HashSet<>();
		
		profesores.add("Gustavo");
		profesores.add("Pedro");
		profesores.add("Ricardo");
		profesores.add("Shirley");
		profesores.add("Hilda");
		profesores.add("Daniela");
		
		for (String profesor : profesores) {
			System.out.println(profesor);
		}
		
	}

}
