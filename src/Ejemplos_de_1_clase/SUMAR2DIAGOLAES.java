*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumar2diagolaes;

import java.util.Random;

/**
 *
 * @author bayro
 */
public class SUMAR2DIAGOLAES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnum = new Random();
         int suma = 0;
        int[][] mat = new int[10][100];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rnum.nextInt(20);
                
                    
                }
            }
        }
    }
 // TAREA UN ARREGLO DE LARGO 15 CON NUMEROS ALEATORIOS SIN REPETIR 
    // CON ESE ARREGLO GENERAR UNA MATRIZ DE 5X3 
}
}

