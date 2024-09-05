package com.designpatterns.Structural.DecoratorPattern.Toppings;

import com.designpatterns.Structural.DecoratorPattern.BasePizzas.BasePizza;

// Here ToppingDecorator Is-a BasePizza amd also has a BasePizza
public abstract class ToppingDecorator extends BasePizza {
    BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost();
    }
    
    @Override
    public String getName() {
        return basePizza.getName();
    }
}