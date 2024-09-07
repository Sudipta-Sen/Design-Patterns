package com.designpatterns.Creational.AbstractFactoryPattern.Product;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car");
    }

    @Override
    public CarType getType() {
        // One way can be 'return CarType.Sedan' also but it will take the car type autometically
        return CarType.valueOf(this.getClass().getSimpleName());
    }
}