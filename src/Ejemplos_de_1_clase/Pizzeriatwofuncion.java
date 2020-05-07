/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.Scanner;

/**
 * ENTRADA: INGRESAR TAMAÑO DE LA PIZZA, TIPO DE PIZZA, INGREDIENTES Y OPCION DE LA NUEVA COMPRA
 * PROCESO: SELECCIONAR; 
 *          TAMAÑO
 *          TIPO
 *          INGREDIENTES
 *          OPCION DE EJECUCION
 * 
 * SALIDA: REPORTE POR LA PIZZA
 *          TOTAL DE COMPRA
 *
 * @author bayro
 */
public class Pizzeriatwofuncion {
    public static Scanner teclado = new Scanner(System.in); // teclado global
    public static int total=0;
    
    public static String selecciontamaño(){
        System.out.println("ingresa el tamaño a pedir");
        System.out.println("[1] pizza pequeña [2] pizza mediana [3] pizza grande");
        int tamaño = new teclado.nextInt();
        String tamañopizza = "";
      switch(tamaño){
          case 1:
              tamañopizza = "pequeña";
              total+=1000;
              break;
          case 2:
              tamañopizza = "mediana";
              total+=1500;
              break;
          case 3:
              tamañopizza = "grande";
              total+=5000;
              break;
      }
      return tamañopizza;
    }
    
    public static void main(String[] args) {
        System.out.println(selecciontamaño());
        System.out.println("tota: "+total);
        
               
    }
    
}
