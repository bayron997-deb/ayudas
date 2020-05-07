package Ejemplos_de_1_clase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionConTryCatchSoloNumeros {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = 0;
        boolean f = false;
        while(!f){
            try {
                System.out.println("ingresa un numero");
                n = num.nextInt();
                System.out.println(n);
                f = true;

            } catch (InputMismatchException e) {
                num = new Scanner(System.in);
                System.out.println("error");
                f = false;
            }

        }
    }
}
