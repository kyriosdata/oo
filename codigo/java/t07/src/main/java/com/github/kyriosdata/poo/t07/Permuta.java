package com.github.kyriosdata.poo.t07;

public class Permuta {

    public static void permuta(String prefixo, String sequencia) {
        if (sequencia.length() == 0) {
            System.out.println(prefixo);
        } else {
            for (int i = 0; i < sequencia.length(); i++) {
                permuta(prefixo + sequencia.charAt(i),
                        sequencia.substring(0, i) + sequencia.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        permuta("", "abc");
    }
}
