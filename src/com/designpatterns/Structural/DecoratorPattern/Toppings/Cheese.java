package com.designpatterns.Structural.DecoratorPattern.Toppings;

import com.designpatterns.Structural.DecoratorPattern.BasePizzas.BasePizza;

public class Cheese extends ToppingDecorator {
    public Cheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + 20;
    }

    @Override
    public String getName() {
        return basePizza.getName() + ", Cheese";
    }
}