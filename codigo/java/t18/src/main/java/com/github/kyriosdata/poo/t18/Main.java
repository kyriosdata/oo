package com.github.kyriosdata.poo.t18;

public class Main {
    public static void main(String[] args) {

        Partida partida = new Partida("Imortal");
        Jogador a = new Jogador("Fulano");
        Jogador b = new Jogador("Ciclano");

        partida.adicionaLance(new Lance(Peca.PEAO,a, new Posicao(1,1), new Posicao(1,2) ));
        partida.adicionaLance(new Lance(Peca.PEAO,a, new Posicao(1,1), new Posicao(1,2) ));

        System.out.println(partida);
    }
}