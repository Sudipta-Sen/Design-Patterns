package com.designpatterns.Structural.BridgePattern.Abstraction;

import com.designpatterns.Structural.BridgePattern.Implementor.Device;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if(device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void setVolume(int volume) {
        System.out.println("Change volume with basic remote");
        device.setVolume(volume);
    }
}
