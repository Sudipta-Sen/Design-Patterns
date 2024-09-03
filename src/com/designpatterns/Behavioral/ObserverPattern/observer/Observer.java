package com.designpatterns.Behavioral.ObserverPattern.observer;

import com.designpatterns.Behavioral.ObserverPattern.observable.ProductObservableInterface;

public interface Observer {
    void update(ProductObservableInterface product);
}