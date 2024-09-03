package com.designpatterns.Behavioral.ObserverPattern.observer;

import com.designpatterns.Behavioral.ObserverPattern.observable.Product;

public interface Observer {
    void update(Product product);
}