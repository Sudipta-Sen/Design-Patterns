package com.designpatterns.Creational.AbstractFactoryPattern.Factory;

import com.designpatterns.Creational.AbstractFactoryPattern.Product.Car;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarSpecification;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarType;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.SouthIndianCarSpecification;
import java.util.function.Supplier;

public class SouthIndianCarFactory implements  CarFactory {
    @Override
    public Car CreateCar(CarType carType) {
        Supplier<Car> carSupplier = carMap.get(carType);
        if(carSupplier == null) {
            throw new IllegalArgumentException(carType + " does not belongs to SouthIndianCarFactory");
        }

        // Read supplier interface to understand the get method
        return carSupplier.get();
    }

    @Override
    public CarSpecification CreateSpecification() {
        return new SouthIndianCarSpecification();
    }

    @Override
    public void registerCar(CarType carType, Supplier<Car> carSupplier) {
        carMap.put(carType, carSupplier);
    }
}