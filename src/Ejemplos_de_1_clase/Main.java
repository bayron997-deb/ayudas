package Ejemplos_de_1_clase;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		Random rnum = new Random();

		int[] arr_gen;
		arr_gen = new int[15];
		int[] kino;
		kino = new int[arr_gen.length];
		int [][] mat=new int[3][5];

		for (int i = 0; i < arr_gen.length; i++) {
			arr_gen[i] = rnum.nextInt(50);
			for (int j=0;j<i; j++) {
				if(arr_gen[i]==arr_gen[(j)]){
					i--;

				}
			}
		}
		System.out.print("Arreglo: ");
		for(int i=0;i<arr_gen.length;i++){
			System.out.print("["+arr_gen[i]+"\t ]");
		}
		System.out.print("\n");


		System.out.print("Matriz: "+"\n");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<5;j++){
				if(i==0) {
					mat[i][j] = arr_gen[j];
				}if(i==1){
					mat[i][j] = arr_gen[j+5];
				}if(i==2){
					mat[i][j] = arr_gen[j+10];
				}
				System.out.print("["+mat[i][j]+"\t ]");
			}
			System.out.print("\n");
		}
	}
}





