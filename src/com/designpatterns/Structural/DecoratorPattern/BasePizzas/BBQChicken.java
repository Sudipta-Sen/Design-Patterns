package com.designpatterns.Structural.DecoratorPattern.BasePizzas;

public class BBQChicken extends BasePizza {
    @Override
    public int getCost() { return 200; }
    @Override
    public String getName() { return "BBQChicken"; }
}