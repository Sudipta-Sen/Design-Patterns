package com.designpatterns.Structural.BridgePattern.Implementor;

public interface Device {
    void turnOn();
    void turnOff();
    boolean isOn();
    void setVolume(int volume);
}