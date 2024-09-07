package com.designpatterns.Creational.AbstractFactoryPattern.Product;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car");
    }

    @Override
    public CarType getType() {
        return CarType.Sedan;
    }
}