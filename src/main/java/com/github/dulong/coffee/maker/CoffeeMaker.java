package com.github.dulong.coffee.maker;

public class CoffeeMaker {
    static final String WATER = "Water";

    public void makeCoffee(
            Pourable pourable, CoffeeProvider coffeeProvider
    ) {
        coffeeProvider.invoke(pourable);

        pouringBoilingWater(pourable);
    }

    private void pouringBoilingWater(Pourable pourable) {
        pourable.pour(WATER);
    }

}
