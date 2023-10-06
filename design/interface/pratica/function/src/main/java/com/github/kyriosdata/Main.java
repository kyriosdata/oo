package com.github.kyriosdata;

import java.util.function.Function;

public class Main implements Function<Double, Double> {

    @Override
    public Double apply(Double aDouble) {
        return Math.sqrt(aDouble);
    }

    static double raiz(double x) {
        return Math.sqrt(x);
    }

    double outro(double x) {
        return Math.sqrt(x);
    }
}