package com.designpatterns.Behavioral.ObserverPattern.observable;

public class WashingMachine extends Product {
    int noOfStocks;

    public WashingMachine(int noOfStocks) {
        super("WashingMachine");
        this.noOfStocks = noOfStocks;
    }

    public void setData(int newStocks) {
        if(noOfStocks==0) {
            notifyObservable();
        }
        noOfStocks = noOfStocks + newStocks;
    }

    public int getData() {
        return noOfStocks;
    }

}