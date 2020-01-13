/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.Maximo;

/**
 *
 * @author Alumno
 */
public class Minimo {

    public int minimo(int n1, int n2) {
        Maximo max = new Maximo();
        int mcd = max.mcd(n1, n2);
        int mcm;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        mcm = (a / mcd) * b;
        return mcm;
    }
}
