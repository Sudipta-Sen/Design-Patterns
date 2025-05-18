package com.designpatterns.Behavioral.ObserverPattern.observable;

public class IPhone extends Product {

    public IPhone(int noOfStocks) {
        super("IPhone");
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