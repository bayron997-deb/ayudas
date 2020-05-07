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
public class Esepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int a;
        try {
            a = teclado.nextInt();
            System.out.println(10 / a);

        } catch (ArithmeticException e) {
            System.out.println("numero no valido");
            a = 0;
        } catch (Exception e) {
            System.out.println("entrada invalida");
            a = -1;
        } finally {
            System.out.println("validacion completada");
        }

        System.out.println(a);

    }

}
