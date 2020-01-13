/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.pe.ejercicio1.test;

import uni.pe.ejercicio1.Service.MateService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// Variables
		int n1, n2, mcd, mcm;
		// Datos
		n1 = 20;
		n2 = 15;
		// Proceso
		MateService service = new MateService();
		mcm = service.mcm(n1, n2);
		mcd = service.mcd(n1, n2);
		// Reporte
		System.out.println("N1:  " + n1);
		System.out.println("N2:  " + n2);
		System.out.println("MCD:  " + mcd);
		System.out.println("MCM:  " + mcm);
	}

}
