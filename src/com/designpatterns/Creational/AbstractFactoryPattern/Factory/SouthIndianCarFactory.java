package com.designpatterns.Creational.AbstractFactoryPattern.Factory;


import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarSpecification;
public class SouthIndianCarFactory extends  CarFactory {
    public SouthIndianCarFactory(CarSpecification carSpecification) {
        super(carSpecification);
    }
}