/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.Scanner;

/** endrada: cantnum fibonnaci a generar
 * proceso: fijar 2 numeros principales, luego aplicar la serie de fibonacci
 * salida: nuemro fibonacci pr orden
 */
public class NumeroFibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar el ingreso por teclado
        Scanner teclado = new Scanner(System.in);
       
       //Declarar las variables 
      int cantnum;
       int fib1 = 0;
       int fib2 = 1;
       int fib3;
       //entrada por teclado valida para cantnum>0
      
        System.out.println("ingresa cant numero");
         cantnum = teclado.nextInt();
      
          for(int i = 1; i<=cantnum; i++){
              fib3 = fib1;
              fib1= fib2 + fib3;
              fib2 = fib3;
              System.out.println(fib2);
          }
          
       
           }      
       
        
        
        
        
        
       
    }
    

