package com.designpatterns.Structural.DecoratorPattern.BasePizzas;

public class Pepperoni extends BasePizza {
    @Override
    public int getCost() { return 300; }
    @Override
    public String getName() { return "Pepperoni"; }
}