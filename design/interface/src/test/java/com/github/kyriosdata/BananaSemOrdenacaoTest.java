package com.github.kyriosdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BananaSemOrdenacaoTest {

    @Test
    public void ordenacao() {
        BananaSemOrdenacao nanica = new BananaSemOrdenacao();
        nanica.setTipo("Nanica");
        nanica.setPreco(2.0);

        BananaSemOrdenacao prata = new BananaSemOrdenacao();
        prata.setTipo("Prata");
        prata.setPreco(3.0);

        // Lista contendo as bananas
        BananaSemOrdenacao[] bananas = {prata, nanica};

        // Ordena as bananas por nome
        // Ordenação por seleção (menor fica ordenado a cada iteração)
        for (int i = 0; i < bananas.length; i++) {
            for (int j = i + 1; j < bananas.length; j++) {
                if (bananas[i].getTipo().compareTo(bananas[j].getTipo()) > 0) {
                    BananaSemOrdenacao aux = bananas[i];
                    bananas[i] = bananas[j];
                    bananas[j] = aux;
                }
            }
        }

        // Verificando que a ordenacao foi realizada corretamente
        assertEquals("Nanica", bananas[0].getTipo());
        assertEquals("Prata", bananas[1].getTipo());
    }

    @Test
    public void testar() {
        BananaSemOrdenacao banana = new BananaSemOrdenacao();
        banana.setTipo("Nanica");
        banana.setPreco(2.0);

        assertEquals("Nanica", banana.getTipo());
        assertEquals(2.0, banana.getPreco(), 0.0001);
    }
}
