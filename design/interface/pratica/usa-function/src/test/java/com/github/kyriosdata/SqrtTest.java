package com.github.kyriosdata;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtTest {

    @Test
    void usandoClasseConhecidaEmTempoDeExecucao() {
        Function<Double, Double> minhaRaiz = getObject("com.github.kyriosdata.Main");
        assertEquals(3.0, minhaRaiz.apply(9.0));
    }

    private static Function<Double, Double> getObject(String classname) {
        try {
            Class<?> classe = Class.forName(classname);
            return (Function<Double,Double>)
                    classe.getDeclaredConstructors()[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
