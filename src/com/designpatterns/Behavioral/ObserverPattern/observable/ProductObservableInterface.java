package com.designpatterns.Behavioral.ObserverPattern.observable;

import com.designpatterns.Behavioral.ObserverPattern.observer.Observer;


public interface ProductObservableInterface {
    void addObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObservable();
    String getProductName();
}