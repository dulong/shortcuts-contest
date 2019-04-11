package com.github.dulong.calculator;

public class StatsCalculator {


    public int minOf(int... elements) {
        if(elements.length == 0) {
            throw new IllegalArgumentException("No element provided");
        }

        int min = Integer.MAX_VALUE;

        for (int element : elements) {
            if(element < min) {
                min = element;
            }
        }
        return min;
    }
}
