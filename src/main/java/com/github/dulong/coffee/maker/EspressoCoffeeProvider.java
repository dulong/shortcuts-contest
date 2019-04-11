package com.github.dulong.coffee.maker;

import static com.github.dulong.coffee.maker.CoffeeType.ESPRESSO;

public class EspressoCoffeeProvider implements CoffeeProvider {

    @Override
    public void invoke(Pourable pourable) {
        pouringEspressoPowder(pourable);
    }

    private void pouringEspressoPowder(Pourable pourable) {
        // more secret recipe here
        pourable.pour(ESPRESSO.name());
    }
}
