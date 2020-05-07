package Ejemplos_de_1_clase;

import java.util.Random;

public class Arreglordenadosinrepeticion {
    public static void main(String[] args) {
        Random rnum=new Random();
        int[] arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnum.nextInt(25)+1;
            for (int j=0;j<i; j++) {
                if(arr[i]==arr[(j)]){
                    i--;

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("[ "+arr[i]+" \t]");
        }
        System.out.print("\n");

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int aux = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;

                }
            }
        }
        System.out.println("---------------Ordenado Menor a Mayor--------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.print("[ "+arr[i]+" \t]");
        }
    }
}
