package Battleship;

import java.util.Scanner;

public class Battleshipmain {
    public static void main(String[] args) {

        Tablero t = new Tablero(10, 10, true);
        System.out.println("");
        Tablero a = new Tablero(10, 10, false);
        System.out.println(a.getBarcos().get(0).getX());
        System.out.println(a.getBarcos().get(0).getY());
        System.out.println("Ingresa una coordenada");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        t.ataque(a, x, y);
        a.mostrarTablero();

    }
}

