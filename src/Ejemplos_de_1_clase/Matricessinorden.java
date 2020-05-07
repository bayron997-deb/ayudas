/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

/**
 *
 * @author bayro
 */
public class Matricessinorden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] mat2 = {{2,1,5,6,7,8}, {3, 5, 4, 3, 2}, {2}, {56, 3}};
            for(int i=0;i<mat2.length;i++){
                for(int j=0; j<mat2[i].length;j++){
                    System.out.print("[ "+mat2[i][j]+"\t]");
                }
                System.out.println("");
            }
    }
    
}
