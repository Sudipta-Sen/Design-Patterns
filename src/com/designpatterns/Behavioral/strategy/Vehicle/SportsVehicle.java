package com.designpatterns.Behavioral.strategy.Vehicle;

import com.designpatterns.Behavioral.strategy.DriveStrategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}