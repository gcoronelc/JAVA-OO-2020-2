package pe.uni.promedioapp.service;

public class PromedioService {

	public int menorNota(int n1, int n2, int n3, int n4, int n5) {
		//Variables
		int menor;
		// Proceso
		menor = n1; // Punto de partida
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
		// Reporte
		return menor;
	}

	public int promedio(int n1, int n2, int n3, int n4, int n5) {
		// Variables
		int promedio, menor;
		// Proceso
		menor = menorNota(n1, n2, n3, n4, n5);
		promedio = (n1 + n2 + n3 + n4 + n5 - menor) / 4;
		// Reporte
		return promedio;
	}

	public String condicion(int nota){
		// Variables
		String estado;
		// Proceso
		estado = "Aprobado"; // Punto de partida
		if( nota < 14){
			estado = "Desaprobado";
		}
		// Reporte
		return estado;
	}
	
}
