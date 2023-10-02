package com.github.kyriosdata.oo;

import com.github.kyriosdata.Banana;

import java.util.Comparator;

/**
 * Compara bananas pelo tamanho do nome do tipo.
 * Ou seja, banana Prata vem depois de banana Maçã.
 */
public class BananaPorTamanhoDoNomeComparator implements Comparator<Banana> {
    @Override
    public int compare(Banana o1, Banana o2) {
        return Integer.compare(o1.getTipo().length(), o2.getTipo().length());
    }
}