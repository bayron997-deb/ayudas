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
public class Arreglo2 {

    /**
     * tareas CONTAR LA CANTIDA DE VECES QUE ESTA UN NUMERO QUE INGRESE EL
     * USUARIOO CONTAR LA CANTIDAD DE NUMEROS PRIMOS GENERAR UN ARREGLO DE LARGO
     * N(DONDE LO INGRESA EL USUARIO) Y QUE LOS NUMEROS ALMACENADOS NO SE
     * REPITAN
     *
     * @param args
     */
    public static void main(String[] args) {
        // generar un arreglo de largo 15 o 20

        int largo = 6;
        int[] arreglo = new int[largo];
        int pares = 0;
        int num1 = 0;
        int contador = 0;
        int divisores = 0;
        int primos = 0;
        Random rnum = new Random();
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("ingrese un numero ");
            num1 = teclado.nextInt();
        } while (num1 > 100 || num1 < 0);
        // empieza todo el codigo   
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnum.nextInt(101);
            System.out.println(arreglo[i]);
            // numero de pares e impares
            if (arreglo[i] % 2 == 0) {
                pares++;
            }
            // ingresar numero y contar cuantasa veces aparece el numero ingresad por el usuario
            if (arreglo[i] == num1) {
                contador++;
            }
            //numeros primos
            for(int a=1;a<arreglo.length; a++){
                if(arreglo[i]%a==0){
                    divisores++;
                }
            }
            if(divisores == 2){
                primos++;
            }
            }
            

        

        //salidas
        System.out.println("los pares son " + pares + " y los impares son " + (largo - pares));
        System.out.println("el numero que ingreso el usuario se repite " + contador + " veces");
        System.out.println("la cantidad de numeros primos es " + primos);

    }
}
