package com.designpatterns.Behavioral.strategy;

import com.designpatterns.Behavioral.strategy.Vehicle.*;

public class main {
    public static void main(String[] args) {
        Vehicle v1 = new GoodsVehicle();
        Vehicle v2 = new OffRoadVehicle();
        Vehicle v3 = new SportsVehicle();

        v1.drive();
        v2.drive();
        v3.drive();
    }
}