/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.proyalumno.service;

/**
 *
 * @author Alumno
 */
public class AlumnoService {
    /** 
     * 
     * @param n1
     * @param n2
     * @param n3
     * @param n4
     * @param n5
     * @return 
     */
    public int menorNota(int n1,int n2,int n3,int n4, int n5){
        //Variables
        int menor=0;
        //Proceso
        menor=n1;
        if(menor>n2){
        menor = n2;
        }if (menor>n3){
        menor =n3;
        }if (menor>n4){
        menor =n4;
        }if(menor>n5){
        menor =n5;
        }
        //Reporte
    return menor;
    }
    public int promedio(int n1,int n2,int n3,int n4, int n5){
    //Variable
    int promedio, menor;
    //Proceso
    menor= menorNota(n1, n2, n3, n4, n5);
    promedio= (n1+n2+n3+n4+n5-menor)/4;
    //Reporte
    return promedio;
    }
    
    public String condicion( int nota){
        //Variable
        String condicion="APROBADO";
        //Proceso
        if(nota<14){
            condicion="DESAPROBADO";
        }
        //Reporte
        return condicion;
    }
    
}
