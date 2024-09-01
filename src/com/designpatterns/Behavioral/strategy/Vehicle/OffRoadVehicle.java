package com.designpatterns.Behavioral.strategy.Vehicle;

import com.designpatterns.Behavioral.strategy.DriveStrategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}