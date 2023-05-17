package com.github.kyriosdata.poo.t07;

import java.util.TreeSet;

public class Festa {

    // Melhor seria programar para interface e não para implementação.
    // Neste caso, a declaração seria "Set<Convidado>" em vez de
    // "TreeSet<Convidado>".
    private TreeSet<Convidado> convidados = new TreeSet<>();

    public void novoConvidado(Convidado convidado) {
        convidados.add(convidado);
    }

    public Festa(Convidado c) {
        convidados.add(c);
    }
}
