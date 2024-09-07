package com.designpatterns.Creational.AbstractFactoryPattern.Product;

public class HatchBack implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling HatchBack car");
    }

    @Override
    public CarType getType() {
        return CarType.HatchBack;
    }
}