package pe.uni.aprendiendojava.dto;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class AlumnoDto {

	private String alumno;
	private int nota;
	private String condicion;

	public AlumnoDto() {
	}

	public AlumnoDto(String alumno, int nota, String condicion) {
		this.alumno = alumno;
		this.nota = nota;
		this.condicion = condicion;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	@Override
	public String toString() {
		return alumno + " - " + nota;
	}

	
	
}
