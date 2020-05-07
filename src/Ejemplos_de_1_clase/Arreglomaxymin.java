/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.Random;
import java.util.Scanner;

/**
 * PARA PRACTICAR LOS ARREGLOS SE HARAN LOS SIGUIENTES EJERCICIOS CREAR Y
 * MOSTRAR EL ARREGLO ALEATORIO DE LARGO INTRODUCIDO POR EL USUARIO MOSTRAR LA
 * CANTIDAD DE PARES E IMPARES DEL ARREGLO MOSTRAR EL NUMERO PEDIDO Y LA
 * CANTIDAD DE VECES QUE SE REPITE, PARA SABER SI ESTA EL NUMERO SE APLICA EL
 * CODIGO ESCRITO EN COMENTARIOS AL FINAL CALCULAR EL PROMEDIO EXACTO MOSTRAR EL
 * NUMERO MAXIMO Y MINIMO DEL ARREGLO MOSTRAR LA CANTIDAD DE NUMEROS PRIMOS
 *
 *
 * @author bayro
 */
public class Arreglomaxymin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamar las bibliotecas
        Scanner teclado = new Scanner(System.in);
        Random rnum = new Random();
        //fijar las variables a usar
        int largo, max = 0, min = 0, pares = 0, numpedido = 0, nump = 0, acumulador = 0, contador = 0;
        //preguntas claves o entrada de datos
        System.out.println("ingrese el largo del arreglo");
        largo = teclado.nextInt();
        System.out.println("ingrese el numero que desea buscar");
        numpedido = teclado.nextInt();
        //crear el arreglo con largo personalizado
        int[] arreglo = new int[largo];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnum.nextInt(5);
            //mostrar el arreglo
            System.out.println(arreglo[i]);
            //mostrar numeros pares e impares con una condicion para todos los i
            if (arreglo[i] % 2 == 0) {
                pares++;
            }
            // mostrar el numero pedido por el usuario y decir cuantas veces se repite
            if (arreglo[i] == numpedido) {
                nump++;
            }
            // para calcular el promedio debemos hacer un acumulador y sumar
            acumulador = acumulador + arreglo[i];
            // contamos los numeros primos
            int div = 0; // fijamos el numero de div por ciclo a 0
            for (int j = 1; j <= arreglo[i]; j++) { // este sera el for para que divida desde 1 hasta el numero del arreglo en la casilla i
                if (arreglo[i] % j == 0) {
                    div++;//cuenta los divisores del arreglo i 
                }
            }
            if (div == 2) {
                contador++;//cuenta los numeros primos por cada ciclo empezando desde 0 a el largo del arreglo
            }
        }
        // mostrar el numero maximo y minimo
        max = arreglo[0];
        min = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (max < arreglo[i]) {
                max = arreglo[i];
            }
            if (min > arreglo[i]) {
                min = arreglo[i];
            }
        }
        //salida de entradas preguntadas
        System.out.println("este es un arreglo de largo " + largo);
        System.out.println("tiene " + pares + " cantidad de pares y  " + (largo - pares) + " cantidad de impares");
        System.out.println("el numero que has pedido buscar es el n° " + numpedido + " el cual salio " + nump + " veces ");
        System.out.println("el promedio de el arreglo es " + ((double) acumulador / (double) largo));
        System.out.println("el numero mayor es " + max + " el numero menor es " + min);
        System.out.println("la cantidad de numeros primos es " + contador);

// PARA SABER SI ESTA EL NUMERO QUE EL USUARIO INGRESA HAY QUE PONER ESTE CODIGO
//        System.out.println("ingresa numero que quieres buscar ");
//        
//        numeropedido = teclado.nextInt();
//      AQUI COMIENZA LO DIVERTIDO:::
//        boolean numExit = false;
//        for(int i =0; i<arreglo.length; i++){
//            if(numeropedido==arreglo[i]){
//       numExit=true;
//     }
//        if(numExit){
//         System.out.println("el numero esta");
//     }else{
//         System.out.println("el numero no esta");
    }

}
