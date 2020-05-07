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
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnum = new Random(); 
        Scanner teclado = new Scanner(System.in);
        
        int max;
        int min;
        int par= 0;
       // int numeropedido;
        int promedio = 0;
        int acumulador=0;
        System.out.println("ingrese largo del arreglo");
        int largo = teclado.nextInt();
       int[] arreglo = new int[largo];
       
       //fija casillas del arreglo a numeris aleatorios
       for(int i = 0; i<arreglo.length; i++){
           arreglo[i]= rnum.nextInt(100);
       }           
       //calcula el promedio del arreglo y los numeros pares
       for(int i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i]);
            acumulador =  acumulador + arreglo[i];
             if(arreglo[i]%2==0){
            par++;
        }
            
       }
           promedio = acumulador/largo;
           System.out.println("el promedio es "+promedio);
       
       // mayor y mensr de llos intervalos+
       min = arreglo[0];
       max = arreglo[0];
       
       for(int i = 1; i<arreglo.length; i++){
           if(max<arreglo[i]){
               max = arreglo[i];
           
           }
           if(min>arreglo[i]){
               min = arreglo[i];

       }
       
}
       System.out.println("el mayor ees "+ max);
        System.out.println("el menor es "+ min);
        System.out.println("numero de pares son "+par+" numeros de impares son "+(largo-par));
      
        

     
        
     
      
       
        
        
        
        
    }
    
}
