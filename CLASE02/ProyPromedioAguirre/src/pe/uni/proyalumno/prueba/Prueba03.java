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
public class Prueba03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Datos 
        int nota=13;
        //Proceso
        AlumnoService service = new AlumnoService();
        String condicion = service.condicion(nota);
        //Reporte
        System.out.println("Condicion: "+ condicion);
    }
    
}
