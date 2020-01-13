/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymcdmcm.service;

/**
 *
 * @author Alumno
 */
public class MateService {
    public int mcm(int n1, int n2) {
		int mcm, i;
		i = 2;
		mcm = 1;
		while (i <= n1 || i <= n2) {
			if (n1 % i == 0 || n2 % i == 0) {
				mcm = mcm * i;
				if (n1 % i == 0) {
					n1 = n1 / i;
				}
				if (n2 % i == 0) {
					n2 = n2 / i;
				}
			} else {
				i = i + 1;
			}
		}
		return mcm;
	}
	
	public int mcd(int n1, int n2){
		// Variables
		int resultado;
		// Proceso
		resultado = n1 * n2 / mcm(n1, n2);
		// Reporte
    return resultado;
	}
}
