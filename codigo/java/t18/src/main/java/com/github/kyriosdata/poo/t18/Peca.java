package com.github.kyriosdata.poo.t18;

public enum Peca {

    CAVALO,
    PEAO,
    RAINHA,
    REI,
    BISPO,
    TORRE;

    @Override
    public String toString() {
        switch (this) {
            case PEAO:
                return "peão";
            default:
                return "ainda nao fiz";
        }
    }
}
