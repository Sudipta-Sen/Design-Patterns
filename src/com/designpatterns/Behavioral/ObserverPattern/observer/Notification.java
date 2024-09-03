package com.designpatterns.Behavioral.ObserverPattern.observer;

import com.designpatterns.Behavioral.ObserverPattern.observable.ProductObservableInterface;

public class Notification implements Observer {
    User user;
    public Notification(User user) {
        this.user = user;
    }

    @Override
    public void update(ProductObservableInterface product) {
        System.out.println("Hi, "+user.getName()+" new notification comes in. "+product.getProductName()+" is now availble");
    }
}