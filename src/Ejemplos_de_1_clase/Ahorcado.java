package Ejemplos_de_1_clase;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int p = 1;
        String[] palabras = {"palabra1", "nombre", "gato", "animal"};
        Random rnum = new Random();
        String seleccion = palabras[rnum.nextInt(palabras.length)];
        String oculto = "";
        for (int i = 0; i < seleccion.length(); i++) {
            oculto += "-";
        }
        StringBuilder palabra = new StringBuilder(oculto);
        System.out.println(oculto);
        while (p <= 50) {
            char letra = teclado.next().charAt(0);
            for (int i = 0; i < seleccion.length(); i++) {
                if (letra == seleccion.charAt(i)) {
                    palabra.setCharAt(i, letra);
                }
                for (int j = 1; j < i; j++) {
                    if (letra != seleccion.charAt(j)) {
                        p = p + 1;
                    }
                }
            }
            System.out.println(palabra.toString());
        }
    }
}

