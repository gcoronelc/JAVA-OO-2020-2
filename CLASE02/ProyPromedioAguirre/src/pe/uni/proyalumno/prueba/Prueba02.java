/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.proyalumno.prueba;

import pe.uni.proyalumno.service.AlumnoService;

/**
 *
 * @author Antonella
 */
public class Prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Datos 
        int n1=12, n2=15, n3=10, n4=13, n5=14;
        // Proceso
        AlumnoService service =new AlumnoService();
        int promedio=service.promedio(n1, n2, n3, n4, n5);
        //Reporte
        System.out.println("Promedio: "+ promedio);
    }
    
}
