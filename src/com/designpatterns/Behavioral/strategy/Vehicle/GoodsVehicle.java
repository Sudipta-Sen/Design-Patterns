package com.designpatterns.Behavioral.strategy.Vehicle;

import com.designpatterns.Behavioral.strategy.DriveStrategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}