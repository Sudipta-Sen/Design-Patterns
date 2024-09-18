package com.designpatterns.Structural.BridgePattern;

import com.designpatterns.Structural.BridgePattern.Abstraction.Remote;
import com.designpatterns.Structural.BridgePattern.Implementor.Device;
import com.designpatterns.Structural.BridgePattern.ConcreteImplementor.TV;
import com.designpatterns.Structural.BridgePattern.ConcreteImplementor.Radio;
import com.designpatterns.Structural.BridgePattern.RefinedAbstraction.AdvanceRemote;


public class client {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        Remote remote = new Remote(tv);
        AdvanceRemote advRemote = new AdvanceRemote(radio);

        remote.togglePower();
        remote.setVolume(10);

        advRemote.togglePower();
        advRemote.mute();
        advRemote.togglePower();

    }
}