package com.designpatterns.Behavioral.ObserverPattern.observable;

import com.designpatterns.Behavioral.ObserverPattern.observer.Observer;

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

    @Override
    public void notifyObservable() {
        for(Observer observer: observerList) {
           observer.update(this);
        }
    }

}