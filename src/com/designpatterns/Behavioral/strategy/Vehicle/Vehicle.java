package com.designpatterns.Behavioral.strategy.Vehicle;

import com.designpatterns.Behavioral.strategy.DriveStrategy.DriveStrategy;

public abstract class Vehicle {
    DriveStrategy driveObject;

    // this is known as contructor injection
    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }

    public void drive() {
        driveObject.drive();
    }
}