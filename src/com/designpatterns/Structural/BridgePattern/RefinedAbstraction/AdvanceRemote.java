package com.designpatterns.Structural.BridgePattern.RefinedAbstraction;

import com.designpatterns.Structural.BridgePattern.Implementor.Device;
import com.designpatterns.Structural.BridgePattern.Abstraction.Remote;

public class AdvanceRemote extends Remote {
    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Mute the device");
        device.setVolume(0);
    }
}
