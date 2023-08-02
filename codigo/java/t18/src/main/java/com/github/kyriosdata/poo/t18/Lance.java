package com.github.kyriosdata.poo.t18;

public class Lance {

    private Peca peca;

    private Jogador jogador;

    private Posicao origem;
    private Posicao destino;

    public Lance(Peca peca, Jogador jogador, Posicao origem, Posicao destino) {
        this.peca = peca;
        this.jogador = jogador;
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Lance{" +
                "peca=" + peca +
                ", jogador=" + jogador +
                ", origem=" + origem +
                ", destino=" + destino +
                '}';
    }
}
