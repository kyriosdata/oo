package com.github.kyriosdata.poo.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {

    private String nome;

    private List<Lance> lances = new ArrayList<>();

    public Partida(String nome) {
        this.nome = nome;
    }

    public void adicionaLance(Lance lance) {
        if (lance == null) {
            throw new IllegalArgumentException("exige lance");
        }

        lances.add(lance);
    }

    @Override
    public String toString() {
        return "Partida{" +
                "nome='" + nome + '\'' +
                ", lances=" + lances +
                '}';
    }
}
