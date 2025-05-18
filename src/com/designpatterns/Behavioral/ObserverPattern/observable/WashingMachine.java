package com.designpatterns.Behavioral.ObserverPattern.observable;

public class WashingMachine extends Product {

    public WashingMachine(int noOfStocks) {
        super("WashingMachine");
        this.noOfStocks = noOfStocks;
    }

    @Override
    public void addStocks(int newStocks) {
        if(noOfStocks==0) {
            notifyObserver();
        }
        noOfStocks = noOfStocks + newStocks;
    }

}