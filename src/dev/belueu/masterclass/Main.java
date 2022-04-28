package dev.belueu.masterclass;

import dev.belueu.masterclass.series.Series;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Series.nSum(10);
        System.out.println();
        Series.factorial(10);
        System.out.println();
        Series.fibonacci(11);
    }
}