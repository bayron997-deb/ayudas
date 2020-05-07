/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_1_clase;

import java.util.*;



/** ENTRADA: ingresar n-ésimo termino ingresado por teclado
 *  SALIDA: 1. El n-ésimo término
            2. El promedio hasta el n-ésimo término
            3. La sumatoria de 0 hasta el n-ésimo término.
            4. Verifica que la entrada sea siempre un número mayor a 0.
            5. Permite que se ejecute el programa tantas veces como lo desee el usuario.
 *  PROCESO: 1 para calcular el n-ésimo termino se hace un contador que va desde 1 hasta el numero ingresado y aplicar formula;
 *           2 para calcular promedio por cada vez que se ejecute el programa el contador se suma uno, luego sumar todos los valores y dividir pr el contador
 *           3 
 *           4 para verificar se una un do while con la condicion que lo repita mientras enesimo sea < a 0
 *           5 para ejecurarlo otra vez se hace un do while que al final a ingresar el numero 0 se ejecute otra vez si es distinto se termina el programa.
 * @author bayro
 */
public class TerminoEnesimo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //declaracion de variablwa
        double nesimo;
        double termino=0;
        double sumatotal;
        int n = 0;
        
        //ciclo para repetir programa
        do{
      
        //pregunta cantidad de numeros enesimos
       do{
        System.out.println("ingrese termino n-ésimo");
        nesimo = teclado.nextInt();
       }while(nesimo<0);
       do{
           termino=(nesimo-1)/(nesimo+1);
           System.out.println(termino);
           termino++;
           nesimo--;
           
       }while(nesimo!=0);
       
      
       

      //pregunta para repetir programa
       do{
        System.out.println("para calcular nuevamente presione 1");
        nesimo = teclado.nextInt();
       }while(n>0);
       
    }while(n==1);
    
}
}
