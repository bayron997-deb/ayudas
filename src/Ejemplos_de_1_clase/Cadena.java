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
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 //contar palabras.exe

        String [] b = {"HOLAA","COMOESTAS","AMIGO","JAJJAA","EZBAYBAY"};
        
        int A=0,E=0,I=0,O=0,U=0,letras = 0;
        System.out.println("largo del arreglo es "+b.length);
        
      
      for(int i= 0; i < b.length; i++){
         
          for(int e = 0;e< b[i].length(); e++){
              letras++;
              switch (b[i].charAt(e)) { // case para las 5 letras
                  
                  case 'A':
                      A++;  
                      break;
                  case 'E':
                      E++;
                      break;
                  case 'I':
                      I++;
                      break;
                  case 'O':
                      O++;
                      break;
                  case 'U':
                      U++;
                      break;
                  default:
                      break;
              }
           
        }
       // segundo metodo 
//       if('A'== b[i].charAt(e)){       // ciclo palabra A
//               A++;
//            }else if('E'== b[i].charAt(e)){
//                E++; 
//            }else if('I'== b[i].charAt(e)){
//                I++;
//            }else if('O'== b[i].charAt(e)){
//                O++;
//            }else if('U'== b[i].charAt(e)) {
//                U++;
//           
//            }
       
    }
       System.out.println("la A se contiene "+A);
       System.out.println("la E se contiene "+E);
       System.out.println("la I se contiene "+I);
       System.out.println("la O se contiene "+O);
       System.out.println("la U se contiene "+U);
        System.out.println("el arreglo tiene en total "+(A+E+I+O+U)+" VOCALES ");
        System.out.println("tiene "+letras+" letras");
       //  System.out.println(b[1].length()); //numero de letras que tiene la palabra
       
     
        
}
}


     
// coontar letras
//contar vocales
//contar letra ingresada por usuario
