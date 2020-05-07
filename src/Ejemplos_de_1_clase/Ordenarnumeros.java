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
public class Ordenarnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int n1=0;
        int n2=0;
        int n3=0;
        int cont=1;
        do{
        System.out.println("ingrese cant numersos umeros");
        n = teclado.nextInt();
        }while(n<0);
        
       
        System.out.println("digite numeros");
        do{
            n1=n3;
            
            System.out.println("n° "+cont++);
            n2= teclado.nextInt();
            if(n2>n1){
                n3=n2;
            }else{
                n3=n1;
            }
            
            
            
            n--;
        }while(n!=0);
        
        System.out.println("numero mayor es"+n3);
    }
    
}
