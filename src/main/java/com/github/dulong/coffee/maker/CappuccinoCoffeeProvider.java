package com.github.dulong.coffee.maker;

import static com.github.dulong.coffee.maker.CoffeeType.CAPPUCCINO;

public class CappuccinoCoffeeProvider implements CoffeeProvider {

    @Override
    public void invoke(Pourable pourable) {
        pouringCappuccinoPowder(pourable);
    }

    private void pouringCappuccinoPowder(Pourable pourable) {
        // more secret recipe here
        pourable.pour(CAPPUCCINO.name());
    }

}
