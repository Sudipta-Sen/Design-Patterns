package com.designpatterns.Creational.AbstractFactoryPattern.Factory;

import com.designpatterns.Creational.AbstractFactoryPattern.Product.Car;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarSpecification;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarType;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.NorthIndianCarSpecification;
import java.util.function.Supplier;

public class NorthIndianCarFactory implements  CarFactory {
    @Override
    public Car CreateCar(CarType carType) {
        Supplier<Car> carSupplier = carMap.get(carType);
        if(carSupplier == null) {
            throw new IllegalArgumentException(carType + " does not belongs to NorthIndianCarFactory");
        }

        // Read supplier interface to understand the get method
        return carSupplier.get();
    }

    @Override
    public CarSpecification CreateSpecification() {
        return new NorthIndianCarSpecification();
    }

    @Override
    public void registerCar(CarType carType, Supplier<Car> carSupplier) {
        carMap.put(carType, carSupplier);
    }
}