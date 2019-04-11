package com.github.dulong.coffee.maker;

import static com.github.dulong.coffee.maker.CoffeeType.LATTE;

public class LatteCoffeeProvider implements CoffeeProvider {

    @Override
    public void invoke(Pourable pourable) {
        pouringLattePowder(pourable);
    }

    private void pouringLattePowder(Pourable pourable) {
        // more secret recipe here
        pourable.pour(LATTE.name());
    }

}
