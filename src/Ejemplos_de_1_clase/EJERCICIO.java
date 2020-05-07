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
public class EJERCICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //EN UN ARREGLO ALMACEENEN EL PROMEDIO POR FILA
        Random rnum = new Random();
         
        int[][] mat = new int[10][100];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rnum.nextInt(20);
            }
        }

        // en un arreglo almacenar el promedio de cada fila
        int[] promedio = new int[mat.length];
        for (int i = 0; i < promedio.length; i++) {
            promedio[i] = 0;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                promedio[i] += mat[i][j];
            }
            promedio[i] /= mat[i].length;
        }

        for (int i = 0; i < promedio.length; i++) {
            System.out.print("[ " + promedio[i] + " ]");
        }
        System.out.println("");

    }

}