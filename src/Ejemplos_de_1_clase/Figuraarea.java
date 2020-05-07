/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author bayro
 */
public class Figuraarea {
public static double Atriangulo(int base, int altura){
    double area = base*altura/2;
    return area;
}
public static double Acuadrado(int lado){
    double area =Math.pow(lado,2);
    return area;
            }
public static double Acirculo(int radio){
    double area = (Math.PI)*Math.pow(radio,2);
    return area;
}

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa el tipo de figura que deseas calcular");
        System.out.println("area de cuadrado");
        System.out.println("area de triangulo");
        System.out.println("area circulo");
        int opcion = teclado.nextInt();
        int dimension1=0;
        int dimension2=0;
        double area =0;
        switch(opcion){
            case 1:
                 System.out.println("area cuadrado");
                    System.out.println("ingresa el lado del cuadrado");
                    System.out.println("el area del cuadrado es : "+area);
                    break;
            case 2:
                 System.out.println("area triangulo");
                    System.out.println("ingresa la altura del triangulo");
                    dimension1 = teclado.nextInt();
                    System.out.println("ingresa la base del triangulo");
                    dimension2 = teclado.nextInt();
                    area = Atriangulo(dimension1,dimension2);
                    System.out.println("el area del triangulo es : "+area);
                    break;
                
                case 3:
                    System.out.println("area circulo");
                    System.out.println("ingresa el radio del circulo");
                    System.out.println("el area del circulo es : "+area);
                    break;
                default:
                    System.out.println("pcion no valida");
        }
    }
    
}
     