/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.Random;

/**
 *
 * @author bayro
 */
public class ArregloqueNoSeRepite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnum = new Random();
        int[] arreglo = new int[8];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnum.nextInt(8);
            for (int j = 0; j < i; j++) {

                if (arreglo[i] == arreglo[j]) {
                    i--;

                }

            }

        }
        System.out.println(arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
