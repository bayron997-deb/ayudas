package Battleship;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    private String[][] tablero;
    private int dim;
    private int cantBarcos;
    private ArrayList<Barco> barcos;

    public Tablero(int dim, int cantBarcos) {
        this.dim = dim;
        this.cantBarcos = cantBarcos;
        this.tablero = new String[dim][dim];
        this.barcos = new ArrayList<>();
        llenarTablero();
        generarBarcos();
        sinc();
        mostrarTablero();
    }

    public Tablero(int dim, int cantBarcos, boolean n) {
        this.dim = dim;
        this.cantBarcos = cantBarcos;
        this.tablero = new String[dim][dim];
        this.barcos = new ArrayList<>();
        llenarTablero();
        generarBarcos();
        if (n) {
            sinc();
        }
        mostrarTablero();
    }

    public void llenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " ";
            }
        }
    }

    public void generarBarcos() {
        Random rnum = new Random();
        for (int i = 0; i < this.cantBarcos; i++) {
            Barco b;
            do {
                b = new Barco(rnum.nextInt(this.dim), rnum.nextInt(this.dim));
            } while (this.barcos.contains(b));
            this.barcos.add(b);
        }

    }
    public void sinc() {
        for (int i = 0; i < this.barcos.size(); i++) {
            tablero[barcos.get(i).getX()][barcos.get(i).getY()] = barcos.get(i).getEstado();
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public void ataque(Tablero t, int x, int y) {
        t.getTablero()[x][y] = "*";
        for (int i = 0; i < t.getBarcos().size(); i++) {
            if (t.getBarcos().get(i).getX() == x && t.getBarcos().get(i).getY() == y) {
                t.getBarcos().get(i).hundir();
                t.getTablero()[x][y] = "#";
            }
        }

    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public int getCantBarcos() {
        return cantBarcos;
    }

    public void setCantBarcos(int cantBarcos) {
        this.cantBarcos = cantBarcos;
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }

}

