package com.github.kyriosdata.poo.t07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IlustraNota {
    public static void main(String[] args) {
        Prova historia = new Prova();
        Nota n1 = new Nota(historia, 7.8);
        Nota n2 = new Nota(historia, 8.1);
        Nota n3 = new Nota(historia, 6.2);

        List<Nota> lista = new ArrayList<>();
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);
    }
}
