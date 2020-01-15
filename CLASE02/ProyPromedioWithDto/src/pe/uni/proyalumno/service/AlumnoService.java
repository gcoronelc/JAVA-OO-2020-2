package pe.uni.proyalumno.service;

import pe.uni.proyalumno.dto.PromedioDto;

public class AlumnoService {

	public PromedioDto procesar(PromedioDto dto){
		// Variables
		int menorNota, promedio;
		String condicion;
		// Proceso
		menorNota = menorNota(dto.getNota1(), dto.getNota2(), 
			dto.getNota3(), dto.getNota4(), dto.getNota5());
		promedio = promedio(dto.getNota1(), dto.getNota2(), 
			dto.getNota3(), dto.getNota4(), dto.getNota5());
		condicion = condicion(promedio);
		// Reporte
		dto.setMenorNota(menorNota);
		dto.setPromedio(promedio);
		dto.setCondicion(condicion);
		return dto;
	}
	
	/**
	 *
	 * @param n1
	 * @param n2
	 * @param n3
	 * @param n4
	 * @param n5
	 * @return
	 */
	private int menorNota(int n1, int n2, int n3, int n4, int n5) {
		//Variables
		int menor = 0;
		//Proceso
		menor = n1;
		if (menor > n2) {
			menor = n2;
		}
		if (menor > n3) {
			menor = n3;
		}
		if (menor > n4) {
			menor = n4;
		}
		if (menor > n5) {
			menor = n5;
		}
		//Reporte
		return menor;
	}

	private int promedio(int n1, int n2, int n3, int n4, int n5) {
		//Variable
		int promedio, menor;
		//Proceso
		menor = menorNota(n1, n2, n3, n4, n5);
		promedio = (n1 + n2 + n3 + n4 + n5 - menor) / 4;
		//Reporte
		return promedio;
	}

	private String condicion(int nota) {
		//Variable
		String condicion = "APROBADO";
		//Proceso
		if (nota < 14) {
			condicion = "DESAPROBADO";
		}
		//Reporte
		return condicion;
	}

}
