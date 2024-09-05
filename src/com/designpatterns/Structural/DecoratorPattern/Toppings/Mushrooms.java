package com.designpatterns.Structural.DecoratorPattern.Toppings;

import com.designpatterns.Structural.DecoratorPattern.BasePizzas.BasePizza;

public class Mushrooms extends ToppingDecorator {
    public Mushrooms(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 30;
    }

    @Override
    public String getName() {
        return basePizza.getName() + ", Mushrooms";
    }
}