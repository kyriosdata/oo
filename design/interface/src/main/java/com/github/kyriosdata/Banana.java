package com.github.kyriosdata;

public class Banana implements Comparable<Banana> {
    private String tipo;
    private double preco;

    @Override
    public int compareTo(Banana o) {
        return this.tipo.compareTo(o.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
