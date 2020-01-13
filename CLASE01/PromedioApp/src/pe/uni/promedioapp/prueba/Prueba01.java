package pe.uni.promedioapp.prueba;

import pe.uni.promedioapp.service.PromedioService;

public class Prueba01 {


	public static void main(String[] args) {
		// Variables
		int n1, n2, n3, n4, n5, menor, promedio;
		String estado;
		// Datos
		n1 = 15;
		n2 = 7;
		n3 = 13;
		n4 = 14;
		n5 = 6;
		// Proceso
		PromedioService service = new PromedioService();
		menor = service.menorNota(n1, n2, n3, n4, n5);
		promedio = service.promedio(n1, n2, n3, n4, n5);
		estado = service.condicion(promedio);
		// Reporte
		System.out.println("REPORTE");
		System.out.println("Menor: " + menor);
		System.out.println("Promedio: " + promedio);
		System.out.println("Estado: " + estado);
	}
}
