package com.designpatterns.Creational.AbstractFactoryPattern.Product;

public class NorthIndianCarSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("NorthIndian Car Specification: Safety features compliant with local regulations.");
    }
}