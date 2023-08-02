package com.github.kyriosdata.poo.t18;

public class Posicao {

    private int x;

    private int y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Posicao{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
