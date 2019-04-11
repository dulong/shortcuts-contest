package com.github.dulong.calculator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StatsCalculatorTest {
    
    StatsCalculator statsCalculator = new StatsCalculator();

    @Test
    public void minOfWithSomeElements() {
        int[] elements = {6, 9, 15, -2, 92, 11};
        assertThat(statsCalculator.minOf(elements), is(-2));
    }

    @Test
    public void minOfWithNoElements() {
        int[] elements = {};
        try {
            statsCalculator.minOf(elements);
            fail("expect " + IllegalArgumentException.class.getName());
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is("No element provided"));
        }
    }
}
