package com.github.kyriosdata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BananaTest {

    @Test
    public void ordenacao() {
        Banana nanica = new Banana();
        nanica.setTipo("Nanica");
        nanica.setPreco(2.0);

        Banana prata = new Banana();
        prata.setTipo("Prata");
        prata.setPreco(3.0);

        // Lista contendo as bananas
        Banana[] bananas = {prata, nanica};

        // Ordena as bananas usando Collections.sort
        Arrays.sort(bananas);

        // Verifica ordenacao correta
        assertEquals("Nanica", bananas[0].getTipo());
        assertEquals("Prata", bananas[1].getTipo());
    }
}
