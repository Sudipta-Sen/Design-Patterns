package com.designpatterns.Structural.DecoratorPattern.Toppings;

import com.designpatterns.Structural.DecoratorPattern.BasePizzas.BasePizza;

public class Olives extends ToppingDecorator {
    public Olives(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 50;
    }

    @Override
    public String getName() {
        return basePizza.getName() + ", Olives";
    }
}