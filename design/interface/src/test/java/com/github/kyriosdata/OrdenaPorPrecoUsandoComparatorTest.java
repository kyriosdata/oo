package com.github.kyriosdata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdenaPorPrecoUsandoComparatorTest {

    @Test
    public void testaOrdenacaoDeBananaPorPrecoUsandoComparator() {
        Banana nanica = new Banana();
        nanica.setTipo("Nanica");
        nanica.setPreco(2.0);

        Banana prata = new Banana();
        prata.setTipo("Prata");
        prata.setPreco(3.0);

        // Lista contendo as bananas
        Banana[] bananas = {prata, nanica};

         // Ordena as bananas por preco
         Arrays.sort(bananas, new OrdenaPorPrecoUsandoComparator());

         // Verifica ordenacao correta
         assertEquals("Nanica", bananas[0].getTipo());
         assertEquals("Prata", bananas[1].getTipo());
    }

    // Comparador de exemplo
    // Será produzido um para cada critério de comparação
    static class OrdenaPorPrecoUsandoComparator implements Comparator<Banana> {
        @Override
        public int compare(Banana o1, Banana o2) {
            return Double.compare(o1.getPreco(), o2.getPreco());
        }
    }
}
