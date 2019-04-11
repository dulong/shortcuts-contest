package com.github.dulong.coffee.maker;

import static com.github.dulong.coffee.maker.CoffeeType.MOCHA;

public class MochaCoffeeProvider implements CoffeeProvider {

    @Override
    public void invoke(Pourable pourable) {
        pouringMochaPowder(pourable);
    }

    private void pouringMochaPowder(Pourable pourable) {
        // more secret recipe here
        pourable.pour(MOCHA.name());
    }

}
