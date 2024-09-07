package com.designpatterns.Creational.AbstractFactoryPattern.Product;

public class SouthIndianCarSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("SouthIndian Car Specification: Safety features compliant with local regulations.");
    }
}