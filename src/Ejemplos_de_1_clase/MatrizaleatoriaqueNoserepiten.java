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
public class MatrizaleatoriaqueNoserepiten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnum = new Random();
        int[][] matr = new int[3][5];
        System.out.println("filas: " + matr.length);
        System.out.println("columnas: " + matr[0].length);

        for (int i = 0; i < matr.length; i++) {

            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = rnum.nextInt(16);
                System.out.print("[" + matr[i][j] + "\t]");
            }
            System.out.println("");

        }

    }
}
