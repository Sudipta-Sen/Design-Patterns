package com.designpatterns.Creational.AbstractFactoryPattern.Product;

public class Tesla implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Tesla car");
    }

    @Override
    public CarType getType() {
        return CarType.valueOf(this.getClass().getSimpleName());
    }
}