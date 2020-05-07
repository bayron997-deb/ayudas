/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.Scanner;

/**
 *
 * @author bayro
 */
public class Creararreglocondatosingresadosporelusuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int largo, casilla;
        Scanner teclado = new Scanner(System.in);
             
        System.out.println("ingrese largo del arreglo");
        largo = teclado.nextInt();
        int arr[] = new int[largo];
    for(int i = 0; i<arr.length; i++ ){
        System.out.println("ingresee valor para "+i);
        casilla = teclado.nextInt();
        arr[i] = casilla;
    }
    for(int i = 0; i<arr.length; i++ ){
         System.out.println(arr[i]);
    }
    
}
}