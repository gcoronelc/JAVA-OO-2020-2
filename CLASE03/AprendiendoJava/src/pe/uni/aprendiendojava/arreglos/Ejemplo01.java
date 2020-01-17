package pe.uni.aprendiendojava.arreglos;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo01 {
	
	public static void main(String[] args) {
		
		int notas[];
		
		notas = new int[5];
		
		notas[2] = 20;
		notas[3] = 30;
		
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(i + ".- " + nota);
		}
		
	}
	
}
