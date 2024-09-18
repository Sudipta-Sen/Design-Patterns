package com.designpatterns.Structural.BridgePattern.ConcreteImplementor;

import com.designpatterns.Structural.BridgePattern.Implementor.Device;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 10;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Turn on Radio");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Turn off radio");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to "+volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
