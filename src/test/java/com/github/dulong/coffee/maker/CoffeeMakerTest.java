package com.github.dulong.coffee.maker;


import static com.github.dulong.coffee.maker.CoffeeType.BLACK;
import static com.github.dulong.coffee.maker.CoffeeType.CAPPUCCINO;
import static com.github.dulong.coffee.maker.CoffeeType.ESPRESSO;
import static com.github.dulong.coffee.maker.CoffeeType.LATTE;
import static com.github.dulong.coffee.maker.CoffeeType.MOCHA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CoffeeMakerTest {

    private final List<String> contents = new ArrayList<>();

    private final Pourable pourable = contents::add;

    private final CoffeeMaker coffeeMaker = new CoffeeMaker();

    @Test
    public void makesCappuccino() {
        coffeeMaker.makeCoffee(pourable, new CappuccinoCoffeeProvider());

        assertThat(contents, contains(CAPPUCCINO.name(), CoffeeMaker.WATER));
    }

    @Test
    public void makesBlack() {
        coffeeMaker.makeCoffee(pourable, new BlackCoffeeProvider());

        assertThat(contents, contains(BLACK.name(), CoffeeMaker.WATER));
    }

    @Test
    public void makesMocha() {
        coffeeMaker.makeCoffee(pourable, new MochaCoffeeProvider());

        assertThat(contents, contains(MOCHA.name(), CoffeeMaker.WATER));
    }

    @Test
    public void makesLatte() {
        coffeeMaker.makeCoffee(pourable, new LatteCoffeeProvider());

        assertThat(contents, contains(LATTE.name(), CoffeeMaker.WATER));
    }

    @Test
    public void makesEspresso() {
        coffeeMaker.makeCoffee(pourable, new EspressoCoffeeProvider());

        assertThat(contents, contains(ESPRESSO.name(), CoffeeMaker.WATER));
    }

}
