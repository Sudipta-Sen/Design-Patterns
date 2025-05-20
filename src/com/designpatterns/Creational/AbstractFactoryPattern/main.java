package com.designpatterns.Creational.AbstractFactoryPattern;

import com.designpatterns.Creational.AbstractFactoryPattern.Factory.*;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.*;

public class main {
    
    public static void main(String[] args) {
        System.out.println("Create north and south indian car factory");
        CarFactory northCarFactory = new NorthIndianCarFactory(new NorthIndianCarSpecification());
        CarFactory southCarFactory = new SouthIndianCarFactory(new SouthIndianCarSpecification());

        System.out.println("\nRegister BMW in north indian car factory");
        northCarFactory.registerCar(CarType.BMW, BMW::new);
        /*
        BMW::new is a shorter lambda expression, equivalient lambda expression can be () -> new BMW()
        So we are calling registerCar with (CarType.BMW, () -> new BMW()) i.e we are doing --
        Supplier<Car> carSupplier = () -> new BMW(), which compiler internally translate to -- 
        
            Supplier<Car> carSupplier = new Supplier<Car>() {
                @Override
                public Car get() {
                    return new BMW();
                }
            };
        */

        System.out.println("Register Tesla in south indian car factory");
        southCarFactory.registerCar(CarType.Tesla, Tesla::new);

        northCarFactory.CreateAssemble(CarType.BMW);
        southCarFactory.CreateAssemble(CarType.Tesla);
        northCarFactory.CreateAssemble(CarType.HatchBack);

        System.out.println("\nRegister HatchBack in north indian car factory");
        northCarFactory.registerCar(CarType.HatchBack, HatchBack::new);
        
        northCarFactory.CreateAssemble(CarType.HatchBack);

        southCarFactory.CreateAssemble(CarType.Sedan);

        System.out.println("\nRegister Sedan in south indian car factory");
        southCarFactory.registerCar(CarType.Sedan, Sedan::new);
        southCarFactory.CreateAssemble(CarType.Sedan);
        

    }
}