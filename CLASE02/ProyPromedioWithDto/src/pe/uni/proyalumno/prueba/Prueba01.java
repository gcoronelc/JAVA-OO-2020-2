package pe.uni.proyalumno.prueba;

import pe.uni.proyalumno.dto.PromedioDto;
import pe.uni.proyalumno.service.AlumnoService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		PromedioDto dto;
		// Datos
		dto = new PromedioDto();
		dto.setNota1(14);
		dto.setNota2(15);
		dto.setNota3(12);
		dto.setNota4(16);
		dto.setNota5(18);
		//Proceso
		AlumnoService service = new AlumnoService();
		dto = service.procesar(dto);
		//Reporte
		System.out.println("Menor nota: " + dto.getMenorNota());
		System.out.println("Promedio: " + dto.getPromedio());
		System.out.println("Condición: " + dto.getCondicion());

	}

}
