package com.github.kyriosdata.poo.t07;

import java.util.Objects;

public class Nota implements Comparable<Nota> {

    private double valor;
    private Prova prova;

    public Nota(Prova prova, double valor) {
        Objects.requireNonNull(prova);
        this.prova = prova;
        this.valor = valor;
    }

    @Override
    public int compareTo(Nota o) {
        if (prova == null || o.prova == null) {
            throw new IllegalArgumentException("prova desconhecida");
        }

        if (prova != o.prova) {
            throw new IllegalArgumentException("provas diferentes");
        }

        double delta = valor - o.valor;

        if (Math.abs(delta) < 0.01) {
            return 0;
        }

        return delta < 0 ? -1 : 1;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "valor=" + valor +
                '}';
    }
}
