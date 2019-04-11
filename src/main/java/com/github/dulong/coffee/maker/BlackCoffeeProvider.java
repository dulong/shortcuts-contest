package com.github.dulong.coffee.maker;

import static com.github.dulong.coffee.maker.CoffeeType.BLACK;

public class BlackCoffeeProvider implements CoffeeProvider {

    @Override
    public void invoke(Pourable pourable) {
        pouringBlackPowder(pourable);
    }

    private void pouringBlackPowder(Pourable pourable) {
        // more secret recipe here
        pourable.pour(BLACK.name());
    }

}
