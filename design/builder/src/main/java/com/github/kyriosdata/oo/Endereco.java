package com.github.kyriosdata.oo;

import lombok.Builder;

@Builder
public class Endereco {
    private String setor;

    private String rua;

    private String cidade;

    private String estado;

    private String numero;

    private String bloco;

    private String quadra;

    private String edificio;

    private String andar;

    public Endereco(String setor, String rua, String cidade, String estado, String numero, String bloco, String quadra, String edificio, String andar) {
        this.setor = setor;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.bloco = bloco;
        this.quadra = quadra;
        this.edificio = edificio;
        this.andar = andar;
    }
}
