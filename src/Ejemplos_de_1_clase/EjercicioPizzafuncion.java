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
public class EjercicioPizzafuncion {

    public static Scanner teclado = new Scanner(System.in); // teclado global
    public static int total = 0;
    public static int totalparcial = 0;

    public static String selecciontamaño() {
        System.out.println("ingresa el tamaño a pedir");
        System.out.println("[1] pizza pequeña [2] pizza mediana [3] pizza grande");
        int tamaño = teclado.nextInt();
        String tamañopizza = "";
        switch (tamaño) {
            case 1:
                tamañopizza = "pequeña";
                totalparcial += 1000;
                break;
            case 2:
                tamañopizza = "mediana";
                totalparcial += 1500;
                break;
            case 3:
                tamañopizza = "grande";
                totalparcial += 5000;
                break;
        }
        total += totalparcial;
        return tamañopizza;
    }

    public static String selecciontipo() {
        System.out.println("ingresa el tipo");
        System.out.println("[1] pizza amaricana [2] pizza mediterranea [3] pizza texana [4] pizza vegetariana");
        int tipo = teclado.nextInt();
        String tipopizza = "";
        switch (tipo) {
            case 1:
                tipopizza = "americana";
                break;
            case 2:
                tipopizza = "mediterranea";
                break;
            case 3:
                tipopizza = "texana";
                break;
            case 4:
                tipopizza = "vegetareana";
                break;
        }

        return tipopizza;
    }

    public static void seleccioningredientes() {
        String[] ingre = {"extraqueso", "peperoni", "aceitunas", "piña", "sardinas"};
        int[] valor = {500, 450, 1000, 100, 1100};
        int[] ingredientes = new int[ingre.length];
        System.out.println("ingresa el numero de ingredientes extra a añadir");
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println(ingre[i] + " $" + valor[i]);
            ingredientes[i] = teclado.nextInt();

        }
        for (int i = 0; i < ingredientes.length; i++) {
            totalparcial += ingredientes[i] * valor[i];

        }
        total = totalparcial;

    }

    public static void main(String[] args) {
        int repetir;
        do {
            System.out.println(selecciontamaño());
            System.out.println(selecciontipo());
            seleccioningredientes();
            System.out.println("total: " + totalparcial);
            System.out.println("para repetir ingresa 1");
            repetir = teclado.nextInt();
        } while (repetir == 1);

        System.out.println("==========================");
        System.out.println("total ventas: " + total);

    }
}
