package com.designpatterns.Behavioral.ObserverPattern.observable;

public class IPhone extends Product {
    int noOfStocks;

    public IPhone(int noOfStocks) {
        super("IPhone");
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