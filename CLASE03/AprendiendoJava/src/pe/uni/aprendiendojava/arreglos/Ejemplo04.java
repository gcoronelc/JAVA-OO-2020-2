package pe.uni.aprendiendojava.arreglos;

import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo04 {
	
	public static void main(String[] args) {
		
		int[] datos = {54,76,23,54,98,12};
		
		Arrays.sort(datos);
		
		for (int dato : datos) {
			System.out.println(dato);
		}

	}
	
}
