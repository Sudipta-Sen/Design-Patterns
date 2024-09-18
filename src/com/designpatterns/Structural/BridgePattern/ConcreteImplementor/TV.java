package com.designpatterns.Structural.BridgePattern.ConcreteImplementor;

import com.designpatterns.Structural.BridgePattern.Implementor.Device;

public class TV implements Device {
    private boolean on = false;
    private int volume = 10;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Turn on TV");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Turn off TV");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}