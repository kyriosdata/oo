package com.github.kyriosdata.poo.t07;

import java.util.List;

public class Religiao {
    private List<Devoto> devotos;

    public void novoDevoto(Devoto devoto) {
        devotos.add(devoto);
    }
}
