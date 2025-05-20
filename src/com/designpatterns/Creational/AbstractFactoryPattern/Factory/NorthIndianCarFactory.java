package com.designpatterns.Creational.AbstractFactoryPattern.Factory;

import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarSpecification;

public class NorthIndianCarFactory extends CarFactory {
    public NorthIndianCarFactory(CarSpecification carSpecification) {
        super(carSpecification);
    }
}