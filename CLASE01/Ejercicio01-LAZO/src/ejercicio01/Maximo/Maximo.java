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
public class Maximo {

    public int mcd(int n1, int n2) {
        int mcd = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);

        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);

        return mcd;
    }
}
