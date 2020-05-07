package Battleship;

public class Barco {
    private int x;
    private int y;

    private String estado;
    //existe => °
    //muerto =>#

    public Barco(int x, int y) {
        this.x = x;
        this.y = y;
        this.estado = "°";
    }

    public void hundir() {
        this.estado = "#";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

