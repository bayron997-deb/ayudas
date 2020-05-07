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
public class ECUACIONCIUADRATICA {

    public static double discriminante(int a, int b, int c){
        double disc = b*b - 4*a*c;
        return disc;
        
    }
    public static int soluciones(int s1, int s2, int s3){
        double d = discriminante(s1,s2,s3);
        int soluciones = 0;
        if(d == 0){
            System.out.println("tiene 1 solucion");
            return 1;
        }else if(d <0){
            System.out.println("no tiene solucion");
            return 0;
        }else{
            System.out.println("tiene 2 soluciones");      
            return 2;
        }
        
     
    }
    public static void calculo(int a, int b, int c){
        int s = soluciones(a, b, c);
        double x1,x2;
        switch(s){
            case 0:
                System.out.println("no hay solucion");
                break;
            case 1:
                x1= -b/(2*a);
                System.out.println("la solucion es: "+x1);
                break;
            case 2:
                x1 = (-b+Math.sqrt(discriminante(a,b,c))/2*a);
                x2 = (-b+Math.sqrt(discriminante(a,b,c))/2*a);
                System.out.println("las soluciones son 1: "+x1+" y 2: "+x2);
        }
        
    }
    
    
    public static void main(String[] args) {
       calculo(8,6,7);
        
    }
    
}
