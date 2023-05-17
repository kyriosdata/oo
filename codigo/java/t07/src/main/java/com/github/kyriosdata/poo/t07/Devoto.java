package com.github.kyriosdata.poo.t07;

public class Devoto {

    // REFLEXÃO: isso não quebra o encapsulamento
    // que deveria existir em religião?
    // Esta é uma autodeclaração
    public Devoto(Religiao religiao) {
        religiao.novoDevoto(this);
    }
}
