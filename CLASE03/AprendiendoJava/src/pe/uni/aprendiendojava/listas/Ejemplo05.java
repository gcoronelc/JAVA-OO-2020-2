package pe.uni.aprendiendojava.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo05 {

	public static void main(String[] args) {

		List<Integer> notas;

		notas = new ArrayList();

		notas.add(80);
		notas.add(90);
		notas.add(40);
		notas.add(60);
		notas.add(70);

		notas.remove(2);
		notas.set(3, 85);

		for (int i = 0; i < notas.size(); i++) {
			System.out.println(i + ".- " + notas.get(i));
		}

	}

}
