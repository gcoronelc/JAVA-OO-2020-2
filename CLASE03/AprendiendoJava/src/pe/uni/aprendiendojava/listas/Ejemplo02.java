package pe.uni.aprendiendojava.listas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo02 {

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

		notas.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
					int rpta = -1;
					if(o2.intValue() > o1.intValue()){
						rpta = 1;
					}
					return rpta;
			}
		});
		
		System.out.println("---------------------");
		for (Integer nota : notas) {
			System.out.println(nota);
		}
		
	}
	
}
