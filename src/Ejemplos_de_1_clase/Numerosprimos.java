/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.Scanner;

/* entrada: usuario ingresa la cantidad de numeros a generar
 *proceso; la cantidad de numeros es el tope del contador for, esos numeros se dividen en un contador y si el modulo es 0 
y tiene 2 divisores es primo
 * salida: entrega el listado de numeros primos
 */
public class Numerosprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ingresar entrada pr teclado
        Scanner teclado = new Scanner(System.in);
        //ingresar pregunta
        System.out.println("ingresa cant numeros a generar ");
        //fijar los espacios de memoria a un tip de dato
        
        int cantnum;
        cantnum = teclado.nextInt();
        int contador = 0;
        int n = 0;
        
        do{
            int contador1=0;
            contador++;
            for (int i=1; i<=contador; i++)
                if(contador % i==0){
                    contador1++;
          
        }
        if(contador1==2){
            System.out.println("n°"+(n+1)+" :"+contador);
            n++;
        }
     
        }while(cantnum!=n) ;
            
        
        
        
    }
}
    

