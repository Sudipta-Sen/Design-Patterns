package com.designpatterns.Creational.AbstractFactoryPattern.Product;

public class BMW implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling BMW car");
    }

    @Override
    public CarType getType() {
        return CarType.valueOf(this.getClass().getSimpleName());
    }
}