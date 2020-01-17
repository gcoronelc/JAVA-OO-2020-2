package pe.uni.aprendiendojava.arreglos;

import java.util.ArrayList;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo03 {
	
	public static void main(String[] args) {
		
		String[] datos;
		
		datos = new String[5];
		
		datos[0] = "20";
		datos[1] = "Gustavo";
		datos[2] = "50000.0";
		datos[3] = "Alianza Camepón";		
		
		for (int i = 0; i < datos.length; i++) {
			System.out.println(i + ".- " + datos[i]);
		}
		
	}
	
}
