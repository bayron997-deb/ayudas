/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.Scanner;

/**ENTRADA: USIARIO ELIGE TIPO DE PIZZA (GRANDE PEQUEÑO MEDIANO)
 *          PERMITE SELECCIONAR 4 TIPOS ED PIZZA 
 *          PERMITE AGREGAR INGREDIENTES EXTRA  (INDEFINIDO)
 * SALIDA : UN TIPO DE PIZZA, CON UN TIPO DE TAMAÑO Y LOS INGREDIENTES mas el total a pagar
 * PROCESO :  1 fijar todas las variables de los primeros 3 puntos
 *            2 para los primeros 3 puntos hacer un swith con los casos a generar
 *            3 calcular el total a pagar y hacer un ciclo si el usuario quiere editar la compra
 * 
 *
 * @author bayro
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // VARIABLES del tamaño
        int grande = 5000;
        int mediano = 1500;
        int pequeño = 1000;
        // variables sobre la pizArrayList<Integer> notasza y total pizza
        int pizza = 0; 
        int totalpizza = 0;
        int tipopizza = 0;
        //ingredientes
        int ingredientes = 0;
        int extraqueso = 0, pepperoni = 0, aceitunas = 0, piña = 0, sardinas = 0;
        int totalingredientes=0;
        //pago y loop 
        int totalpagar;
        int loop;
        
        //usuario pide el tamaño de pizza
      do{
          do{
        System.out.println(" ingrese el tamaño de su pizza| grande = 1| mediana = 2| grande = 3");
        pizza = teclado.nextInt(); 
      }while((pizza!=1)&& (pizza!= 2) && (pizza!=3));
         switch (pizza) {
                case 1:
                    System.out.println("usted eligio la pizza pequeña");
                    pizza = pequeño;
                    break;
                case 2:
                    System.out.println("usted eligio la pizza mediana");
                    pizza = mediano;
                    break;
                case 3:
                    System.out.println("usted eligio la pizza grande");
                    pizza = grande;   
                    break;     
                default:
                    pizza=0;
         }
         totalpizza = (pizza);
        System.out.println("-----------------------------------------------------------------------------------");
        // usuario elige tipo de pizza
       do{ 
        System.out.println(" ingrese el tipo de su pizza |mediterraneo = 1|vegetariana = 2|americana = 3|texana = 4");
        tipopizza = teclado.nextInt();
       }while((tipopizza!=1)&& (tipopizza!= 2) && (tipopizza!=3) && (tipopizza!=4));
         switch (tipopizza) {
                case 1:
                    System.out.println("usted eligio mediterraneo");
                    break;
                case 2:
                    System.out.println("usted eligio vegetariana");
                    break;
                case 3:
                    System.out.println("usted eligio ameriacana");
         
                    break;
                case 4:
                    System.out.println("usted eligi texana");
                    break;
                default:
                    tipopizza=0;
         }
        System.out.println("-----------------------------------------------------------------------------------");
 //usuario ingresa ingredientes
      do{
        System.out.println(" presione 1 para añadir ingredientes ");
        ingredientes = teclado.nextInt();
           }while((ingredientes!=1)&& (ingredientes!= 2) && (ingredientes!=3) && (ingredientes!=4) && (ingredientes!=5));
        switch (ingredientes) {
                case 1:
                    System.out.println("extra queso");
                    extraqueso = teclado.nextInt();       
                case 2:
                    System.out.println("pepperoni");
                    pepperoni = teclado.nextInt();         
                case 3:
                    System.out.println("aceitunas");
                    aceitunas = teclado.nextInt();   
                case 4:
                    System.out.println("piña");
                    piña = teclado.nextInt();   
                case 5:
                     System.out.println("sardinas");
                     sardinas = teclado.nextInt();
                     break;
                default:
                    ingredientes=0;
        }
        totalingredientes = ( (extraqueso*500) + (pepperoni*450) + (aceitunas*1000) + (piña*100) + (sardinas*1100));
        System.out.println("-----------------------------------------------------------------------------------");
        //muestra el detalle de compra y el valor total  
        System.out.println("usted va a llevar "+extraqueso+" de extraqueso");
        System.out.println("usted va a llevar "+pepperoni+" de pepperoni");
        System.out.println("usted va a llevar "+aceitunas+" de aceitunas");
        System.out.println("usted va a llevar "+piña+" de piña");
        System.out.println("usted va a llevar "+sardinas+" de sardinas");
        System.out.println("-----------------------------------------------------------------------------------");
        totalpagar = (  totalpizza + totalingredientes);
        System.out.println("su total a pagar es de  :"+totalpagar+" pesos");
        System.out.println("-----------------------------------------------------------------------------------");
         
          //loop para repetir operacion     
         System.out.println("ingrese 0 para finalizar");
         loop = teclado.nextInt();
      }while(loop != 0);
        System.out.println("gracias por su compra");
      
        
        
    
 }
    
}

