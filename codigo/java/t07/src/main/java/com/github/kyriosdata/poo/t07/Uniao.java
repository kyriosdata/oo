package com.github.kyriosdata.poo.t07;

import java.util.List;
import java.util.Objects;

public class Uniao {
    private List<Pessoa> filhos;
    private Pessoa[] parceiros;

    public void novoFilho(Pessoa filho) {
        filhos.add(filho);
    }

    public Uniao(Pessoa a, Pessoa b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        parceiros = new Pessoa[] { a, b };
    }
}
