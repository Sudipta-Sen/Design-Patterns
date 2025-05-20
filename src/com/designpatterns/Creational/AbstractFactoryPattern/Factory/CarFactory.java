package com.designpatterns.Creational.AbstractFactoryPattern.Factory;

import com.designpatterns.Creational.AbstractFactoryPattern.Product.Car;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarSpecification;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarType;
import java.util.*;
import java.util.function.Supplier;

public abstract class CarFactory {

    // Learn about supplier and lambda function in java
    Map<CarType, Supplier<Car>> carMap;
    private CarSpecification carSpecification;

    public CarFactory(CarSpecification carSpecification) {
        this.carSpecification = carSpecification;
        carMap = new HashMap<>();
    }

    public CarSpecification getCarSpecification() {
        return carSpecification;
    }

    public void registerCar(CarType carType, Supplier<Car> carSupplier) {
        carMap.put(carType, carSupplier);
    }

    public Car CreateCar(CarType carType) {
        if (getCarSpecification() == null) {
            throw new IllegalStateException("CarSpecification must be set before creating a car.");
        }

        Supplier<Car> carSupplier = carMap.get(carType);
        if (carSupplier == null) {
            throw new IllegalArgumentException(carType + " is not registered in "+carSpecification.getClass().getSimpleName());
        }

        System.out.println("\nCreating Car "+carType+" with "+carSpecification.getClass().getSimpleName());

        return carSupplier.get();
    }

    public void CreateAssemble(CarType carType) {
        try {
            Car newCar = this.CreateCar(carType);
            newCar.assemble();
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

