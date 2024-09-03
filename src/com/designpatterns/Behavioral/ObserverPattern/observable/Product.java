package com.designpatterns.Behavioral.ObserverPattern.observable;

import com.designpatterns.Behavioral.ObserverPattern.observer.Observer;
import java.util.*;

public abstract class Product implements ProductObservableInterface {
    List<Observer> observerList;
    String name;
    public Product(String name) {
        this.name = name;
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public void notifyObservable() {
        for(Observer observer: observerList) {
           observer.update(this);
        }
    }
}