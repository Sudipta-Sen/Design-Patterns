package com.designpatterns.Behavioral.ObserverPattern.observable;

import com.designpatterns.Behavioral.ObserverPattern.observer.Observer;
import java.util.*;

public abstract class Product implements ProductObservableInterface {
    // If we use list then If the same User subscribes multiple times, we may end up notifying the same person multiple times.
    Set<Observer> observerList;
    String name;
    int noOfStocks;
    public Product(String name) {
        this.name = name;
        observerList = new HashSet<>();
    }

    @Override
    public void addObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observerList.remove(obj);
    }

    public String getObservableName() {
        return name;
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerList) {
           observer.update(this);
        }
    }

    public int getStocks() {
        return noOfStocks;
    }

    public abstract void addStocks(int newStocks);
}