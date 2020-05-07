/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bayro
 */
public class MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnum = new Random();
        int principal = 0;
        int secundaria = 0;
        int largo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingeres se largo ");
        largo = teclado.nextInt();
        //matriz 
        int[][] matr = new int[largo][largo];
        System.out.println("filas: " + matr.length);
        System.out.println("columnas: " + matr[0].length);
        int max = 0;

        for (int i = 0; i < matr.length; i++) {

            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = rnum.nextInt(9000);
                System.out.print("[" + matr[i][j] + "\t]");
                if (i == j) {
                    principal = principal + matr[i][i];
                }
                if (i + j == matr.length - 1) {
                    secundaria = secundaria + matr[i][j];
                }
            }
            System.out.println("");

        }

        System.out.println("la suma principal es " + principal);
        System.out.println("la suma secundaria es  " + secundaria);
        System.out.println((double) principal / (double) (matr[0].length));
        System.out.println((double) secundaria / (double) (matr[0].length));
        System.out.println(max);
    }

}
