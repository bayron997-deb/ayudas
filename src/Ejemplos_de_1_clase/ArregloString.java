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
public class ArregloString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("ingresa una palabra ");      // palabra ingresada por el usuario
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();                 // SE FIJA EL LARGO DEL ARREGLO CON LOS CARACTERES USADOS
        System.out.println("largo: " + palabra.length());  // SE IMPRIME EL LARGO DEL ARREGLO
        System.out.println("la palabra es  " + palabra);
        // for(int i = 0; i<palabra.length(); i++){          // LOOP PARA QUE SE IMPRIMAN TDAS LAS PALABRAS
        //  System.out.println(palabra.charAt(i));
        // }
        //metodo para escribir palabra al revé
        String b = ""; // crear una variable que almacene los datos de los indices
        for (int i = 0; i < palabra.length(); i++) {
            b += palabra.charAt(palabra.length() - 1 - i); // fija los indices 
        }
        if(palabra.equals(b)){   // usar equals para ver si es palindr4omo y comparar las palabras
            System.out.println("es palindromo");
            
        } else {
            System.out.println("no es palindromo ");
        }
       //System.out.println(b); // dice la palabra invertida
       // metodo 2 
       // for(int i = a.length()-1; i>=0; i--){
       //     b += a.charAt(i);
       // }
       //        System.out.println(b);
       // determinar si una palabra es palindromo
     
       
    }
}
