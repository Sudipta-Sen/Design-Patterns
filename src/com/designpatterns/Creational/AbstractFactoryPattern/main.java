package com.designpatterns.Creational.AbstractFactoryPattern;

import com.designpatterns.Creational.AbstractFactoryPattern.Factory.*;
import com.designpatterns.Creational.AbstractFactoryPattern.Product.*;

public class main {
    static void CreateAssemble(CarFactory carFactory, CarType carType, String msg) {
        System.out.println(msg);
        try {
            Car newCar = carFactory.CreateCar(carType);
            newCar.assemble();
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("Create north and south indian car factory");
        CarFactory northCarFactory = new NorthIndianCarFactory();
        CarFactory southCarFactory = new SouthIndianCarFactory();

        System.out.println("\nRegister BMW in north indian car factory");
        //Sedan::new is a shorter lambda expression, equivalient lambda expression can be () -> new Sedan()
        northCarFactory.registerCar(CarType.BMW, BMW::new);

        System.out.println("Register Tesla in south indian car factory");
        southCarFactory.registerCar(CarType.Tesla, Tesla::new);

        System.out.println("\nCreate north indian specification");
        CarSpecification northSpecification = northCarFactory.CreateSpecification();
        northSpecification.display();

        System.out.println("\nCreate south indian specification");
        CarSpecification southSpecification = southCarFactory.CreateSpecification();
        southSpecification.display();

        
        CreateAssemble(northCarFactory, CarType.BMW, "\nCreate and assemble BMW in north indian car factory");
        CreateAssemble(southCarFactory, CarType.Tesla, "\nCreate and assemble Tesla in south indian car factory");
        CreateAssemble(northCarFactory, CarType.HatchBack, "\nCreate and assemble HatchBack in north indian car factory");

        System.out.println("\nRegister HatchBack in north indian car factory");
        northCarFactory.registerCar(CarType.HatchBack, HatchBack::new);
        CreateAssemble(northCarFactory, CarType.HatchBack, "\nTrying again, Create and assemble HatchBack in north indian car factory");

        CreateAssemble(southCarFactory, CarType.Sedan, "\nCreate and assemble Sedan in south indian car factory");

        System.out.println("\nRegister Sedan in south indian car factory");
        southCarFactory.registerCar(CarType.Sedan, Sedan::new);
        CreateAssemble(southCarFactory, CarType.Sedan, "\nTrying again, Create and assemble Sedan in south indian car factory");
        

    }
}