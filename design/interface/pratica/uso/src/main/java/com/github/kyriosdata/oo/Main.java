package com.github.kyriosdata.oo;

import com.github.kyriosdata.Banana;

import java.util.Arrays;

/**
 * Aplicação que não sabe como ordenar bananas.
 */
public class Main {
    public static void main(String[] args) {
        Banana[] bananas = getBananas();

        // Ordenação pelo nome, conforme definido na classe Banana
        Arrays.sort(bananas);

        // Apenas exibe na saída padrão
        Arrays.stream(bananas).forEach(b -> System.out.println(b.getTipo()));

        // Ordena pelo tamanho do nome
        Arrays.sort(bananas, new BananaPorTamanhoDoNomeComparator());
        Arrays.stream(bananas).forEach(b -> System.out.println(b.getTipo()));
    }

    public static Banana[] getBananas() {
        Banana nanica = new Banana();
        nanica.setTipo("Nanica");

        Banana prata = new Banana();
        prata.setTipo("Prata");

        Banana maca = new Banana();
        maca.setTipo("Maçã");

        return new Banana[]{ nanica, prata, maca };
    }
}