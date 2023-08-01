package com.github.kyriosdata.poo.t21;

import java.util.List;
import java.util.Set;

public class Prato {

    private Preco preco;

    private String nome;

    private Set<DiaDaSemana> dias;

    /**
     * Verifica se o prato é fornecido no dia indicado.
     * @param dia Dia da semana em que supostamente o prato é fornecido.
     * @return {@code true} se e somente se o prato é fornecido no
     * dia indicado.
     */
    public boolean servidoEm(DiaDaSemana dia) {
        for (DiaDaSemana servido : dias) {
            if (servido == dia) {
                return true;
            }
        }

        return false;
    }
}
