package com.github.kyriosdata.poo.t07;

public class TestaSomaNaturais {
    public static long somaNaturais(int n) {
        int c = 1;
        long s = 0;
        while (c <= n) {
            s = s + c;
            c = c + 1;
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(somaNaturais(5));
    }
}
