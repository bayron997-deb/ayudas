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
public class Numerossivisiblles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("xd");
        
        
        int a = 0,b,c=0,d;
        d = teclado.nextInt();
        do{
        for( b = 1; b<=20; b++){
            for(a = 1; a<=2000000000; a++){
            if(a % b==0){
                c++;
                
            }
            }
        
    }
        
        d--;
        }while(d!=0);
                if(c==20){
            System.out.println(a);
        }
    }
    
}
