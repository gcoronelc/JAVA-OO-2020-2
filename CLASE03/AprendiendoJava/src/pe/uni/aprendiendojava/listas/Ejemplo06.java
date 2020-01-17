package pe.uni.aprendiendojava.listas;

import java.util.ArrayList;
import java.util.List;
import pe.uni.aprendiendojava.dto.AlumnoDto;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo06 {

	public static void main(String[] args) {

		List<AlumnoDto> notas;

		notas = new ArrayList();

		notas.add(new AlumnoDto("Gustavo", 20, "Aprobado"));
		notas.add(new AlumnoDto("Karla", 16, "Aprobado"));
		notas.add(new AlumnoDto("Aurora", 10, "Desaprobado"));
		notas.add(new AlumnoDto("Pedro", 15, "Aprobado"));
		notas.add(new AlumnoDto("Antonella", 20, "Aprobado"));
		
		for (AlumnoDto nota : notas) {
			System.out.println(nota);
		}
		
	}
}
