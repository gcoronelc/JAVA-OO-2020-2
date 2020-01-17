package pe.uni.aprendiendojava.arreglos;

import java.util.ArrayList;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo02 {
	
	public static void main(String[] args) {
		
		Object[] datos;
		
		datos = new Object[5];
		
		datos[0] = 20;
		datos[1] = "Gustavo";
		datos[2] = 50000.0;
		datos[3] = new ArrayList<Object>();		
		
		for (int i = 0; i < datos.length; i++) {
			System.out.println(i + ".- " + datos[i]);
		}
		
	}
	
}
