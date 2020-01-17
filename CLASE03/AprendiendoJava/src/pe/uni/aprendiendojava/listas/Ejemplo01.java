package pe.uni.aprendiendojava.listas;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo01 {

	public static void main(String[] args) {
		
		List<Integer> notas;
		
		notas = new ArrayList();
		
		notas.add(80);
		notas.add(90);
		notas.add(40);
		notas.add(60);
		notas.add(70);
		
		for (int i = 0; i < notas.size(); i++) {
			System.out.println(i + ".- " + notas.get(i));
		}
		
	}
	
}
