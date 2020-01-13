package pe.uni.proysuma.prueba;

import pe.uni.proysuma.service.SumaService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		int n1, n2, suma;
		// Datos
		n1 = 20;
		n2 = 60;
		// Proceso
		SumaService service = new SumaService();
		suma = service.sumar(n1, n2);
		// Reporte
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);
		System.out.println("Suma: " + suma);
	}
	
}
