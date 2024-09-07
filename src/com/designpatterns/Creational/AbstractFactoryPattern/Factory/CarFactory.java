package com.designpatterns.Creational.AbstractFactoryPattern.Factory;

import com.designpatterns.Creational.AbstractFactoryPattern.Product.Car;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarSpecification;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.CarType;
import java.util.*;
import java.util.function.Supplier;

public interface CarFactory {

    // Learn about supplier and lambda function in java
    Map<CarType, Supplier<Car>> carMap = new HashMap<>();
    public Car CreateCar(CarType carType);
    public CarSpecification CreateSpecification();
    public void registerCar(CarType carType, Supplier<Car> carSupplier);
}

