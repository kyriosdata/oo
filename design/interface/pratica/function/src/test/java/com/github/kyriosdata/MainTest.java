package com.github.kyriosdata;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void usandoMetodoEstatico() {
        Function<Double, Double> minhaRaiz = Main::raiz;
        assertEquals(3.0, minhaRaiz.apply(9.0));
    }

    @Test
    void usandoMetodoDeInstancia() {
        Function<Double, Double> outra = new Main()::outro;
        assertEquals(3.0, outra.apply(9.0));
    }

    @Test
    void usandoInterface() {
        Function<Double, Double> raiz = new Main();
        assertEquals(3.0, raiz.apply(9.0));
    }
}
