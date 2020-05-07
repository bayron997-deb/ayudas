/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.math.BigInteger;
import java.util.Scanner;

public class Recursividad {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner teclado = new Scanner(System.in);
        int factorial = teclado.nextInt();

        BigInteger a = factorial(factorial);
        System.out.println(a.toString());
        System.out.println(a.toString().length());

    }

    public static BigInteger factorial(int a) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i < a + 1; i++) {
            fact = fact.multiply(new BigInteger("" + i));

        }
        return fact;
    }
}
