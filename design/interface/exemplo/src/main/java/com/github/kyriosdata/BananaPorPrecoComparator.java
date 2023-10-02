package com.github.kyriosdata;

import java.util.Comparator;

/**
 * Implementa comparador de bananas por preço.
 */
public class BananaPorPrecoComparator implements Comparator<Banana> {
    @Override
    public int compare(Banana o1, Banana o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
